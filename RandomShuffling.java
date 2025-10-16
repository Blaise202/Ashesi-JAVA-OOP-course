
public class RandomShuffling {
  public static void main(String[] args) {
    int[] numbers = {2, 9, 5, 1, 4, 7};

    // Bubble sort implementation
    for (int i = 0; i < numbers.length - 1; i++) {
      for (int j = 0; j < numbers.length - 1 - i; j++) {
        if (numbers[j] > numbers[j + 1]) {
          // Swap elements
          int temp = numbers[j];
          numbers[j] = numbers[j + 1];
          numbers[j + 1] = temp;
        }
      }
    }
    
    // Print sorted array
    System.out.print("Sorted array: ");
    for (int number : numbers) {
      System.out.print(number + " ");
    }
  }
}