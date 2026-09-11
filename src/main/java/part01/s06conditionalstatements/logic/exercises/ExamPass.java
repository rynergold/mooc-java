package part01.s06conditionalstatements.logic.exercises;

import java.util.Scanner;

public class ExamPass {
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String theoryPrompt = "Enter theory score:";
    String practicalPrompt = "Enter practical score:";
    String FAILED = "Failed";
    String PASSED = "Passed";
    int minScoreTheory = 50;
    int minScorePractical = 50;
    // Write your program here
    System.out.println(theoryPrompt);
    int theoryScore = Integer.parseInt(s.nextLine());
    System.out.println(practicalPrompt);
    int practicalScore = Integer.parseInt(s.nextLine());
    boolean hasNotPassed = theoryScore < minScoreTheory || practicalScore < minScorePractical;
    if (hasNotPassed) {
      System.out.println(FAILED);
      return;
    }
    System.out.println(PASSED);
  }
}
