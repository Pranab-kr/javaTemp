// 4. Write a program for a Library Management System where different operations may
// generate four types of exceptions: ArithmeticException,
// ArrayIndexOutOfBoundsException, StringIndexOutOfBoundsException, and
// NullPointerException. Simulate situations such as calculating overdue fines, accessing
// book lists, extracting characters from book codes, and handling missing borrower details
// so that each of these exceptions can occur. Use different catch blocks to handle each
// exception separately and ensure the program does not terminate abruptly by using the
// finally block to display a message confirming that the system has safely closed the
// operation.

public class Main3 {
  public static void main(String[] args) {

    try {
      int days = 10;
      int fine = days / 0;
      System.out.println("Fine: " + fine);

      String[] bookList = { "Jack", "OnePiece", "Circles", "Bias Train" };

      System.out.println(bookList[5]);

      String bookCode = "th231";

      System.out.println(bookCode.charAt(7));

      String borrower = null;
      System.out.println(borrower.length());
    } catch (ArithmeticException e) {
      System.out.println("Arithmetic error while calculation");

    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Array index out of bound");

    } catch (StringIndexOutOfBoundsException e) {
      System.out.println("String index out of bound ");

    } catch (NullPointerException e) {
      System.out.println("NullPointer exception ");

    } finally {
      System.out.println("Library system closed safely.");
    }

  }

}
