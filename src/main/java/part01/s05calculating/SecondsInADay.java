package part01.s05calculating;

import java.util.Scanner;

public class SecondsInADay {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Write your program here
      System.out.println("How many days would you like to convert to seconds?");
      int i = Integer.valueOf(s.nextLine());
      // 1 minute = 60s
      // 1 hr (60 minutes) = 60 x 60 = 3600
      // 1 day (24 hours) = 24 x 3600 = 14400 + 72000 = 86400
      // Therefore 1 days : 86,400 seconds
      int dTS = 864000; // dTS = days to seconds
      System.out.println(i * dTS);
    }
}
