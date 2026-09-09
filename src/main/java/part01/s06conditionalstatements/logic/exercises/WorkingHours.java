package part01.s06conditionalstatements.logic.exercises;

import java.util.Scanner;

public class WorkingHours {
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Write your program here
    System.out.println("Enter hour (0-23):");
    int time = Integer.parseInt(s.nextLine());
    if (time < 9 || time > 17) {
      System.out.println("Office closed");
      return;
    }
    System.out.println("Office open");
  }
}
