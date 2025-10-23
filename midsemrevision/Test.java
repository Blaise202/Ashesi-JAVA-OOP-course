public class Test{
  public static void main(String[] args){
    System.out.println(Math.PI); // it's Math.PI not just PI

    int number = (int) (Math.random() * 10);
    if(number%2 == 0)
      if(number > 0)
        System.out.println(number + " is even");
    System.out.println(number + " is odd");
  }
}