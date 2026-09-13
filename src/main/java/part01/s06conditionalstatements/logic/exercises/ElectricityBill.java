package part01.s06conditionalstatements.logic.exercises;

import java.util.Scanner;

public class ElectricityBill {
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Write your program here
    String prompt = "Enter consumption (kWh):";
    String output = "Total bill: ";
    double fee = 5.0;
    double rate1 = 0.10;
    double rate2 = 0.15;
    double rate3 = 0.20;
    double totalCost;
    int consumption;
    
    System.out.println(prompt);
    consumption = Integer.parseInt(scanner.nextLine());
    boolean isConsumptionTier1 = consumption < 101;
    boolean isConsumptionTier2 = consumption < 201;
    if (consumption <= 0) {
      System.out.println(output + fee + "€");
      return;
    }
    if (isConsumptionTier1) {
      totalCost = (consumption * rate1) + fee;
      System.out.println(output + totalCost + "€");
      return;
    }
    if (isConsumptionTier2) {
      totalCost = ((consumption - 100)) * rate2 + 15.0;
      System.out.println(output + totalCost + "€");
      return;
    }
    totalCost = (consumption - 200) * rate3 + 30.0;
    System.out.println(output + totalCost + "€");
  }
}
