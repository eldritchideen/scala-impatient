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


// Exercise 6
// primary constructor ensures that negative parameters are 0 on creation.
class Counter(private var value: Int) {
  if (value < 0) value = 0

  def increment() = {value += 1}
  def current() = value
}

// Exercise 7
class Person(fullName: String) {
  val firstName = fullName.split(' ')(0)
  val lastName = fullName.split(' ')(1)
}

// Exercise 8
class Car(val manufacturer:String, val model:String, val year:Int, var licensePlate:String) {

  def this(manufacturer:String, model:String) {
    this(manufacturer, model, -1, "")
  }

  def this(manufacturer:String, model:String, year:Int) {
    this(manufacturer, model, year, "")
  }

  def this(manufacturer:String, model:String, licensePlate:String) {
    this(manufacturer, model, -1, licensePlate)
  }
}

// Exercise 10
class Employee {
  private var _name: String = "John Q. Public"
  private var _salary: Double = 0.0

  def this(name: String, salary:Double) {
    this()
    this._name = name
    this._salary = salary
  }

  def name = _name
  def salary = _salary
}