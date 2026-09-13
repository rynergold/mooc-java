package part01.s06conditionalstatements.logic.exercises;

import java.util.Scanner;

public class TimeDifference {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Write your program here
    String s1 = "Enter start hour:";
    String s2 = "Enter start minute:";
    String s3 = "Enter end hour:";
    String s4 = "Enter end minute:";
    int X = 0;
    int Y = 0;
    
    System.out.println(s1);
    int startHour = Integer.parseInt(sc.nextLine());
    System.out.println(s2);
    int startMin = Integer.parseInt(sc.nextLine());
    System.out.println(s3);
    int endHour = Integer.parseInt(sc.nextLine());
    System.out.println(s4);
    int endMin = Integer.parseInt(sc.nextLine());
    
    X = endHour - startHour;
    Y = endMin - startMin;
    // The problem is if it's like:
    // startHour = 22  , startMin = 50
    // endHour   = 1   , endMin   = 20
    // 20 - 50 = -30
    // So we need to deduct 1 from 22 -> 21
    // Leaves second problem: 23 - 1 = 22
    // The above is clearly wrong but the idea is there's only 2 hours
    // Therefore 2 hours and 30 mins
    // If I convert 01:20AM to 25:20
    // 25:20 - 22:50 = 2:30
    // but then what about 2, 3, 4, and so on?
    // That doesn't seem right
    // convert to minutes
    
    int startTotal = (startHour * 60) + startMin;
    int endTotal = (endHour * 60) + endMin;
    
    if (endTotal < startTotal) {
      endTotal = endTotal + 1440;
    }
    
    int timeDiffInMins = endTotal - startTotal;
    
    X = timeDiffInMins / 60;
    Y = timeDiffInMins % 60;
    
    System.out.println("Duration: " + X + " hours and " + Y + " minutes");
  }
}
