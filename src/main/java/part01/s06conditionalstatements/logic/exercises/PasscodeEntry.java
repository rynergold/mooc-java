package part01.s06conditionalstatements.logic.exercises;

import java.util.Scanner;

public class PasscodeEntry {
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String validPin = "Access granted";
    String invalidPin = "Invalid PIN";
    int lowerLimit = 1000;
    int upperLimit = 9999;
    // Write your program here
    System.out.println("Enter 4-digit PIN:");
    int entry = Integer.parseInt(s.nextLine());
    boolean isPinInvalid = entry < lowerLimit || entry > upperLimit;
    if (isPinInvalid) {
      System.out.println(invalidPin);
      return;
    }
    System.out.println(validPin);
  }
}
