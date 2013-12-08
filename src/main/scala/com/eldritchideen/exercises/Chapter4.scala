package com.eldritchideen.exercises

/**
 * Created by sjc on 7/12/13.
 */

import scala.collection._

object Chapter4 {

  // Exercise 1
  def tenPercentOff(products: Map[String, Int]) = {
    for ((product, price) <- products) yield (product, price * 0.9)
  }

  def countWordsMutable(in: java.util.Scanner): Map[String, Int] = {
    val res = new mutable.HashMap[String, Int]()
    while (in.hasNext) {
      val s = in.next()
      res(s) = res.getOrElse(s, 0) + 1
    }
    res
  }

}
