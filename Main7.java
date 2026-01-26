public class Main7 {
  public static void main(String[] args) {
    int[][] mat = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 20, 30, 40, 50 }, { 25, 35, 45, 55 } };

    double grand = 0;
    int row = 4, col = 4;

    for (int i = 0; i < row; i++) {
      int rowSum = 0;
      for (int j = 0; j < col; j++) {
        rowSum += mat[i][j];

      }
      System.out.println("The Avg of row " + (i + 1) + " is: " + (rowSum / row));
      grand += rowSum;
    }

    for (int j = 0; j < row; j++) {
      int colSum = 0;
      for (int i = 0; i < col; i++) {
        colSum += mat[i][j];

      }
      System.out.println("The Avg of row " + (j + 1) + " is: " + (colSum / col));
    }
    System.out.println("Grand avg is: " + (grand / (row * col)));

  }
}
