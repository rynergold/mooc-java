package part01.s05calculating;

import java.util.Scanner;

public class BillSplitter {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    // Write your program here
    System.out.println("Enter food bill:");
    double bill = Double.valueOf(scanner.nextLine());
    System.out.println("Enter tip percentage (e.g. 15 for 15%):");
    int tp = Integer.valueOf(scanner.nextLine());
    double t = bill * ((tp * 1.0)/ 100);
    System.out.println("Enter number of people splitting:");
    int p = Integer.valueOf(scanner.nextLine());
    double tb = 1.0 * (bill + t);
    double tpp = tb / p;
    
    System.out.println("Tip amount: " + t);
    System.out.println("Total bill: " + tb);
    System.out.println("Each person pays: " + tpp);
    
  }
}
