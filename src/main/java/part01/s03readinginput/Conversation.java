package part01.s03readinginput;

import java.util.Scanner;

public class Conversation {
    public static void main(String[] args) {
        // Write your program here
      Scanner s = new Scanner(System.in);
      String p1 = "Greetings! How are you doing?";
      String p2 = "Oh, how interesting. Tell me more!";
      String p3 = "Thanks for sharing!";
      
      System.out.println(p1);
      String u1 = s.nextLine();
      System.out.println(p2);
      String u2 = s.nextLine();
      System.out.println(p3);

    }
}
