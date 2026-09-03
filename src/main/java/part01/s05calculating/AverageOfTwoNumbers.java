package part01.s05calculating;

import java.util.Scanner;

public class AverageOfTwoNumbers {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    // Write your program here
    System.out.println("Give the first number:");
    double first = 1.0 * Double.valueOf(scanner.nextLine());
    System.out.println("Give the second number:");
    double second = 1.0 * Double.valueOf(scanner.nextLine());
    double average = (first + second) / 2;
    System.out.println("The average is " + average);
    
  }
}
