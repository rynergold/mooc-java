package part01.s05calculating;

import java.util.Scanner;

public class SumOfThreeNumbers {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    // Write your program here
    System.out.println("Give the first number:");
    int first = Integer.valueOf(scanner.nextLine());
    System.out.println("Give the second number:");
    int sec = Integer.valueOf(scanner.nextLine());
    System.out.println("Give the third number:");
    int third = Integer.valueOf(scanner.nextLine());
    int sum = first + sec + third;
    System.out.println("The sum of the numbers is " + sum);
  }
}
