import java.util.Scanner;
public class MeterToFeet{
  public static void main(String[] main){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter value for meters: ");
    double meters = scanner.nextDouble();
    double feets = meters * 3.2786;
    System.out.print(meters+" meters is "+feets+" feets.");
  }
}