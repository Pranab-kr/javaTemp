
// 2. Write an application to implement the three threads by extending thread class.Implement
// the method by computing the sum of natural nos in thread1. Sum of square of natural
// nos. in thread2 and sum of cube of natural nos in thread3.

class natural extends Thread{
  int sum = 0;

  public void run(){

    for (int i = 0; i <= 10; i++) {
      sum += i;

    }
    System.out.println("Narutal sum: " + sum);
  }
}


class square extends Thread{
  int sum = 0;

  public void run(){

    for (int i = 0; i <= 10; i++) {
      sum += i * i;

    }
    System.out.println("square sum: " + sum);
  }
}

class cube extends Thread{
  int sum = 0;

  public void run(){

    for (int i = 0; i <= 10; i++) {
      sum += i * i * i;

    }
    System.out.println("cube sum: " + sum);
  }
}

class Main1{
  public static void main(String[] args) {

    natural t1 = new natural();

    square t2 = new square();

    cube t3 = new cube();

    t1.start();

    t2.start();
    t3.start();

  }
}
