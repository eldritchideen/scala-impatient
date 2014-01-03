package com.eldritchideen.exercises

/**
 * Created by sjc on 3/01/14.
 */
class Chapter11 {

}

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
