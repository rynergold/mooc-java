package part01.s03readinginput;

import java.util.Scanner;

public class Greeting {
  public static void main(String[] args) {
    // Write your program here
    Scanner s = new Scanner(System.in);
    
    System.out.println("What's your name?");
    String name = s.next();
    
    // Make sure name is always capitalized
    // Why null check: if our input is an empty string, this approach will raise
    // IndexOutOfBoundsException. This is because the end-index (1) is greater than the empty string’s length (0) when we call INPUT.substring(1):
    if (name == null) {
      System.out.println("no name");
    } else {
      String titleCaseName = name.substring(0, 1).toUpperCase() + name.substring(1);
      System.out.println("Hi " + titleCaseName);
    }
    
  }
}
