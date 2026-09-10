package part01.s06conditionalstatements.logic.exercises;

import java.util.Scanner;

public class RangeOverlap {
  
  public static void main(String[] args) {
    String OVERLAPPING = "Overlapping";
    String DISJOINT = "Disjoint";
    Scanner s = new Scanner(System.in);
    // Write your program here
    
    // - Gather Inputs : easiest part
    System.out.println("Enter start 1:");
    int s1 = Integer.parseInt(s.nextLine());
    System.out.println("Enter end 1:");
    int e1 = Integer.parseInt(s.nextLine());
    System.out.println("Enter start 2:");
    int s2 = Integer.parseInt(s.nextLine());
    System.out.println("Enter end 2:");
    int e2 = Integer.parseInt(s.nextLine());
    
    if (s1 > e2 || e1 < s2) {
      System.out.println(DISJOINT);
      return;
    }
    System.out.println(OVERLAPPING);
    
    
  }
}
