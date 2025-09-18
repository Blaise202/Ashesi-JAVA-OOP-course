public class Incrementing {
  public static void main(String[] args){
    int number = 1;
    System.out.println(number++); // this prints 1, then increments number to 2
    number = 1;
    System.out.println(++number); // this increments number to 2, then prints 2
  }
}