//matrix calculation 

class Main8 {
  public static void main(String[] args) {
    int[][] mat = {{1,2,3,4}, {5,6,7,8},{9,10,11,12},{13,14,15,16}};

    double grand= 0;
    int row =4, col = 4;

    for(int i = 0;i<row ; i++){
      double sum = 0;

      for(int j = 0 ; j<col ; j++){
        sum = sum + mat[i][j];
      }

      System.out.println("The avg of row " + (i+1) + " is: " + sum/col);
      grand+=sum;
    }

    for(int j = 0 ; j< col ; j++){
      double sum = 0;

      for(int i = 0; i<row ; i++){
        sum = sum + mat[i][j];
      }
      System.out.println("The avg of col " + (j+1) + " is: " + sum/row);

    }

    System.out.println("The grand avg is: " + grand/(row*col));


  }
}
