public class MultiTask{
  private double[] numbers;
  private int[][] integersIn2D;

  public MultiTask(double[] numbers){
    this.numbers = numbers;
  }

  public MultiTask(int[][] integersIn2D){
    this.integersIn2D = integersIn2D;
  }

  public double secondLargest(){
    double first = 0;
    double second = 0;
    int index = 0;
    int indexOfFirst = 0;
    for(double number : numbers){
      if(number > first){
        first = number;
        indexOfFirst = index;
      }
      index++;
    }
    numbers[indexOfFirst] = 0;
      for(double number : numbers){
      if(number > second){
        second = number;
        indexOfFirst = index;
      }
      index++;
    }
    return second;
  }

  public int[][] sumOfRowsAndColumns(){
    if (integersIn2D == null || integersIn2D.length == 0 || integersIn2D[0].length == 0) {
      return new int[0][0];
    }

    int numRows = integersIn2D.length;
    int numCols = integersIn2D[0].length;

    int[] rowSums = new int[numRows];
    int[] colSums = new int[numCols];

    for (int i = 0; i < numRows; i++) {
      for (int j = 0; j < numCols; j++) {
        int value = integersIn2D[i][j];
        rowSums[i] += value;
        colSums[j] += value;
      }
    }

    return new int[][]{rowSums, colSums};
  }

  public static void main(String[] args){
    // double[] myNumbers = {1,2,4,2,3,5,6,8,4,3,7};
    // MultiTask task1 = new MultiTask(myNumbers);
    // System.out.print("The second largest is "+task1.secondLargest());

    int[][] matrix = {
      {5, 1, 1},
      {2, 4, 6},
      {1, 3, 5}
    };

    MultiTask task = new MultiTask(matrix);
    int[][] sums = task.sumOfRowsAndColumns();

    if (sums.length == 2) {
      int[] rowSums = sums[0];
      int[] colSums = sums[1];

      System.out.println("--- Input Matrix ---");
      for (int[] row : matrix) {
        for (int val : row) {
          System.out.print(val + "\t");
        }
        System.out.println();
      }

      System.out.println("\n--- Row Sums ---");
      for (int i = 0; i < rowSums.length; i++) {
        System.out.println("Row " + i + ": " + rowSums[i]);
      }

      System.out.println("\n--- Column Sums ---");
      for (int j = 0; j < colSums.length; j++) {
        System.out.println("Column " + j + ": " + colSums[j]);
      }
    } else {
      System.out.println("Error: Could not compute sums.");
    }
  }
}