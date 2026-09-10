package part01.s06conditionalstatements.logic.exercises;

import java.util.Scanner;

public class TrafficLight {
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String STOP = "Stop";
    String SLOW_DOWN = "Slow down";
    String GO = "Go";
    String red = "red";
    String yellow = "yellow";
    String green = "green";
    // Write your program here
    System.out.println("Enter traffic light color:");
    String color = s.nextLine();
    boolean isRed = color.equals(red);
    boolean isYellow = color.equals(yellow);
    boolean isGreen = color.equals(green);
    if (isRed) {
      System.out.println(STOP);
      return;
    }
    if (isYellow) {
      System.out.println(SLOW_DOWN);
      return;
    }
    if (isGreen) {
      System.out.println(GO);
      return;
    }
    System.out.println("Invalid color");
  }
}
