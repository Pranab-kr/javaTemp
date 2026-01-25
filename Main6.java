// 8. Create an interface named Payable that declares a method calculateSalary(). Implement
// this interface in two classes named FullTimeEmployee and PartTimeEmployee. Each
// class should calculate salary in its own way. Write an application to demonstrate runtime
// polymorphism using the interface reference.

interface payable {
  void calculateSalary();
}

class FullTimeEmployee implements payable {
  double basicPay = 50000;
  double allowance = 5000;

  public void calculateSalary() {
    double sal = basicPay + allowance;
    System.out.println("The sal is: " + sal);
  }

}

class PartTimeEmployee implements payable {

  double perHour = 2000;
  double hour = 10;

  public void calculateSalary() {
    double sal = perHour * hour;
    System.out.println("The sal is: " + sal);
  }
}

public class Main6 {
  public static void main(String[] args) {

    payable p1 = new FullTimeEmployee();
    payable p2 = new PartTimeEmployee();

    p1.calculateSalary();

    p2.calculateSalary();

  }

}
