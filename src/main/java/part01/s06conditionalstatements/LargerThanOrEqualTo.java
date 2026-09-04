package part01.s06conditionalstatements;

import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Write your program here
      System.out.println("Give the first number:");
      int first = Integer.valueOf(s.nextLine());
      System.out.println("Give the second number:");
      int second = Integer.valueOf(s.nextLine());
      
      if(first > second){
        System.out.println("Greater number is: " + first);
      } else if (second > first ){
        System.out.println("Greater number is: " + second);
      } else {
        System.out.println("The numbers are equal!");
      }
    }
}
