package com.eldritchideen.exercises

/**
 * Created by sjc on 21/12/13.
 */
class BankAccount(initialBalance:Double) {
  private var balance = initialBalance

  def deposit(amount: Double) = { balance += amount; balance }
  def withdraw(amount: Double) = { balance -= amount; balance }
  def accountBalance = balance
}

class  CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance) {
  override def deposit(amount: Double) = {
    super.deposit(amount-1)
  }

  override def withdraw(amount: Double) = {
    super.withdraw(amount+1)
  }
}

class SavingsAccount(initialBalance: Double) extends BankAccount(initialBalance) {
  private var freeTransactionCount = 3;

  def earnMonthlyInterest(interestAmount: Double) = {
    super.deposit(interestAmount)
    freeTransactionCount = 3;
  }

  override def deposit(amount: Double) = {
    if (freeTransactionCount > 0) {
      freeTransactionCount -= 1
      super.deposit(amount)
    } else
      super.deposit(amount - 1)
  }

  override def withdraw(amount:Double) = {
    if (freeTransactionCount > 0 ) {
      freeTransactionCount -= 1
      super.withdraw(amount)
    } else
      super.withdraw(amount+1)
  }
}
