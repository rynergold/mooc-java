package part01.s06conditionalstatements.logic.exercises;

import java.util.Scanner;

public class AbsoluteValue {
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Write your program here
    System.out.println("Give a number:");
    int n = Integer.parseInt(s.nextLine());
    if (n < 0) {
      System.out.println((n * -1));
      return;
    }
    System.out.println(n);
    
  }
}
