package part01.s06conditionalstatements.logic.exercises;

import java.util.Scanner;

public class TemperatureAlert {
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Write your program here
    System.out.println("Enter temperature:");
    int temperature = Integer.parseInt(s.nextLine());
    if (temperature < 2 || temperature > 8) {
      System.out.println("Temperature alarm!");
      return;
    }
    System.out.println("Temperature normal");
  }
  
}
