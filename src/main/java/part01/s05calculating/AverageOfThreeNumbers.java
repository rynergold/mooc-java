package part01.s05calculating;

import java.util.Scanner;

public class AverageOfThreeNumbers {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    // Write your program here
    System.out.println("Give the first number:");
    double first = Double.valueOf(scanner.nextLine());
    System.out.println("Give the second number:");
    double second = Double.valueOf(scanner.nextLine());
    System.out.println("Give the third number:");
    double third = Double.valueOf(scanner.nextLine());
    double avg = ((first + second + third) * 1.0) / 3;
    System.out.println("The average is " + avg);
    
  }
}
