package com.eldritchideen.exercises

/**
 * Created by sjc on 7/12/13.
 */
object Chapter3 {

  // Exercise 1
  def randInts(n: Int): Array[Int] = {
    val a = new Array[Int](n)
    val r = new scala.util.Random()
    a.map(_ => r.nextInt(n))
  }

  // Exercise 2
  def swapElements(a: Array[Int]): Array[Int] = {
    val len = a.length
    val res = new Array[Int](len)
    for (i <- 1 until(len, 2)) {
      val tmp = a(i - 1)
      res(i - 1) = a(i)
      res(i) = tmp
    }
    // copy over last element in case of odd length array
    if (len % 2 != 0) res(len - 1) = a.last
    res
  }

  // Exercise 3
  // Swap using for/yield rather than looping
  def swapElements2(a: Array[Int]) = {
    for (i <- 0 until a.length) yield {
      if (i == a.length - 1) a(i)
      else if (i % 2 == 0) a(i + 1)
      else a(i - 1)
    }
  }

  // Exercise 4
  // Partition array based on positive and negative Ints.
  def partitionArray(a: Array[Int]): Array[Int] = {
    val (pos, neg) = a.partition(_ > 0)
    pos ++ neg
  }

  // Exercise 5
  def computeAverage(a: Array[Double]) = {
    a.sum/a.length
  }

  // Exercise 6
  def sortedAndReverse(a: Array[Int]) = {
    a.sorted.reverse
  }

  // Exercise 7
  def removeDups(a: Array[Int]) = {
    a.distinct
  }

  // Exercise 9
  def ex9 = {
    (for (s <- java.util.TimeZone.getAvailableIDs if s.startsWith("America/")) yield s.stripPrefix("America/")).sorted
  }

}
