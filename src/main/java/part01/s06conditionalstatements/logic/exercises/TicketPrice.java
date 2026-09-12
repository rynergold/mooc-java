package part01.s06conditionalstatements.logic.exercises;

import java.util.Scanner;

public class TicketPrice {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Write your program here
    String prompt = "Enter age:";
    String fiveEuros = "Ticket price: 5 euros";
    String tenEuros = "Ticket price: 10 euros";
    System.out.println(prompt);
    int age = Integer.parseInt(sc.nextLine());
    boolean isAgeLessThan12 = age < 12;
    if (isAgeLessThan12) {
      System.out.println(fiveEuros);
      return;
    }
    System.out.println(tenEuros);
  }
}
