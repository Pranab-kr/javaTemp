// 7. Write a program that accepts a string from the user and uses string functions to find the
// length of the string, display the first and last characters, and check whether the string is
// empty or not.

import java.util.Scanner;

public class Main5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a String");
    String str = sc.nextLine();

    if (str.isEmpty()) {
      System.out.println("The string is empty");

    } else {
      System.out.println("the length: " + str.length());

      System.out.println("The first char: " + str.charAt(0));

      System.out.println("The last char: " + str.charAt(str.length() - 1));

    }
    sc.close();
  }

}
