enablePlugins(ScalaJSPlugin)
//enablePlugins(ScalaJSBundlerPlugin)

name := "Scala.js Spike"
// or any other Scala version >= 2.10.2

// This is an application with a main method

//scalaJSModuleKind := ModuleKind.CommonJSModule

//jsDependencies += ProvidedJS / "jsexamplemodule.js"

//npmDependencies in Compile += "left-pad" -> "1.1.3"

testFrameworks += new TestFramework("utest.runner.Framework")

coverageEnabled := true


// Jvm AND JS support here
lazy val root = project.in(file(".")).
  aggregate(spikeJS, spikeJVM).
  settings(
    publish := {},
    publishLocal := {},
    scalaVersion := "2.12.1"
  )

val browser = org.scalajs.jsenv.selenium.Chrome()

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
    //scalaJSModuleKind := ModuleKind.CommonJSModule,
    scalaJSUseMainModuleInitializer := true,
    libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.1",
    // Apply to the 'run' command
    jsEnv := new org.scalajs.jsenv.selenium.SeleniumJSEnv(browser) ,
    // Apply to tests
    jsEnv in Test := new org.scalajs.jsenv.selenium.SeleniumJSEnv(browser)
  )

lazy val spikeJVM = spike.jvm
lazy val spikeJS = spike.js