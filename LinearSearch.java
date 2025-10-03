import java.util.Scanner;
public class LinearSearch{
  public static void main(String[] args){
    int[] numbers = {2,5,8,3,4,6,10,15,20,1,11};
    Scanner scanner = new Scanner(System.in);
    int indexToFind, value = 0;
    int limit = numbers.length-1;
    System.out.print("Which index do you want (0-"+limit+"): ");
    indexToFind = scanner.nextInt();
    for(int i = 0; i < numbers.length; i++){
      if(i == indexToFind){
        value = numbers[i];
      }
    }
    
    System.out.println("The number is: "+ value);
  }
}