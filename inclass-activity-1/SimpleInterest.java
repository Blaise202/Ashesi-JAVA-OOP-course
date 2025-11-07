import java.util.Scanner;
public class SimpleInterest{
  public static void main(String[] args){
    double amount, rate, time, interest;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please enter the amount deposited: ");
    amount = scanner.nextInt();
    System.out.print("Please enter the interest rate(%): ");
    rate = scanner.nextInt();
    System.out.print("Please enter the time (in years): ");
    time = scanner.nextInt();
    interest = amount * rate * time / 100;
    System.out.print("The simple interest after "+time+" years is "+interest);
    scanner.close();
  }
}