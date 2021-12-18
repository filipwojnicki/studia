package lab04.z06;

import java.util.Date;
// import java.util.GregorianCalendar;
import java.time.LocalDate;

public class Employee {
  public Employee(String name, double salary, int year, int month, int day)
  {
      this.name = name;
      this.salary = salary;

      LocalDate calendar = LocalDate.of(year, month, day);
      hireDay = java.sql.Date.valueOf(calendar);

      // Dodane w stosunku do poprzedniej wersji
      id = nextId;
      ++nextId;
  }

  public String getName()
  {
      return name;
  }

  public double getSalary()
  {
      return salary;
  }

  public Date getHireDay()
  {
      return (Date) hireDay.clone();
  }

  public void raiseSalary(double procent)
  {
      double raise = salary * procent / 100;
      salary += raise;
  }

  // Dodane w stosunku do poprzedniej wersji
  public int getId()
  {
      return id;
  }

  // Dodane w stosunku do poprzedniej wersji
  public void setId()
  {
      id = nextId;
      ++nextId;
  }

  // Dodane w stosunku do poprzedniej wersji
  public static int getNextId()
  {
      return nextId;
  }

  private String name;
  private double salary;
  private Date hireDay;

  // Dodane w stosunku do poprzedniej wersji
  private int id;
  private static int nextId = 1;
}
