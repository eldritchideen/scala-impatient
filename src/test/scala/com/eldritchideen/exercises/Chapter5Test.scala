package com.eldritchideen.exercises

import org.scalatest.FunSuite

/**
 * Created by sjc on 8/12/13.
 */
class Chapter5Test extends FunSuite {

  test("Time") {
    val t1 = new Time(10, 30)
    val t2 = new Time(6, 30)
    val t3 = new Time(10, 35)
    val t4 = new Time(10,19)

    assert(t1.before(t3))
    assert(!t1.before(t2))
    assert(t4.before(t1))
  }

  test("Time2") {
    val t1 = new Time2(10, 30)
    val t2 = new Time2(6, 30)
    val t3 = new Time2(10, 35)
    val t4 = new Time2(10,19)

    assert(t1.before(t3))
    assert(!t1.before(t2))
    assert(t4.before(t1))
  }

  test("Java Beans") {
    // Test being able to call java beans setters and getters.
    val s = new Student("Steve", 12345)
    s.setId(6789)
    assert(s.getId() == 6789)
  }

  test("Counter constructor") {
    assert(new Counter(-10).current() == 0)
    assert({val c = new Counter(0); c.increment(); c.current()} == 1)
  }

  test("Person class") {
    val p = new Person("Steven Cook")
    assert(p.firstName === "Steven")
    assert(p.lastName === "Cook")
  }

  test("Car class") {
    val c1 = new Car("BMW", "118i", 1997, "XXX-667")
    val c2 = new Car("BMW", "325i")
    val c3 = new Car("Holden", "Caprice", "AAA-123")
    val c4 = new Car("Toyota", "Camry", 2013)

    assert(c1.manufacturer === "BMW")
    assert(c2.licensePlate === "")
    assert(c2.year === -1)
    assert(c2.model === "325i")
    assert(c3.year === -1)
    assert(c3.licensePlate === "AAA-123")
    assert(c4.licensePlate === "")
  }

  test("Employee class") {
    val e = new Employee()
    val e2 = new Employee("Steve", 100000.11)

    assert(e.name === "John Q. Public")
    assert(e.salary === 0.0)
    assert(e2.name === "Steve")
    assert(e2.salary === 100000.11)
  }
}
