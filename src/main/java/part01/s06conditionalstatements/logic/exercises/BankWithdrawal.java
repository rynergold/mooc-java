package part01.s06conditionalstatements.logic.exercises;

import java.util.Scanner;

public class BankWithdrawal {
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Write your program here
    System.out.println("Enter current balance:");
    int b = Integer.parseInt(s.nextLine());
    System.out.println("Enter withdrawal amount:");
    int w = Integer.parseInt(s.nextLine());
    
    if (w < 1 || b < w) {
      System.out.println("Invalid withdrawal");
      return;
    }
    System.out.println("Withdrawal successful. Remaining balance: " + (b - w));
  }
}
