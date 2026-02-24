
// 3. Develop a class called Rectangle to demonstrate constructor overloading. The class
// should include a constructor with no parameters that assigns default values to length
// and breadth. Another constructor should accept a single parameter to represent a
// square, and a third constructor should accept two parameters to represent a rectangle.
// Provide a method to calculate and display the area.

class Rectangle{
  double length;
  double breadth;

  public Rectangle(){
    this.length = 5.0;
    this.breadth = 6.0;
  }

  public Rectangle(double length){
    this.length = length;
    this.breadth = length;
  }

  public Rectangle(double length , double breadth){
    this.length = length;
    this.breadth = breadth;
  }

  public void area(){
    System.out.println("The area is: " + length * breadth);
  }
}

class Main2 {

  public static void main(String[] args) {

    Rectangle r1 = new Rectangle();
    Rectangle r2 = new Rectangle(10.0);
    Rectangle r3 = new Rectangle(7.8, 12.4);

    r1.area();

    r2.area();
    r3.area();
  }
}
