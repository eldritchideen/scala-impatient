package com.eldritchideen.exercises

/**
 * Created by sjc on 7/12/13.
 */

import org.scalatest.{Matchers, FunSuite}
import org.scalatest.Assertions
import java.util.Scanner
import java.io.File

class Chapter4Test extends  FunSuite with Matchers{

  val in = new Scanner(Thread.currentThread().getContextClassLoader
                  .getResourceAsStream("com/eldritchideen/exercises/myfile.txt"))

  test("Discount is applied") {
    val products = Map("Nexus 7" -> 450, "iPad" -> 1000)

    val discounted = Chapter4.tenPercentOff(products)

    assert(discounted("iPad") === 900)
  }

  test("Mutable word count") {
    val wordCount = Chapter4.countWordsMutable(in)
    assert(wordCount.get("brown").get === 2)
  }

}
