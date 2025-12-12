package Examrevision;


public class Test {

  static int x = 40; // static variable
  int y = 10; // instance variable
  final int z = 15; // final variable

  // method overloading
  public int add(int a, int b){return a+b;}
  public double add(double a, double b){return a+b;}

  public Test(){
    this.y = 10;
  }
  public Test(int y){
    this.y = y;
  }
}
