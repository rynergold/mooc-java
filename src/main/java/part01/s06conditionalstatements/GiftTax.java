package part01.s06conditionalstatements;

import java.util.Scanner;

public class GiftTax {
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    // Write your program here
    
    int r5 = 1_000_000;
    int r4 = 200_000;
    int r3 = 55_000;
    int r2 = 25_000;
    int r1 = 5000;
    
    // Tax at lower limit bands
    double tR1 = 0.08; // 100; 5000 - 25,000
    double tR2 = 0.10; // 1700; 25,000 - 55,000
    double tR3 = 0.12; // 4700; 55,000 - 200,000
    double tR4 = 0.15; // 22,100; 200,000 - 1,000,000
    double tR5 = 0.17; // 142,100; 1,000,000+
    
    double t;
    System.out.println("Value of the gift?");
    int g = Integer.parseInt(scanner.nextLine());
    if (g > (r5 - 1)) {
      t = 142_100 + (g - r5) * tR5;
      System.out.println("Tax: " + t);
    } else if (g > (r4 - 1)) {
      t = 22_100 + (g - r4) * tR4;
      System.out.println("Tax: " + t);
    } else if (g > (r3 - 1)) {
      t = 4_700 + (g - r3) * tR3;
      System.out.println("Tax: " + t);
    } else if (g > (r2 - 1)) {
      t = 1_700 + (g - r2) * tR2;
      System.out.println("Tax: " + t);
    } else if (g > (r1 - 1)) {
      t = 100 + (g - r1) * tR1;
      System.out.println("Tax: " + t);
    } else if (g > 0) {
      System.out.println("No tax!");
    } else {
      System.out.println("No tax!");
    }
  }
}
