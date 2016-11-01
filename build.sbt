organization in ThisBuild := "lnu.4dv609.ecommerce"

// the Scala version that will be used for cross-compiled libraries
scalaVersion in ThisBuild := "2.11.8"

val immutables = "org.immutables" % "value" % "2.1.14"
val mockito = "org.mockito" % "mockito-core" % "1.10.19"

//*****************************************
lazy val itemApi = project("item-api")
  .settings(
    version := "1.0-SNAPSHOT",
    libraryDependencies ++= {
	val akkaV = "2.4.10"
	Seq(
	  lagomJavadslApi,  immutables,
      lagomJavadslImmutables, lagomJavadslJackson,
	  "com.typesafe.akka" %% "akka-actor" % akkaV,
    "com.typesafe.akka" %% "akka-http-experimental" % akkaV,
    "com.typesafe.akka" %% "akka-http-testkit" % akkaV)}
  )

lazy val itemImpl = project("item-impl")
  .enablePlugins(LagomJava)
  .settings(
    version := "1.0-SNAPSHOT",
    libraryDependencies ++= Seq(lagomJavadslPersistence, immutables,
      lagomJavadslImmutables, lagomJavadslTestKit
    )
  )
  .settings(lagomForkedTestSettings: _*) 
  .dependsOn(itemApi)
//*****************************************

def project(id: String) = Project(id, base = file(id))
  .settings(eclipseSettings: _*)
  .settings(javacOptions in compile ++= Seq("-encoding", "UTF-8", "-source", "1.8", "-target", "1.8", "-Xlint:unchecked", "-Xlint:deprecation"))
  .settings(jacksonParameterNamesJavacSettings: _*) // applying it to every project even if not strictly needed.


// See https://github.com/FasterXML/jackson-module-parameter-names
lazy val jacksonParameterNamesJavacSettings = Seq(
  javacOptions in compile += "-parameters"
)

// Configuration of sbteclipse
// Needed for importing the project into Eclipse
lazy val eclipseSettings = Seq(
  EclipseKeys.projectFlavor := EclipseProjectFlavor.Java,
  EclipseKeys.withBundledScalaContainers := false,
  EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.Resource,
  EclipseKeys.eclipseOutput := Some(".target"),
  EclipseKeys.withSource := true,
  EclipseKeys.withJavadoc := true,
  // avoid some scala specific source directories
  unmanagedSourceDirectories in Compile := Seq((javaSource in Compile).value),
  unmanagedSourceDirectories in Test := Seq((javaSource in Test).value)
)

// do not delete database files on start
lagomCassandraCleanOnStart in ThisBuild := false



