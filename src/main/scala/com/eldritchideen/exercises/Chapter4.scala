package com.eldritchideen.exercises

/**
 * Created by sjc on 7/12/13.
 */

import scala.collection._
import scala.collection.immutable.HashMap

object Chapter4 {

  // Exercise 1
  def tenPercentOff(products: Map[String, Int]) = {
    for ((product, price) <- products) yield (product, price * 0.9)
  }

  // Exercise 2
  // Count word frequency with a mutable map
  def countWordsMutable(in: java.util.Scanner): Map[String, Int] = {
    val res = new mutable.HashMap[String, Int]()
    while (in.hasNext) {
      val s = in.next()
      res(s) = res.getOrElse(s, 0) + 1
    }
    res
  }

  // Exercise 3
  // Same task but with immutable map
  def countWordsImmutable(in: java.util.Scanner): Map[String, Int] = {
    var res = new immutable.HashMap[String, Int]
    while (in.hasNext) {
      val s = in.next()
      res = res + (s -> (res.getOrElse(s, 0) + 1))
    }
    res
  }

  // Exercise 4
  // Same but ensure the keys are in sorted order.
  def countWordsSorted(in: java.util.Scanner): Map[String, Int] = {
    var res = immutable.SortedMap[String, Int]()
    while (in.hasNext) {
      val s = in.next()
      res = res + (s -> (res.getOrElse(s, 0) + 1))
    }
    res
  }


  // Exercise 8
  // Return pair (min, max) of elements in the array
  def minmax(values: Array[Int]) = {
    (values.min, values.max)
  }

  // Exercise 9
  // Return a triple containing the counts of values less than, equal to and greater than v
  def lteqgt(values: Array[Int], v: Int) = {
    ( values.filter(_ < v).length,
      values.filter(_ == v).length,
      values.filter(_ > v).length
    )
  }

}
