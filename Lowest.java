import java.util.Scanner;
import java.util.Arrays;
public class Lowest{
  public static void main(String[] args){
    int[] arr = {7,2,5,3,9,1,2,3,4,5};
    Scanner scanner = new Scanner(System.in);
    System.out.print("Which number are you looking for: ");
    int find = scanner.nextInt();
    // for(int i = 0; i < arr.length; i++){
    //   if(arr[i] == find){
    //     System.out.print(find + " was found in the array at position "+(i+1));
    //     return;
    //   }
    // }
    // System.out.print(find + " was not found in the array");
    
    
    // binary search

    Arrays.sort(arr);
    int lowest = 0;
    int highest = arr.length - 1;
    boolean found = false;
    int position = 0;
    
    while(lowest <= highest){
      int middle = (highest+lowest)/2;
      if(find == arr[middle]){
        position = middle + 1;
        found = true;
        break;
      }else if(find < arr[middle]){
        highest = middle - 1;
      }else{
        lowest = middle + 1;
      }
    }
    if(found){
      System.out.println(find + " was found and is on position "+position+".");
    }else{
      System.out.println(find + " was not found in the array.");
    }
    scanner.close();
  }
}


