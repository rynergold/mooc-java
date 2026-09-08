package part01.s06conditionalstatements.logic.exercises;

import java.util.Scanner;

public class PositiveCheck {
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Write your program here
    System.out.println("Give a number:");
    int i = Integer.parseInt(s.nextLine());
    if (i < 1) {
      System.out.println("The number is not positive");
      return;
    }
    System.out.println("The number is positive");
  }
}