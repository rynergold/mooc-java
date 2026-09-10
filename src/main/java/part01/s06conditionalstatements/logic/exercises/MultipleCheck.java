package part01.s06conditionalstatements.logic.exercises;

import java.util.Scanner;

public class MultipleCheck {
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    // remainder
    int r;
    // Write your program here
    System.out.println("Enter first number:");
    int a = Integer.parseInt(s.nextLine());
    System.out.println("Enter second number:");
    int b = Integer.parseInt(s.nextLine());
    
    if (a == 0 && b == 0) {
      System.out.println("Not multiples");
      return;
    }
    // don't divide by 0 - how???
    // if one is 0, then one of the results will always be 0 therefore multiple
    // therefore we have to see if the result of the other mod.
    if (a == 0 || b == 0) {
      System.out.println("Multiples");
      return;
    }
    // if neither a OR b are 0 then we do a traditional de Morgan check
    if (a % b == 0 || b % a == 0) {
      System.out.println("Multiples");
      return;
    }
    System.out.println("Not multiples");
  }
}
