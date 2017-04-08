package spike.webapp

import scala.scalajs.js
import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("./classes/jsexamplemodule", JSImport.Namespace)
object JsExampleModule extends js.Object {
  def testFunc(arg: String) : String = js.native
}

object SpikeApp extends JSApp {
  def main(): Unit = {
    println("Hello world!")
    println(s"Passing 'blah' to Js : ${JsExampleModule.testFunc("blah")}")
  }
}
