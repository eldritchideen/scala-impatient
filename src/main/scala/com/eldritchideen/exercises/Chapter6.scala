package com.eldritchideen.exercises

/**
 * Created by sjc on 19/12/13.
 */

// Exercise 3
class Point(val x:Int, val y:Int) { }

// Exercise 4
object Point {
  def apply(x:Int, y:Int) = new Point(x,y)
}

//Exercise 1
object Conversions {
  def milesToKilometers(miles:Double): Double = miles * 1.609344

  def gallonsToLiters(gallons:Double): Double = gallons * 3.78541

  def inchesToCentimeters(inches:Double) = inches * 2.54

}

// Exercise 6
object CardSuites extends Enumeration {
  val spades = Value("\u2660")
  val diamonds = Value("\u2666")
  val clubs = Value("\u2663")
  val hearts = Value("\u2665")

}

object CardSuitesHelper {
  def isRed(suite:CardSuites.Value):Boolean = {
    if (suite == CardSuites.hearts || suite == CardSuites.diamonds) true else false
  }
}

// Exercise 8
object ColorCube extends Enumeration {
  val red = Value(0xff0000)
  val blue = Value(0x0000ff)
  val green = Value(0x00ff00)
  val black = Value(0x000000)
  val white = Value(0xffffff)
  val cyan = Value(0x00ffff)
  val magenta = Value(0xff00ff)
  val yellow = Value(0xffff00)
}

