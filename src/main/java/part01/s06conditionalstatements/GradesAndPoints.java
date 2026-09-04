package part01.s06conditionalstatements;

import java.util.Scanner;

public class GradesAndPoints {
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    // Write your program here
    System.out.println("Give points [0-100]:");
    int points = Integer.parseInt(scanner.nextLine());
    if (points > 100) {
      System.out.println("Grade: incredible!");
    } else if (points > 89) {
      System.out.println("Grade: 5");
    } else if (points > 79) {
      System.out.println("Grade: 4");
    } else if (points > 69) {
      System.out.println("Grade: 3");
    } else if (points > 59) {
      System.out.println("Grade: 2");
    } else if (points > 49) {
      System.out.println("Grade: 1");
    } else if (points > -1) {
      System.out.println("Grade: failed");
    } else {
      System.out.println("Grade: impossible!");
    }
  }
}
