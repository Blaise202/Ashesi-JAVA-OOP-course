puclic class Test{
  public static void main(String[] args){
    System.out.println("Sorting the array in ascending order...");
    // Bubble sort implementation (ascending order)
    for (int i = 0; i < ascending.length - 1; i++) {
      for (int j = 0; j < ascending.length - i - 1; j++) {
        if (ascending[j] > ascending[j + 1]) {
          int temp = ascending[j];
          ascending[j] = ascending[j + 1];
          ascending[j + 1] = temp;
        }
      }
    }
    System.out.println("Sorting the array in descending order...");
    // Bubble sort implementation (descending order)
    for (int i = 0; i < ascending.length - 1; i++) {
      for (int j = 0; j < ascending.length - i - 1; j++) {
        if (ascending[j] < ascending[j + 1]) {
          int temp = ascending[j];
          ascending[j] = ascending[j + 1];
          ascending[j + 1] = temp;
        }
      }
    }
  }
}