package com.eldritchideen.exercises

import org.scalatest.FunSuite

/**
 * Created by sjc on 21/12/13.
 */
class Chapter8Test extends FunSuite {

  test("BankAccount creation") {
    val b1 = new BankAccount(100.10)
    assert(b1.accountBalance === 100.10)
  }

  test("BankAccount operations") {
    val b = new BankAccount(100)
    assert(b.accountBalance === 100)
    b.deposit(5)
    assert(b.accountBalance === 105)
    b.withdraw(10)
    assert(b.accountBalance === 95)
  }

  test("CheckingAccount operations") {
    val c = new CheckingAccount(100)
    assert(c.accountBalance === 100)
    c.deposit(5)
    assert(c.accountBalance === 104)
    c.withdraw(4)
    assert(c.accountBalance === 99)
  }

  test("SavingsAccount operations") {
    val s = new SavingsAccount(100)
    s.deposit(5)
    s.deposit(5)
    s.deposit(5)
    // No fees should have been charged
    assert(s.accountBalance === 115)
    s.deposit(5)
    // Fee charged.
    assert(s.accountBalance === 119)
    s.earnMonthlyInterest(1)
    s.withdraw(5)
    assert(s.accountBalance === 115)

  }

}
