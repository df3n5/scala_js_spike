package spike.webapp

import scala.scalajs.js
import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.{JSExport, JSExportTopLevel, JSImport}

@js.native
@JSImport("./classes/jsexamplemodule", JSImport.Namespace)
object JsExampleModule extends js.Object {
  def testFunc(arg: String) : String = js.native
}

@JSExportTopLevel("testScalaObj")
object JsExportModule {
  @JSExport
  def testScalaFunc(arg: String) : String = {
    JsExampleModule.testFunc(arg)
  }
}

// For coverage purposes
object SimpleModule {
  def containsMe(arg: String) : Boolean = {
    arg.contains("me")
  }
}



object SpikeApp extends JSApp {
  def main(): Unit = {
    //println("Hello world!")
    //println(s"Passing 'blah' to Js : ${JsExampleModule.testFunc("blah")}")
  }
}
