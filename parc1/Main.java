// 1. The abstract class Vehicle has three subclasses named Car, Truck, and Motorcycle.
// Each vehicle type has a different fuel capacity. Each vehicle object has a unique
// registration number. Write an application that: Declares this class hierarchy, Instantiates
// several types of vehicles, Displays their details, Overrides the toString() method to return
// the vehicle type, registration number, and fuel capacity

abstract class Vehicle {
  double fuel;
  String reg;

  Vehicle(double fuel, String reg){
    this.fuel = fuel;
    this.reg = reg;
  }
  public String toString(){
    return "Vehicle type: " + this.getClass().getSimpleName() + "fuel: " + this.fuel + "registration: " + this.reg; 
  }
}

class Car extends Vehicle {
  Car(double fuel, String reg){
    super(fuel, reg);
  }
}


class Truck extends Vehicle {
  Truck(double fuel, String reg){
    super(fuel, reg);
  }
}

class Motorcycle extends Vehicle {
  Motorcycle(double fuel, String reg){
    super(fuel, reg);
  }
}


class Main{
  public static void main(String[] args) {
    Car c1 = new Car(100,"FF7");

    Truck t1 = new Truck(200,"Hiwi");

    Motorcycle m1 = new Motorcycle(69, "kawai");

    System.out.println(c1.toString());

    System.out.println(t1.toString());
    System.out.println(m1.toString());

  }
}
