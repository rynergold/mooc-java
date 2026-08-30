package part01.s04variables;

import java.util.Scanner;

public class DoubleInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
      System.out.println("Give a number:");
      double num = scanner.nextDouble();
      System.out.println("You gave the number " + num);
    }
}
