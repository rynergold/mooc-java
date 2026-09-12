package part01.s06conditionalstatements.logic.exercises;

import java.util.Scanner;

public class QuadrantFinder {
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String enterX = "Enter x:";
    String enterY = "Enter y:";
    String quadrant1 = "Quadrant 1";
    String quadrant2 = "Quadrant 2";
    String quadrant3 = "Quadrant 3";
    String quadrant4 = "Quadrant 4";
    String origin = "Origin";
    String axis = "Axis";
    // Write your program here
    System.out.println(enterX);
    int x = Integer.parseInt(s.nextLine());
    System.out.println(enterY);
    int y = Integer.parseInt(s.nextLine());
    if (x == 0 && y == 0) {
      System.out.println(origin);
      return;
    }
    if (x == 0 || y == 0) {
      System.out.println(axis);
      return;
    }
    if (x < 0 && y < 0) {
      System.out.println(quadrant3);
      return;
    }
    if (x > 0 && y > 0) {
      System.out.println(quadrant1);
      return;
    }
    if (x < 0 || y > 0) {
      System.out.println(quadrant2);
      return;
    }
    System.out.println(quadrant4);
  }
}
