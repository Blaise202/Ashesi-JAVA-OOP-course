import java.util.Scanner;
public class NewtonsDistance{
  public static void main(String[] args){
    System.out.println("Please enter velocity, time and acceleration respectively: ");
    Scanner sc = new Scanner(System.in);
    System.out.print("initial velocity = ");
    double velocity = sc.nextDouble();
    System.out.print("time = ");
    double time = sc.nextDouble();
    System.out.print("acceleration = ");
    double acceleration = sc.nextDouble();
    double distance = (velocity*time) + (acceleration*(time*time))/2;

    System.out.print("The distance is "+ distance);
  }
}