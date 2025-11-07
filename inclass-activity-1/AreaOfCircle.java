import java.util.*;
public class AreaOfCircle{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    double radius, area;
    System.out.print("Please enter the radius of the circle: ");
    radius = scanner.nextInt();
    area = Math.PI * Math.pow(radius, 2);
    System.out.print("The area of the circle is: " + Math.round(area));
    scanner.close();
  }
}