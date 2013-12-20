package com.eldritchideen.exercises

import org.scalatest.FunSuite

/**
 * Created by sjc on 19/12/13.
 */
class Chapter6Test extends FunSuite {

  test("Conversions") {
    assert(Conversions.milesToKilometers(10).round === 16)
  }

  test("Point companion object") {
    val p = Point(1,2)
    assert(p.x === 1)
    assert(p.y === 2)
  }

  test("Card suite is red") {
    val spades = CardSuites.spades
    val hearts = CardSuites.hearts
    assert(!CardSuitesHelper.isRed(spades))
    assert(CardSuitesHelper.isRed(hearts))
  }

}
