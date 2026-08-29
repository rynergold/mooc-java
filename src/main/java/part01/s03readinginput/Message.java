package part01.s03readinginput;

import java.util.Scanner;

public class Message {
    public static void main(String[] args) {
        // Write your program here
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Write a message: ");
      String result = scan.nextLine();
      System.out.println(result);
    }
}
