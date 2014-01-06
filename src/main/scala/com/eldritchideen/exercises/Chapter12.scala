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

  /**
   * Exercise 2
   * Find max element in an Array of Ints using reduceLeft
   */
  def maxUsingReduce(a: Array[Int]) =
    a.reduceLeft((x,y:Int) => if (x < y) y else x )

  /**
   * Exercise 3
   * Implement factorial calculation using to and reduceLeft
   */
  def factorial(n: Int) =
    (1 to n).reduceLeft(_ * _)

  def largest(fun: (Int) => Int, inputs: Seq[Int]) =
    fun(maxUsingReduce(inputs.toArray))

  /**
   * Exercise 7
   * Apply a binary function to elements of a pair
   * @param f A binary function
   * @param p A pair
   * @return
   */
  def adjustToPairs(f: (Int,Int)=>Int)(p: (Int,Int)) =
    f(p._1, p._2)

  /**
   * Exercise 8
   *
   * @param strings
   * @param lengths
   * @return
   */
  def checkStringLengths(strings: Array[String], lengths: Array[Int]) =
    strings.corresponds(lengths)(_.length == _)
}
