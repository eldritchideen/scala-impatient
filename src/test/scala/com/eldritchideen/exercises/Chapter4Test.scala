package com.eldritchideen.exercises

/**
 * Created by sjc on 7/12/13.
 */

import org.scalatest.{Matchers, FunSuite}
import org.scalatest.Assertions
import java.util.Scanner
import java.io.File
import scala.collection.mutable.ArrayBuffer

class Chapter4Test extends FunSuite with Matchers {

  test("Discount is applied") {
    val products = Map("Nexus 7" -> 450, "iPad" -> 1000)

    val discounted = Chapter4.tenPercentOff(products)

    assert(discounted("iPad") === 900)
  }

  test("Mutable word count") {
    val in = new Scanner(Thread.currentThread().getContextClassLoader
      .getResourceAsStream("com/eldritchideen/exercises/myfile.txt"))
    val wordCount = Chapter4.countWordsMutable(in)
    assert(wordCount.get("brown").get === 2)
  }

  test("Immutable word count") {
    val in = new Scanner(Thread.currentThread().getContextClassLoader
      .getResourceAsStream("com/eldritchideen/exercises/myfile.txt"))
    val wordCount = Chapter4.countWordsMutable(in)
    assert(wordCount.get("brown").get === 2)
    assert(wordCount.size === 11)

  }

  test("Sorted word count") {
    val in = new Scanner(Thread.currentThread().getContextClassLoader
      .getResourceAsStream("com/eldritchideen/exercises/myfile.txt"))
    val in2 = new Scanner(Thread.currentThread().getContextClassLoader
      .getResourceAsStream("com/eldritchideen/exercises/myfile.txt"))
    val words = ArrayBuffer[String]()
    while (in2.hasNext) {
      words += in2.next()
    }
    val wordCount = Chapter4.countWordsSorted(in)
    assert(wordCount.get("brown").get === 2)
    assert(wordCount.size === 11)
    assert(words.sorted.head === wordCount.keys.head)
    assert(words.sorted.last === wordCount.keys.last)
  }

  test("minmax") {
    val values = Array(3, 1, 6, 10)
    assert(Chapter4.minmax(values) === (1,10))
  }

  test("lteqgt") {
    val values = Array(1,2,3,4,5,6,7)
    assert(Chapter4.lteqgt(values, 4) === (3,1,3))
  }
}
