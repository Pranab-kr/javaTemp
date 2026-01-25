
// 5. Develop a program that accepts a string and performs the following operations: Convert
// the string to uppercase, Convert the string to lowercase, Reverse the string, Count the
// number of words in the string
import java.util.Scanner;

public class Main4 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a String: ");
    String str = sc.nextLine();

    System.out.println("UpperCase: " + str.toUpperCase());

    System.out.println("LowerCase: " + str.toLowerCase());

    String rev = "";

    for (int i = str.length() - 1; i >= 0; i--) {
      rev = rev + str.charAt(i);

    }

    System.out.println("the reverse: "+ rev);
    String[] strWords = str.trim().split("\\s+");

    System.out.println("The no of words is: " + strWords.length);

    sc.close();
  }

}
