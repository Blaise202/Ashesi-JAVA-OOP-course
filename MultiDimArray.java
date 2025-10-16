import java.util.Arrays;
public class MultiDimArray{

  public String name = "Blaise";

  public static String PrintName(String name){
    // this.name = name;
    return name;
  }

  public static void main(String[] args){
    int[][] numbers = {
      {2,3,4,5,5,6},
      {3,4,5,6,7,8},
      {2,5,6,3,4,5},
      {6,4,3,4,5,6}
    };
    for(int[] part : numbers){
      for(int num: part){
        System.out.print(num+" ");
      }
      System.out.print("\n");
    }
    int[][][] threeDim = {
      {
        {1,2,3,4,5},
        {3,4,5,2,3},
        {3,4,2,3,5}
      },
      {
        {2,3,5,3,4},
        {7,6,5,6,7},
        {4,5,6,4,3}
      },
      {
        {2,3,4,5,6},
        {2,3,4,4,5}
      }
    };

    for(int[][] twoDim : threeDim){
      for(int[] oneDim : twoDim){
        for(int num : oneDim){
          System.out.print(num+" ");
          
        }
      }
    }

    System.out.print(PrintName("Remy"));

  }
}