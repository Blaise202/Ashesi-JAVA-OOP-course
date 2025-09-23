import java.util.Scanner;
public class SecondsToMinutes {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter total seconds to change into minutes and seconds: ");
    int totalSeconds = scanner.nextInt();
    int minutes = totalSeconds / 60; // Integer division
    int seconds = totalSeconds % 60; // Remainder
    System.out.println(totalSeconds+ " Seconds = " + minutes + " Minutes, " + seconds +  " Seconds: ");
  }
}