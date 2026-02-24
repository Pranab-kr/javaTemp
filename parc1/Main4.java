
// 5. Develop a program that accepts a string and performs the following operations: Convert
// the string to uppercase, Convert the string to lowercase, Reverse the string, Count the
// number of words in the string

import java.util.Scanner;

class Main4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   System.out.println("Enter a string input: "); 
    
   String input = sc.nextLine();

   System.out.println("uppercase: " + input.toUpperCase());
   
   System.out.println("lowercase: " + input.toLowerCase());

   String rev = "";
   for(int i = input.length() - 1 ; i>=0 ; i--){
     rev = rev + input.charAt(i);
   }
   System.out.println("Reverse: " + rev);

   String[] words = input.trim().split("\\s+");

   System.out.println("The number of words is : " + words.length);
  }
}
