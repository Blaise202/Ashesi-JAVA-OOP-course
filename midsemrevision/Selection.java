public class Selection{
  public static void main(String[] args){
    int randomnumber = (int) (Math.random() * 100 );
    if(randomnumber > 50){
      System.out.println("The random number is between 50 and 100");
    }else{
      System.out.println("The random number is below 50");
    }
    System.out.println("The number was "+randomnumber);
  }
}