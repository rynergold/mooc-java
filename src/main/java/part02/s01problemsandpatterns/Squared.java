package part02.s01problemsandpatterns;

import java.util.Scanner;

public class Squared {
  public static void main(String[] args) {
    // Write your program here
    /*
     |_0_\ <- BOB
     [__] <- COMPUTER
    |_0_\ => 4 => [__]
      */
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number:");
    int userInput = Integer.parseInt(scanner.nextLine());
    int squareOfX = userInput * userInput;
    String squared = "Number: " + userInput + " , squared is: " + squareOfX;
    System.out.println(squared);

    scanner.close();
  }
}
