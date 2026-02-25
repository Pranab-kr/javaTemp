
// 8. Create an interface named Payable that declares a method calculateSalary(). Implement
// this interface in two classes named FullTimeEmployee and PartTimeEmployee. Each
// class should calculate salary in its own way. Write an application to demonstrate runtime
// polymorphism using the interface reference.

interface Payable{
  void calculateSalary();
}

class FullTimeEmployee implements Payable{
   double basicPay = 50000;
  double allowance = 5000;

  public void calculateSalary(){
   double totalPay = basicPay + allowance;

    System.out.println("Total salary of FullTimeEmployee: " + totalPay);
  }
}

class PartTimeEmployee implements Payable {
 double perHour = 5000;
 double totalHour = 6;

  public void calculateSalary(){
 double totalPay = perHour * totalHour;

    System.out.println("Total pay of the PartTimeEmployee is: " + totalPay);
  }

}


 class Main7 {
  public static void main(String[] args) {
    Payable p1 = new FullTimeEmployee();
    Payable p2 = new PartTimeEmployee();

    p1.calculateSalary();
    p2.calculateSalary();

  }
}
