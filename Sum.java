public class Sum{
  static void Multiples(int num, int limit){
    for(int i = 1; i < limit; i++){
      if(i*num >= limit){
        break;
      }
      System.out.print(i*num+", ");
    }
  }

  public static void main(String[] args){
    Multiples(3,20);
  }
}