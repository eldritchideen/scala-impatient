package com.eldritchideen.exercises

import org.scalatest.{Matchers, FunSuite}
import com.eldritchideen.exercises.Chapter12._

/**
 * Created by sjc on 6/01/14.
 */
class Chapter12Test extends FunSuite with Matchers {

  test("Max using reduceLeft") {
    maxUsingReduce(Array(1, 7, 3, 9, 2, 10)) should equal(10)
  }

  test("Factorial") {
    factorial(6) should equal(720)
  }

  test("Adjust to Pairs") {
    adjustToPairs(_ * _)((6,7)) should equal(42)
  }

  test("checkStringLengths") {
    checkStringLengths(Array("Foo", "It", "Scala"), Array(3,2,5)) should equal(true)
  }
}
