enablePlugins(ScalaJSPlugin)
//enablePlugins(ScalaJSBundlerPlugin)

name := "Scala.js Spike"
scalaVersion := "2.12.1" // or any other Scala version >= 2.10.2

// This is an application with a main method
//scalaJSUseMainModuleInitializer := true

scalaJSModuleKind := ModuleKind.CommonJSModule

jsDependencies += ProvidedJS / "jsexamplemodule.js"

//npmDependencies in Compile += "left-pad" -> "1.1.3"

libraryDependencies += "com.lihaoyi" %%% "utest" % "0.4.5" % "test"

testFrameworks += new TestFramework("utest.runner.Framework")