package part01.s06conditionalstatements;

import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
      System.out.println("How old are you?");
      int age = Integer.parseInt(scanner.nextLine());
      boolean isAgeOk = age >= 0 && age <= 120;
      if (isAgeOk) {
        System.out.println("OK");
      }
      System.out.println("Impossible!");
    }
}
