package part01.s03readinginput;

import java.util.Scanner;

public class Story {
  public static void main(String[] args) {
    // Write your program here
    Scanner s = new Scanner(System.in);
    
    
    System.out.println("I will tell you a story, but I need some information first.");
    System.out.println("What is the main character called?");
    String name = s.nextLine();
    String tcN = name.substring(0, 1).toUpperCase() + name.substring(1);
    System.out.println("What is their job?");
    String job = s.nextLine();
    System.out.println("Here is the story:");
    System.out.println("Once upon a time there was " + tcN + ", who was " + job + ".");
    System.out.println("On the way to work, " + tcN + " reflected on life.");
    System.out.println("Perhaps " + tcN + " will not be " + job + " forever.");
  }
}
