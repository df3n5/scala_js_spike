package spike.webapp.shared

import scala.util.Random

object PiCalc {
  def time[R](block: => R): R = {
    val t0 = System.currentTimeMillis()
    val result = block    // call-by-name
    val t1 = System.currentTimeMillis()
    println("Elapsed time: " + (t1 - t0) + "ms")
    result
  }

  def calculatePi(nIterations: Int) : Double = {
    var nHits = 0
    for (i <- 0 to nIterations) {
      val x = Random.nextDouble()
      val y = Random.nextDouble()
      val d = x*x + y*y
      if (d <= 1.0) {
        nHits += 1
      }
    }

    (nHits.toDouble / nIterations.toDouble) * 4.0
  }
}
