// 3. Develop a class called Rectangle to demonstrate constructor overloading. The class
// should include a constructor with no parameters that assigns default values to length
// and breadth. Another constructor should accept a single parameter to represent a
// square, and a third constructor should accept two parameters to represent a rectangle.
// Provide a method to calculate and display the area.

class Rectangle {
  double length;
  double breadth;

  Rectangle() {
    this.length = 5;
    this.breadth = 4;
  }

  Rectangle(double side) {

    this.length = side;
    this.breadth = side;
  }

  Rectangle(double length, double breadth) {
    this.length = length;
    this.breadth = breadth;
  }

  void calclateArea() {
    double area = length * breadth;
    System.out.println("The area of the Rectangle is: " + area);

  }
}

public class Main2 {
  public static void main(String[] args) {

    Rectangle r1 = new Rectangle();
    Rectangle r2 = new Rectangle(6);
    Rectangle r3 = new Rectangle(5, 8);

    r1.calclateArea();
    r2.calclateArea();
    r3.calclateArea();
  }

}
