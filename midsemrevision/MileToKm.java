import java.util.Scanner;
public class MileToKm{
  public static void main(String[] args){
    System.out.print("Enter Miles: ");
    Scanner sc = new Scanner(System.in);
    double miles = sc.nextDouble();
    double kilometers = miles * 1.6;
    System.out.print(miles+" miles is "+kilometers+" kilometers.");
  }
}