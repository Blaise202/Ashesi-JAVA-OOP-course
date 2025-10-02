public class AgeProcessing {
  public static void main(String[] args){
    int[] ages = {12, 34, 24, 45, 54, 24, 56, 67, 33, 22, 34};

    int sumOfAges = 0;
    for(int i = 0; i <10; i++){
      sumOfAges += ages[i];
    }
    System.out.print("Sum is "+sumOfAges);
  }
}