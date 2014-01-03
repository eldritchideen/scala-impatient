package com.eldritchideen.exercises

import org.scalatest.{Matchers, FunSuite}

/**
 * Created by sjc on 3/01/14.
 */
class Chapter11Test extends FunSuite with Matchers {

  test("creation of Money") {
    val m1 = new Money(0,0)
    val m2 = new Money(1,50)

    assert(m1.dollars === 0)
    assert(m1.cents === 0)
    assert(m2.dollars === 1)
    assert(m2.cents === 50)
  }

  test("Adding money together") {
    val m1 = new Money(1,50)
    val m2 = new Money(0,75)

    (m1 + m2) should equal(new Money(2,25))
  }

  test("Subtracting money") {
    val m1 = new Money(1,50)
    val m2 = new Money(0,75)
    val m3 = new Money(3,0)

    (m1 - m2) should equal(new Money(0,75))
    (m1 - m3) should equal(new Money(0,0))
  }

}
