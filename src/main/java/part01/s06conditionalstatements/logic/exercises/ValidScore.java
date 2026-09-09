package part01.s06conditionalstatements.logic.exercises;

import java.util.Scanner;

public class ValidScore {
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Write your program here
    System.out.println("Enter score:");
    int score = Integer.parseInt(s.nextLine());
    if (score < 0 || score > 100) {
      System.out.println("Invalid score");
      return;
    }
    
    System.out.println("Valid score");
    
  }
}
