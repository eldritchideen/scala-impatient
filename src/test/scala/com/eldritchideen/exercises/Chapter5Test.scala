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

  test("Time2") {
    val t1 = new Time2(10, 30)
    val t2 = new Time2(6, 30)
    val t3 = new Time2(10, 35)
    val t4 = new Time2(10,19)

    assert(t1.before(t3))
    assert(!t1.before(t2))
    assert(t4.before(t1))
  }

  test("Java Beans") {
    // Test being able to call java beans setters and getters.
    val s = new Student("Steve", 12345)
    s.setId(6789)
    assert(s.getId() == 6789)
  }
}
