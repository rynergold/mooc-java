package part01.s06conditionalstatements;

import java.util.Scanner;

public class OddOrEven {
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Write your program here
    System.out.println("Give a number:");
    int number = Integer.valueOf(s.nextLine());
    boolean isEven = number % 2 == 0;
    if (isEven) {
      System.out.println("Number " + number + " is even.");
    }
    System.out.println("Number " + number + " is odd.");
  }
}
