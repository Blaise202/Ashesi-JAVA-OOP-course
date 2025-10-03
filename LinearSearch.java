import java.util.Scanner;
public class LinearSearch{
  public static void main(String[] args){
    int[] numbers = {2,5,8,3,4,6,10,15,20,1,11};

    // Task 1 finding value of index provided by the user. 

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
    
    // Task 2 Swaping the index searched with it's next value;
    
    System.out.println("Let's switch value on index "+indexToFind+"("+numbers[indexToFind]+") and on index "+(indexToFind+1)+"("+numbers[indexToFind+1]+")");

    int reserve = numbers[indexToFind];
    numbers[indexToFind] = numbers[indexToFind+1];
    numbers[indexToFind+1] = reserve;

    System.out.println("Now the values changed to index "+indexToFind+"("+numbers[indexToFind]+") and index "+(indexToFind+1)+"("+numbers[indexToFind+1]+")");

  }
}