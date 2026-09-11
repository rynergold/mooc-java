package part01.s06conditionalstatements.logic.exercises;

import java.util.Scanner;

public class DiscountEligibility {
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int minAge = 18;
    int maxAge = 64;
    String DISCOUNT = "Discount applied";
    String STANDARD = "Standard price";
    
    // Write your program here
    System.out.println("Enter age:");
    int age = Integer.parseInt(s.nextLine());
    boolean isDiscountAge = age < minAge || age > maxAge;
    if (isDiscountAge) {
      System.out.println(DISCOUNT);
      return;
    }
    System.out.println(STANDARD);
    
  }
}
