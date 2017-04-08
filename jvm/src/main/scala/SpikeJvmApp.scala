package spike.webapp.jvm

object SpikeJvmApp {
  def main(args: Array[String]): Unit = {
    import spike.webapp.shared.PiCalc._
    //println("Hello world!")
    //println(s"Passing 'blah' to Js : ${JsExampleModule.testFunc("blah")}")
    val nIterations = 1000000
    println(s"Pi approximation for ${nIterations} iterations : ${time(calculatePi(nIterations))}")
  }
}