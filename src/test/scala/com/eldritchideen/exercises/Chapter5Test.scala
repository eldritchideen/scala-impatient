package com.eldritchideen.exercises

import org.scalatest.FunSuite

/**
 * Created by sjc on 8/12/13.
 */
class Chapter5Test extends FunSuite {

  test("Time") {
    val t1 = new Time(10, 30)
    val t2 = new Time(6, 30)
    val t3 = new Time(10, 35)
    val t4 = new Time(10,19)

    assert(t1.before(t3))
    assert(!t1.before(t2))
    assert(t4.before(t1))
  }

}
