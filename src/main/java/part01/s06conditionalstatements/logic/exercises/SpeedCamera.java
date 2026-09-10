package part01.s06conditionalstatements.logic.exercises;

import java.util.Scanner;

public class SpeedCamera {
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int l1 = 40; // lower limit
    int l2 = 100; // upper limit
    String invalid = "Speed violation";
    String valid = "Speed normal";
    // Write your program here
    System.out.println("Enter vehicle speed:");
    int speed = Integer.parseInt(s.nextLine());
    boolean isInvalid = speed < l1 || speed > l2;
    if (isInvalid) {
      System.out.println(invalid);
      return;
    }
    System.out.println(valid);
  }
}
