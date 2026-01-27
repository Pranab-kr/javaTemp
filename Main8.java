
// 11. Write a program to accept an array and a search element, and determine whether the
// search element exists in the array. If it exists, display its index position.
import java.util.Scanner;

public class Main8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter how many arr ele: ");
    int n = sc.nextInt();

    int[] arr = new int[n];
    System.out.println("Enter the ele of the arr: ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();

    }

    System.out.println("Enter the ele u want to search: ");
    int target = sc.nextInt();
    boolean found = false;

    for (int i = 0; i < n; i++) {
      if (arr[i] == target) {
        System.out.println("Target found at index of: " + i);
        found = true;
        break;

      }
    }

    if (!found) {
      System.out.println("Target was not found");

    }
    sc.close();
  }

}
