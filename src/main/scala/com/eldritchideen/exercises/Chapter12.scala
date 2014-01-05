package com.eldritchideen.exercises

/**
 * Created by sjc on 5/01/14.
 */
object Chapter12 {

  /**
   * Exercise 1
   */
  def values(fun: (Int) => Int, low: Int, high: Int) =
    for (i <- low to high) yield (i, fun(i))

}
