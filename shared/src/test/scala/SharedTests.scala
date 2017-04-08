package test.utest.examples.examples

import utest._

object SharedTests extends TestSuite {
  val tests = this {
    'pitest{
      import spike.webapp.shared.PiCalc
      val res = PiCalc.calculatePi(10000)
      assert(res > 2.0)
      assert(res < 4.0)
      assert(res > 3.0)
      assert(res < 3.5)
      assert(res > 3.1)
      assert(res < 3.2)
    }
  }
}
