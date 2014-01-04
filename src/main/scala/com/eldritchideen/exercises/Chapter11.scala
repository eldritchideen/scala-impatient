package com.eldritchideen.exercises

/**
 * Created by sjc on 3/01/14.
 */
class Chapter11

/**
 * Simple class representing Monetary amounts in dollars and cents.
 * Exercise 4, implement infix and comparison operators.
 *
 * @param dollars
 * @param cents
 */
class Money(val dollars: Int, val cents: Int) {

  def +(other: Money) = {
    val amount = totalCents(this) + totalCents(other)
    new Money(amount / 100, amount % 100)
  }

  def -(other: Money) = {
    val amount = totalCents(this) - totalCents(other)
    if (amount <= 0)
      new Money(0,0)
    else
      new Money(amount / 100, amount % 100)
  }

  def <(other: Money) = totalCents(this) < totalCents(other)

  override def equals(other: Any) = other match {
    case that: Money => this.dollars == that.dollars && this.cents == that.cents
    case _ => false

  }

  override def toString = {
    "Money(%d, %d)".format(dollars, cents)
  }

  private def totalCents(amount: Money) = {
    (amount.dollars * 100) + amount.cents
  }
}

/**
 * Exercise 7
 * Simple class to set and get bits within a long.
 * Demonstrating how to use apply and unapply with a class.
 *
 */
class BitSequence {
  private var bits: Long = 0L

  def bitMask(bit:Byte) = 1<<bit

  def apply(bitIndex:Byte) = {
    assert(bitIndex < 64, "index must be 0 to 63")
    if ((bits & bitMask(bitIndex)) > 0) 1 else 0
  }

  def update(bitIndex:Byte, value:Int) = {
    assert(value == 1 || value == 0, "value must be either 0 or 1")
    if (value == 1)
      bits |= bitMask(bitIndex)
    else
      bits &= ~bitMask(bitIndex)
  }

  override def toString = {
    bits.toBinaryString
  }

}