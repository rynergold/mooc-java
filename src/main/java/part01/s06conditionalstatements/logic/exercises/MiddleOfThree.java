package part01.s06conditionalstatements.logic.exercises;

import java.util.Scanner;

public class MiddleOfThree {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Write your program here
    String prompt1 = "Enter first number:";
    String prompt2 = "Enter second number:";
    String prompt3 = "Enter third number:";
    int middleNumber = 0;
    
    System.out.println(prompt1);
    int a = Integer.parseInt(sc.nextLine());
    System.out.println(prompt2);
    int b = Integer.parseInt(sc.nextLine());
    System.out.println(prompt3);
    int c = Integer.parseInt(sc.nextLine());
    
    // Sort the numbers without using arrays or sorting methods.
    if (a < b && a > c || a < c && a > b) {
      String outcome = "The middle number is: " + a;
      System.out.println(outcome);
      return;
    }
    if (b < a && b > c || b < c && b > a) {
      String outcome = "The middle number is: " + b;
      System.out.println(outcome);
      return;
    }
    if (a == b && a > c) {
      String outcome = "The middle number is: " + a;
      System.out.println(outcome);
      return;
    }
    String outcome = "The middle number is: " + c;
    System.out.println(outcome);
    
    
  }
}
