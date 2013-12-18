package com.eldritchideen.exercises

import scala.beans.BeanProperty

/**
 * Created by sjc on 8/12/13.
 */

// Exercise 3
class Time(val hours: Int, val minutes: Int) {

  def before(other: Time) = {
    this.hours < other.hours || (this.hours == other.hours && this.minutes < other.minutes)
  }
}

// Exercise 4
class Time2(private val _hours: Int, private val _minutes: Int) {
  private val minPastMidnight = _hours * 60 + _minutes

  def hours = minPastMidnight / 60

  def minutes = minPastMidnight % 60

  def before(other: Time2) = {
    this.minPastMidnight < other.minPastMidnight
  }
}

// Exercise 5
class Student(@BeanProperty var name:String, @BeanProperty var id:Int) {

}

/*
Result of decompiling the Student class

>  javap Student.class

Compiled from "Chapter5.scala"
public class com.eldritchideen.exercises.Student {
public java.lang.String name();
public void name_$eq(java.lang.String);
public void setName(java.lang.String);
public int id();
public void id_$eq(int);
public void setId(int);
public java.lang.String getName();
public int getId();
public com.eldritchideen.exercises.Student(java.lang.String, int);
}

*/
