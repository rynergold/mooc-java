package part01.s06conditionalstatements;

import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
      
      System.out.println("Enter the first string:");
      String string1 = scanner.nextLine();
      System.out.println("Enter the second string:");
      String string2 = scanner.nextLine();
      boolean areStringsEqual = string1.equals(string2);
      if (areStringsEqual) {
        System.out.println("Same");
      }
      System.out.println("Different");
    }
}
