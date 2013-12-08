package com.eldritchideen.exercises

/**
 * Created by sjc on 7/12/13.
 */

import org.scalatest.{Matchers, FunSuite}
import org.scalatest.Assertions._

class Chapter3Test extends FunSuite with Matchers{

  test("Exercise 1 Test") {
    val a = Chapter3.randInts(10)
    assert(a.length == 10)

    val min = a.min
    val max = a.max

    assert(min >= 0 && max < 10)
  }

  test("swapElements Test") {
    val input = Array[Int](1,2,3,4,5)
    val swapped = Array[Int](2,1,4,3,5)

    Chapter3.swapElements(input) should equal(swapped)
    Chapter3.swapElements2(input) should equal(swapped)
  }

  test("Partition Array by negative -> positive") {
    val input = Array(-3, 2, -1, 0, 5, 6, -10, 100)
    val out = Array(2, 5, 6, 100, -3, -1, 0, -10)

    Chapter3.partitionArray(input) should equal(out)
  }

  test("Average of array entries") {
    val input = Array(1.0, 5.0, 6.0)

    Chapter3.computeAverage(input) should equal(4)
  }

  test("Sorted and Reverse") {
    val input = Array[Int](1,3,2,4,5)
    val res = Array(5,4,3,2,1)

    Chapter3.sortedAndReverse(input) should equal(res)
  }

  test("Return only unique elements") {
    val input = Array[Int](1,1,4,5,6,6,7)

    Chapter3.removeDups(input) should equal(Array(1,4,5,6,7))
  }

  test("Time zones") {
    val timeZones = Chapter3.ex9

    timeZones should contain("Denver")

  }

}
