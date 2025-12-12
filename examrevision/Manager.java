package Examrevision;

public class Manager extends Employee {
  private String department;

  public Manager(String name, String department){
    super(name);
    this.department = department;
  }

  @Override
  public void display(){
    System.out.println("Manager: "+name+" Dept: "+department);
  }
}
