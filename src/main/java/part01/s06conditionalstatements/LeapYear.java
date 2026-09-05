package part01.s06conditionalstatements;

import java.util.Scanner;

public class LeapYear {
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    // Write your program here
    System.out.println("Give a year:");
    int year = Integer.parseInt(scanner.nextLine());
    
    boolean isDivisibleBy4 = year % 4 == 0;
    boolean isDivisibleBy100 = year % 100 == 0;
    boolean isDivisibleBy400 = year % 400 == 0;
    
    if (!isDivisibleBy100 && isDivisibleBy4) {
      System.out.println("The year is a leap year.");
    } else if (isDivisibleBy100 && isDivisibleBy400) {
      System.out.println("The year is a leap year.");
    } else {
      System.out.println("The year is not a leap year.");
    }
  }
}
