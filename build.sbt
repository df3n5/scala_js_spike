enablePlugins(ScalaJSPlugin)
//enablePlugins(ScalaJSBundlerPlugin)

name := "Scala.js Spike"
scalaVersion := "2.12.1" // or any other Scala version >= 2.10.2

// This is an application with a main method
//scalaJSUseMainModuleInitializer := true

scalaJSModuleKind := ModuleKind.CommonJSModule

jsDependencies += ProvidedJS / "jsexamplemodule.js"

//npmDependencies in Compile += "left-pad" -> "1.1.3"


testFrameworks += new TestFramework("utest.runner.Framework")

coverageEnabled := true


// Jvm AND JS support here
lazy val root = project.in(file(".")).
  aggregate(spikeJS, spikeJVM).
  settings(
    publish := {},
    publishLocal := {}
  )

lazy val spike = crossProject.in(file(".")).
  settings(
    name := "spike",
    version := "0.1-SNAPSHOT",
    libraryDependencies += "com.lihaoyi" %%% "utest" % "0.4.5" % "test",
    testFrameworks += new TestFramework("utest.runner.Framework")
  ).
  jvmSettings(
    // Add JVM-specific settings here
  ).
  jsSettings(
    // Add JS-specific settings here
  )

lazy val spikeJVM = spike.jvm
lazy val spikeJS = spike.js