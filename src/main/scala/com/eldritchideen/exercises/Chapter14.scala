package com.eldritchideen.exercises

/**
 * Created by sjc on 8/01/14.
 */

sealed abstract class BinaryTree
case class Leaf(value:Int) extends BinaryTree
case class Node(left: BinaryTree, right: BinaryTree) extends BinaryTree

object Chapter14 {

  /**
   * Exercise 2
   * Swap the elements of a pair.
   *
   * @param pair
   * @return
   */
  def swapPairElements(pair: (Int, Int)) = pair match {case (x,y) => (y,x) }

  /**
   * Exercise 3
   * Swap first two elements of an array. Assume at least two elements
   */
  def swapFirstTwoArrayElements(a: Array[Int]) = {
    a match {
      case Array(x,y,_*) => Array(y,x) ++ a.drop(2)
    }
  }

  // Exercise 6
  // Sum a binary tree
  def sumBinaryTree(t: BinaryTree):Int = {
    t match {
      case Leaf(value) => value
      case Node(left, right) => sumBinaryTree(left) + sumBinaryTree(right)
    }
  }

}




