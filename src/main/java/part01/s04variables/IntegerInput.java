package part01.s04variables;

import java.util.Scanner;

public class IntegerInput {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    // Write your program here
    System.out.println("Give a number:");
    int n = Integer.valueOf(scanner.nextInt());
    System.out.println("You gave the number " + n);
  }
}
