public class AgeProcessing {
  public static void main(String[] args){
    int[] ages = {12, 34, 24, 45, 54, 24, 56, 67, 33, 22, 34};

    int length = ages.length;
    int sumOfAges = 0;
    for(int i = 0; i <length; i++){
      sumOfAges += ages[i];
    }
    System.out.println("The Sum is "+sumOfAges);
    double average = sumOfAges / length;
    System.out.println("The Average is "+average);
    
    int maxAge = ages[0];
    int lowAge = ages[0];
    for(int j = 0; j < length; j++ ){
      if(ages[j] > maxAge ){
        maxAge = ages[j];
      }
      if(ages[j] < maxAge ){
        maxAge = ages[j];
      }
    }
    System.out.println("The maximum age is "+maxAge);
    System.out.println("The minimum age is "+lowAge);

  }
}