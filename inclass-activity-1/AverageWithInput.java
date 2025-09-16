import java.util.Scanner;
public class AverageWithInput{
  public static void main(String[] args){
   Scanner scanner = new Scanner(System.in);
    int num1, num2, num3, num4;
    System.out.print("Enter number 1: ");
    num1 = scanner.nextInt();
    System.out.print("Enter number 2: ");
    num2 = scanner.nextInt();
    System.out.print("Enter number 3: ");
    num3 = scanner.nextInt();
    System.out.print("Enter number 4: ");
    num4 = scanner.nextInt();
    System.out.print(num1);
    double sum, average;
    sum = num1 + num2 + num3 + num4;
    average = sum/2;
    System.out.println("");
    System.out.println("Average: "+average);
  }
}