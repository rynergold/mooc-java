package part01.s06conditionalstatements.logic.exercises;

import java.util.Scanner;

public class CenturyAndYearType {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String prompt = "Enter year:";
    int century = 0;
    String type;
    String leapYear = "Leap year";
    String commonYear = "Common year";
    
    // Write your program here
    System.out.println(prompt);
    int input = Integer.parseInt(sc.nextLine());
    boolean isDivisibleBy4 = input % 4 == 0;
    boolean isDivisibleBy100 = input % 100 == 0;
    boolean isDivisibleBy400 = input % 400 == 0;
    boolean isLeapYear = (!isDivisibleBy100 && isDivisibleBy4) || isDivisibleBy100 && isDivisibleBy400;
    if (isLeapYear) {
      type = leapYear;
    } else {
      type = commonYear;
    }
    
    if (input > 2000) {
      century = 21;
      System.out.println("Century: " + century + ", Type: " + type);
      return;
    }
    if (input > 1900) {
      century = 20;
      System.out.println("Century: " + century + ", Type: " + type);
      return;
    }
    if (input > 1800) {
      century = 19;
      System.out.println("Century: " + century + ", Type: " + type);
      return;
    }
    if (input > 1799) {
      century = 18;
      System.out.println("Century: " + century + ", Type: " + type);
      return;
    }
    century = 1;
    System.out.println("Century: " + century + ", Type: " + type);
  }
}
