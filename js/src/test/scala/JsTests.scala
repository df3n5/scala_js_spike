package test.utest.examples.examples

import utest._

object JsTests extends TestSuite {
  val tests = this {
    'test1{
      import spike.webapp.js.SimpleModule._
      assert(containsMe("me"))
      assert(!containsMe("blah"))
      assert(!containsMe("Does not contain m e"))
    }
  }
}
