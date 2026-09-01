package part01.s05calculating;

import java.util.Scanner;

public class SumOfTwoNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // Write your program here
    System.out.println("Give the first number:");
    int f = Integer.valueOf(sc.nextLine());
    System.out.println("Give the second number:");
    int n = Integer.valueOf(sc.nextLine());
    int s = f + n;
    System.out.println("The sum of the numbers is " + s);
  }
}
