package part01.s06conditionalstatements.logic.exercises;

import java.util.Scanner;

public class CinemaTicket {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Write your program here
    String freeForUnder5s = "Price: 0€";
    String costfor65AndOver = "Price: 8€";
    String costfor5And64OnWed = "Price: 9€";
    String costfor5And64ExceptWed = "Price: 12€";
    String WEDNESDAY = "Wednesday";
    String enterAge = "Enter age:";
    String enterDay = "Enter day:";
    System.out.println(enterAge);
    int age = Integer.parseInt(sc.nextLine());
    System.out.println(enterDay);
    String day = sc.nextLine();
    
    if (age < 5) {
      System.out.println(freeForUnder5s);
      return;
    }
    if (age >= 65) {
      System.out.println(costfor65AndOver);
      return;
    }
    if (day.equals(WEDNESDAY)) {
      System.out.println(costfor5And64OnWed);
      return;
    }
    System.out.println(costfor5And64ExceptWed);
  }
}
