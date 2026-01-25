// 1. The abstract class Vehicle has three subclasses named Car, Truck, and Motorcycle.
// Each vehicle type has a different fuel capacity. Each vehicle object has a unique
// registration number. Write an application that: Declares this class hierarchy, Instantiates
// several types of vehicles, Displays their details, Overrides the toString() method to return
// the vehicle type, registration number, and fuel capacity

abstract class vehicle {
  double fuel;
  String regino;

  public vehicle(double fuel, String regino) {
   this.fuel = fuel;
   this.regino = regino;
  }
  public String toString() {
      return "Vechile type: " + this.getClass().getSimpleName() + " Regi no: " + regino + "Fuel capacity: " + fuel + "Litters" ;
  }

}

class Car extends vehicle {
  public Car(double fuel , String regino){
    super(fuel, regino);
  }
}


class Truck extends vehicle {
  public Truck(double fuel , String regino){
    super(fuel, regino);
  }
}


class Motorcycle extends vehicle {
  public Motorcycle(double fuel , String regino){
    super(fuel, regino);
  }
}

public class Main {
  public static void main(String[] args) {
    Car c1 = new Car(10, "dh2112");

    Truck T1 = new Truck(20, "eree2112");

    Motorcycle M1 = new Motorcycle(40, "Dagsdh1o2");

   System.out.println(c1.toString());

    System.out.println(T1.toString());

    System.out.println(M1.toString());
   }
}
