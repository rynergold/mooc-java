package part01.s03readinginput;

import java.util.Scanner;

public class MessageThreeTimes {
    public static void main(String[] args) {
        // Write your program here

      Scanner sc = new Scanner(System.in);
      
      System.out.println("Write a message: ");
      String msg = sc.nextLine();
      
      System.out.println(msg);
      System.out.println(msg);
      System.out.println(msg);
    }
}
