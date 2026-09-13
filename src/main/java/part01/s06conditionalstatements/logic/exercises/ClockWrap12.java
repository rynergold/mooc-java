package part01.s06conditionalstatements.logic.exercises;

import java.util.Scanner;

public class ClockWrap12 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Write your program here
    String prompt = "Enter hour (0-23):";
    String midnight = "12 AM";
    String noon = "12 PM";
    String am = " AM";
    String pm = " PM";
    int convert24to12hrClock = 12;
    System.out.println(prompt);
    int hour = Integer.parseInt(sc.next());
    if (hour == 0) {
      System.out.println(midnight);
      return;
    }
    if (hour == 12) {
      System.out.println(noon);
      return;
    }
    if (hour > 12) {
      hour = hour - convert24to12hrClock;
      System.out.println(hour + pm);
      return;
    }
    System.out.println(hour + am);
  }
}
