package com.eldritchideen.exercises

/**
 * Created by sjc on 3/01/14.
 */
class Chapter11 {

}

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

  override def toString() = {
    "Money(%d, %d)".format(dollars, cents)
  }

  private def totalCents(amount: Money) = {
    (amount.dollars * 100) + amount.cents
  }
}
