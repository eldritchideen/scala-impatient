package com.eldritchideen.exercises

import org.scalatest.{Matchers, FunSuite}

/**
 * Created by sjc on 8/01/14.
 */
class Chapter14Test extends FunSuite with Matchers {

  test("Swap elements of a pair") {
    Chapter14.swapPairElements((1,2)) should equal(2,1)
  }

  test("swap first two elements in array") {
    Chapter14.swapFirstTwoArrayElements(Array(1,2,3,4)) should equal(Array(2,1,3,4))
  }

  test("sum binary tree") {
    Chapter14.sumBinaryTree(Node(Leaf(1), Node(Leaf(2), Leaf(3)))) should equal(6)
  }
}
