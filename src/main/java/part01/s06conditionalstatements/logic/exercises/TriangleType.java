package part01.s06conditionalstatements.logic.exercises;

import java.util.Scanner;

public class TriangleType {
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String EQUILATERAL = "Equilateral";
    String ISOSCELES = "Isosceles";
    String SCALENE = "Scalene";
    String prompt1 = "Enter side 1:";
    String prompt2 = "Enter side 2:";
    String prompt3 = "Enter side 3:";
    // Write your program here
    System.out.println(prompt1);
    int side1 = Integer.parseInt(s.nextLine());
    System.out.println(prompt2);
    int side2 = Integer.parseInt(s.nextLine());
    System.out.println(prompt3);
    int side3 = Integer.parseInt(s.nextLine());
    boolean hasTriangleEquality =
      side2 + side3 <= side1 || side3 + side1 <= side2 || side1 + side2 <= side3;
    boolean isNotTriangle = side1 < 1 || side2 < 1 || side3 < 1 || hasTriangleEquality;
    
    if (isNotTriangle) {
      System.out.println("Not a triangle");
      return;
    }
    
    boolean isEquilateral = side1 == side2 && side1 == side3;
    boolean isIsoscelesA = (side1 == side2 && side1 != side3) || (side1 != side2 && side1 == side3);
    boolean isIsoscelesB = (side2 == side1 && side2 != side3) || (side2 != side1 && side2 == side3);
    boolean isScalene = side1 != side2 && side1 != side3 && side2 != side3;
    
    if (isEquilateral) {
      System.out.println(EQUILATERAL);
      return;
    }
    if (isIsoscelesA || isIsoscelesB) {
      System.out.println(ISOSCELES);
      return;
    }
    
    System.out.println(SCALENE);
    
  }
}
