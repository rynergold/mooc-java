package part01.s06conditionalstatements.logic.exercises;

import java.util.Scanner;

public class MultipleCheck {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Write your program here
      System.out.println("Enter first number:");
      int a = Integer.parseInt(s.nextLine());
      System.out.println("Enter second number:");
      int b = Integer.parseInt(s.nextLine());
      if (a % b == 0 || b % a == 0){
        System.out.println("Multiples");
        return;
      }
      System.out.println("Not multiples");
    }
}
