package com.eldritchideen.exercises

import org.scalatest.{Matchers, FunSuite}

/**
 * Created by sjc on 3/01/14.
 */

// Test data
trait Monies {
  val m0 = new Money(0,0)
  val m1 = new Money(1,50)
  val m2 = new Money(0,75)
  val m3 = new Money(3,0)
}

class Chapter11Test extends FunSuite with Matchers with Monies {



  test("creation of Money") {
    assert(m0.dollars === 0)
    assert(m0.cents === 0)
    assert(m1.dollars === 1)
    assert(m1.cents === 50)
  }

  test("Adding money together") {
    (m1 + m2) should equal(new Money(2,25))
  }

  test("Subtracting money") {
    (m1 - m2) should equal(new Money(0,75))
    (m1 - m3) should equal(new Money(0,0))
  }

  test("Comparison of monetary amounts") {
    (m2 < m1) should equal(true)
    (m3 < m1) should equal(false)
  }

}
