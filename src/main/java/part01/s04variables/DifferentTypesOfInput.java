package part01.s04variables;

import java.util.Scanner;

public class DifferentTypesOfInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
      System.out.println("Give a string:");
      String v1 = scanner.nextLine();
      System.out.println("Give an integer:");
      int v2 = Integer.valueOf(scanner.nextLine());
      System.out.println("Give a double:");
      double v3 = Double.valueOf(scanner.nextLine());
      System.out.println("Give a boolean:");
      boolean v4 = Boolean.valueOf(scanner.nextLine());
      System.out.println("You gave the string " + v1);
      System.out.println("You gave the integer " + v2);
      System.out.println("You gave the double " + v3);
      System.out.println("You gave the boolean " + v4);
      
    }
}
