import java.util.Scanner;
public class Quiz{
  public static void main(String[] args){
    int number1 = (int) (Math.random() * 10);
    int number2 = (int) (Math.random() * 10);
    System.out.print("What is "+number1+" - "+number2+" : ");
    Scanner scanner = new Scanner(System.in);
    int answer = scanner.nextInt();
    if(number1 - number2 == answer){
      System.out.println("🥳Correct!");
    }else{
      System.out.println("😢Wrong!");
    }
    scanner.close();
  }
}