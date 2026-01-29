// 12. Write a program for user defined exceptions that checks the internal & external marks. If
// the internal marks is greater than 30 or less than 0 which raises the exception the invalid
// internal marks , if the external marks is greater than 70 or less than 0 it raises the
// exception & displays the message the external marks is exceeded. Create the above
// exception &amp; use it in your program.

import java.util.Scanner;

class InvalidInternalMarksException extends Exception {
  public InvalidInternalMarksException(String msg) {
    super(msg);
  }
}

class InvalidExternalMarksException extends Exception {
  public InvalidExternalMarksException(String msg) {
    super(msg);
  }
}

public class Main9 {

  static void InternalMarks(int marks) throws InvalidInternalMarksException {
if (marks > 30 || marks < 0 ) {
  throw new InvalidExternalMarksException("Invalid Internal Marks");

}
  }


  static void ExternalMarks(int marks) throws InvalidExternalMarksException {
if (marks > 70 || marks < 0 ) {
  throw new InvalidExternalMarksException("Invalid External Marks");

}
  }
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    try {
      System.out.println("Enter Internal MArks: ");
      int internal = sc.nextInt();
      InternalMarks(internal);

      System.out.println("Enter External Marks");
      int external = sc.nextInt();
      ExternalMarks(external);

    } catch (InvalidInternalMarksException e) {
      System.out.println(e.getMessage());
    } catch( InvalidExternalMarksException e)
    {
      System.out.println(e.getMessage());
    }

  }
  // sc.close();

}
