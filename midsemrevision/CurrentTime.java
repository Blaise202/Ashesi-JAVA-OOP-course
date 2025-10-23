import java.util.Scanner;

public class CurrentTime {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your time difference from the GMT(-12 to 12): ");
    long offset = scanner.nextInt();
    scanner.close();

    long totalMilliseconds = System.currentTimeMillis();

    long totalSeconds = totalMilliseconds / 1000;
    long remainingMillSeconds = totalMilliseconds % 1000;

    long totalMinutes = totalSeconds / 60;
    long remainingSeconds = totalSeconds % 60;

    long totalHours = totalMinutes / 60;
    long remainingMinutes = totalMinutes % 60;

    long currentHourGmt = totalHours % 24;


    long currentLocalHour = (currentHourGmt + offset) % 24;
    if(currentLocalHour < 0){
      currentLocalHour += 24;
    }

    System.out.println(
      "Current time is " + currentLocalHour + ":" +
      remainingMinutes + ":" + remainingSeconds
    );

  }
}