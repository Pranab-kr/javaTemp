
// 12. Write a program for user defined exceptions that checks the internal & external marks. If
// the internal marks is greater than 30 or less than 0 which raises the exception the invalid
// internal marks , if the external marks is greater than 70 or less than 0 it raises the
// exception & displays the message the external marks is exceeded. Create the above
// exception &amp; use it in your program.

import java.util.Scanner;

class invalidInternalMakrks extends Exception {
  public invalidInternalMakrks(String msg){
    super(msg);
  }
}

class invalidExternalMarks extends Exception {
  public invalidExternalMarks(String msg){
    super(msg);
  }
}

class Main10{
  static void checkInternalMarks(double marks) throws invalidInternalMakrks {

    if(marks > 30 || marks < 0) 
      throw new invalidInternalMakrks("Invalid internal marks");

  }
  static void checkExternalMarks(double marks) throws invalidExternalMarks {

    if(marks > 70 || marks < 0) 
      throw new invalidExternalMarks("External Marks is exceeded");

  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
      System.out.println("Enter the internal Marks: ");
      double internal = sc.nextDouble();

      checkInternalMarks(internal);

      System.out.println("Enter the External Marks: ");
      double external = sc.nextDouble();

      checkExternalMarks(external);

      System.out.println("Marks is Entered succesfully");

    } catch (invalidInternalMakrks e) {
      System.out.println("Error: " + e.getMessage());

    } catch (invalidExternalMarks e) {
      System.out.println("Error: " + e.getMessage());
    }

    sc.close(); 
  }
}
