// 2. Write an application to implement the three threads by extending thread class.Implement
// the method by computing the sum of natural nos in thread1. Sum of square of natural
// nos. in thread2 and sum of cube of natural nos in thread3.

class SumNatural extends Thread {
  public void run() {
    int sum = 0;
    for (int i = 1; i <= 10; i++) {
      sum += i;
    }
    System.out.println("Sum of natural numbers = " + sum);
  }
}

class SumSqure extends Thread {
  public void run() {
    int sum = 0;
    for (int i = 0; i <= 10; i++) {
      sum += i * i;
    }
    System.out.println("sum of Squre is: " + sum);
  }
}

class SumCube extends Thread {
  public void run() {
    int sum = 0;
    for (int i = 0; i <= 10; i++) {
      sum += i * i * i;
    }
    System.out.println("sum of Cube is: " + sum);
  }
}

public class Main1 {

  public static void main(String[] args) {
    SumNatural t1 = new SumNatural();

    SumSqure t2 = new SumSqure();

    SumCube t3 = new SumCube();
    t1.start();
    t2.start();
    t3.start();
  }
}
