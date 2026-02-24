
// 4. Write a program for a Library Management System where different operations may
// generate four types of exceptions: ArithmeticException,
// ArrayIndexOutOfBoundsException, StringIndexOutOfBoundsException, and
// NullPointerException. Simulate situations such as calculating overdue fines, accessing
// book lists, extracting characters from book codes, and handling missing borrower details
// so that each of these exceptions can occur. Use different catch blocks to handle each
// exception separately and ensure the program does not terminate abruptly by using the
// finally block to display a message confirming that the system has safely closed the
// operation.

class Main3 {
  public static void main(String[] arga) {

    try {
      int days = 10;
      int fine = days/0;

      String[] books = {"OnePiee", "SSMM", "Bording", "NiGhtcamo"};
      System.out.println(books[5]);

      String bookcode = "RE4";
      System.out.println(bookcode.charAt(5));

      String borrower = null;
      System.out.println(borrower.length());

    } catch (ArithmeticException e) {
      System.out.println("Cant divide using 0");
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Array index out of bound of the list");
    } catch(StringIndexOutOfBoundsException e){
      System.out.println("String characters out of bound for bookCode");
    } catch(NullPointerException e){
      System.out.println("NullPointer exception happend");
    } finally{
      System.out.println("Libary system succesfully closed");
    }

  }
}
