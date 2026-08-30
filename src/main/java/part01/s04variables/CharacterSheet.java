package part01.s04variables;

import java.util.Scanner;

public class CharacterSheet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
      System.out.println("Enter character name:");
      String name = scanner.nextLine();
      System.out.println("Enter character level:");
      int lvl = Integer.valueOf(scanner.nextLine());
      System.out.println("Enter gold coins:");
      double gold = Double.valueOf(scanner.nextLine());
      System.out.println("Is in active guild? (true/false):");
      boolean status = Boolean.valueOf(scanner.nextLine());
      System.out.println("Enter earned title:");
      String title = scanner.nextLine();
      System.out.println("=== CHARACTER PROFILE ===");
      System.out.println("Name: " + name);
      System.out.println("Full Title: " + name + " the " + title);
      System.out.println("Level: " + lvl);
      System.out.println("Purse: " + gold + " gold");
      System.out.println("Guild Member: " + status);
    }
}

