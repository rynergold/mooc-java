package part01.s06conditionalstatements;

import java.util.Scanner;

public class Positivity {
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Write your program here
    System.out.println("Give a number:");
    int num = Integer.parseInt(s.nextLine());
    if (num > 0) {
      System.out.println("The number is positive.");
    }
    System.out.println("The number is not positive.");
  }
}
