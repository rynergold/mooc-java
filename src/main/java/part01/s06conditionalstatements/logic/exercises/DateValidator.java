package part01.s06conditionalstatements.logic.exercises;

import java.util.Scanner;

public class DateValidator {
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Write your program here
    int daysInMonth;
    String promptDay = "Enter day:";
    System.out.println(promptDay);
    int day = Integer.parseInt(scanner.nextLine());
    String promptMonth = "Enter month:";
    System.out.println(promptMonth);
    int month = Integer.parseInt(scanner.nextLine());
    String promptYear = "Enter year:";
    System.out.println(promptYear);
    int year = Integer.parseInt(scanner.nextLine());
    String invalidDate = "Invalid date";
    String validDate = "Valid date";
    // There's probably a mathematical formula to easily do months with 31 days, 30 days
    if (year < 1) {
      System.out.println(invalidDate);
      return;
    }
    if (month > 12 || month < 1) {
      System.out.println(invalidDate);
      return;
    }
    
    if (day < 1) {
      System.out.println(invalidDate);
      return;
    }
    
    boolean isDivisibleBy4 = year % 4 == 0;
    boolean isDivisibleBy100 = year % 100 == 0;
    boolean isDivisibleBy400 = year % 400 == 0;
    boolean isLeapYear =
      (!isDivisibleBy100 && isDivisibleBy4) || isDivisibleBy100 && isDivisibleBy400;
    if (month == 2 && isLeapYear && day > 29) {
      System.out.println(invalidDate);
      return;
    }
    if (month == 2 && !isLeapYear && day > 28) {
      System.out.println(invalidDate);
      return;
    }
    if (month == 4 || month == 6 || month == 9 || month == 11) {
      daysInMonth = 30;
    } else {
      daysInMonth = 31;
    }
    if (day > daysInMonth) {
      System.out.println(invalidDate);
      return;
    }
    System.out.println(validDate);
    
  }
}
