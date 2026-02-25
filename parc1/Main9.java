
// 11. Write a program to accept an array and a search element, and determine whether the
// search element exists in the array. If it exists, display its index position.
import java.util.Scanner;

class Main9{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter how many ele of the arr: ");
    int row = sc.nextInt();
    int[] arr = new int[row];

    System.out.println("Enter the elements of the arr: ");

    for(int i = 0 ; i< row ; i++){
      arr[i] = sc.nextInt();
    }

    System.out.println("Enter the element u want to find: ");
    int target = sc.nextInt();

    boolean isFound = false;

    for(int i= 0 ; i<row ; i++) {
      if(arr[i] == target){
        System.out.println("Your element was found in index no: " + i);

        isFound = true;

        break; 
      }
    }
    if(!isFound){
      System.out.println("The element was no found on array!");
    }
    sc.close();


  }
}
