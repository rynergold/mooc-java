package part01.s03readinginput;

import java.util.Scanner;

public class MadLibs {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    // Write your program here
    System.out.println("Give an adjective:");
    String a = s.nextLine();
    System.out.println("Give a noun:");
    String n = s.nextLine();
    System.out.println("Give a past-tense verb:");
    String v = s.nextLine();
    System.out.println("Give a quote or shout:");
    String qos = s.nextLine();
    
    System.out.println("--- Mad Libs Adventure ---");
    System.out.println("Today, a " + a + " " + n + " " + v + " into the server room.");
    System.out.println("It shouted: \"" + qos + '"');
  }
}
