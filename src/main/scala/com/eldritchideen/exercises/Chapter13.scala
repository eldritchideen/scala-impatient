package com.eldritchideen.exercises

/**
 * Created by sjc on 7/01/14.
 */

import scala.collection.mutable

object Chapter13 {

  /**
   * Exercise 1
   *
   * Given string produce a map of the indexes of all the characters.
   *
   * @param s
   * @return
   */
  def indexes(s: String) = {
    val m = mutable.Map[Char, mutable.Set[Int]]()
    var index = 0

    for (c <- s) {
      m(c) = m.getOrElse(c, mutable.Set[Int]()) + index
      index += 1
    }
    m
  }

  /**
   * Exercise 2
   * Same as above how use immutable data structures
   *
   * @param s
   * @return
   */
  def immutableIndexes(s: String) = {
    var m = Map[Char, Set[Int]]()
    var index = 0

    for (c:Char <- s) {
      m = m + (c -> (m.getOrElse(c, Set[Int]()) + index ))
      index += 1
    }
    m
  }

  /**
   * Exercise 3
   *
   * Remove zeros from linked list
   *
   */
  def removeZeroes(l :mutable.LinkedList[Int]) = {
    var cur = l

    while(cur != Nil && cur.next != Nil) {
      cur.next = cur.next.next
      cur = cur.next
    }
  }

  /*
   * Exercise 9
   *
   * Why is the following code not correct if called from multiple threads?
   *
   * Answer: The getting and incrementing of the Map values is not an atomic operation. Other
   * threads may be trying to update the same key at the same time.
   *
   */
  def notThreadSafe() = {
    val frequencies = new mutable.HashMap[Char, Int] with scala.collection.mutable.SynchronizedMap[Char, Int]
    val c: Char = 'A'

    frequencies(c) = frequencies.getOrElse(c, 0) + 1
  }
}
