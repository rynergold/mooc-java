package part01.s06conditionalstatements;

import java.util.Scanner;

public class Password {
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Write your program here
    System.out.println("Password?");
    String pw = s.nextLine();
    if (pw.equals("Caput Draconis")) {
      System.out.println("Welcome!");
    }
    System.out.println("Off with you!");
  }
}
