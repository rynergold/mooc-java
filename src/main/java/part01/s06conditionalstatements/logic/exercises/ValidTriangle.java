package part01.s06conditionalstatements.logic.exercises;

import java.util.Scanner;

public class ValidTriangle {
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    String v = "Valid triangle";
    String nV = "Invalid triangle";
    // Write your program here
    
    System.out.println("Enter first side:");
    int a = giveLength(s);
    System.out.println("Enter second side:");
    int b = giveLength(s);
    System.out.println("Enter third side:");
    int c = giveLength(s);
    if (a < 1 || b < 1 || c < 1) {
      System.out.println(nV);
      return;
    }
    // all sides must be greater than zero
    // b + c > a
    boolean gTa = b + c > a;
    // c + a > b
    boolean gTb = c + a > b;
    // a + b > c
    boolean gTc = a + b > c;
    // Standard Approach:
    //    if (gTa && gTb && gTc) {
    //      System.out.println(v);
    //      return;
    //    }
    // Apply Morgan's law
    if (!gTa || !gTb || !gTc) {
      System.out.println(nV);
      return;
    }
    //    if (gTa && gTb && gTc) {
    //      System.out.println(nV);
    //    }
    //
    
    System.out.println(v);
  }
  
  static int giveLength(Scanner s) {
    return Integer.parseInt(s.nextLine());
  }
}
