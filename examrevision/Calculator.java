package Examrevision;

// Question 1B
public class Calculator{
  private int a;
  private int b;

  public Calculator(){
    this.a = 0;
    this.b = 0;
  }

  public Calculator(int a, int b){
    this.a = a;
    this.b = b;
  }

  public int sum(){
    return a+b;
  }
  public int sum(int x, int y){
    return x+y;
  }
}