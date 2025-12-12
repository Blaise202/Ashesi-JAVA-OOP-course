package Examrevision;

// Question 2B
public class Employee {
  protected String name;

  public Employee(String name){
    this.name = name;
  }

  public void display(){
    System.out.println("Employee: " + name);
  }
}
