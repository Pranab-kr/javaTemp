// 7. Write a program that accepts a string from the user and uses string functions to find the
// length of the string, display the first and last characters, and check whether the string is
// empty or not.

import java.util.Scanner;

class Main5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a String: ");
    String inp = sc.nextLine();

    if (inp.isEmpty()) {
      System.out.println("Enter a valid String");
      
    } else {
      System.out.println("The length of the String is: " + inp.length());

      System.out.println("First characters of the str is: " + inp.charAt(0));

      System.out.println("Last characters of the str is: " + inp.charAt(inp.length() - 1));
    }
    
    sc.close();
  }
}
