package com.eldritchideen.exercises

/**
 * Created by sjc on 8/12/13.
 */

// Exercise 3
class Time(val hours: Int, val minutes: Int) {

  def before(other: Time) = {
    this.hours < other.hours || (this.hours == other.hours && this.minutes < other.minutes)
  }
}
