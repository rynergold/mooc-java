package part01.s06conditionalstatements.logic.exercises;

import java.util.Scanner;

public class RockPaperScissors {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Write your program here
    
    // valid moves
    String rock = "rock";
    String paper = "paper";
    String scissors = "scissors";
    
    // outcomes
    String p1Wins = "Player 1 wins!";
    String p2Wins = "Player 2 wins!";
    String tie = "Tie!";
    String invalidMove = "Invalid move!";
    
    String prompt1 = "Player 1 move:";
    String prompt2 = "Player 2 move:";
    System.out.println(prompt1);
    String p1Input = sc.nextLine();
    System.out.println(prompt2);
    String p2Input = sc.nextLine();
    // refer to strings as numbers
    int p1choice = 0;
    int p2choice = 0;
    int one = 1; // rock
    int two = 2; // paper
    int three = 3; // scissors
    // could use switch here
    if (p1Input.equals(rock)) p1choice = one;
    if (p1Input.equals(paper)) p1choice = two;
    if (p1Input.equals(scissors)) p1choice = three;
    
    if (p2Input.equals(rock)) p2choice = one;
    if (p2Input.equals(paper)) p2choice = two;
    if (p2Input.equals(scissors)) p2choice = three;
    
    
    // outcome calculation
    boolean invalidInput = p1choice < 1 || p2choice < 1 || p1choice > 3 || p2choice > 3;
    if (invalidInput) {
      System.out.println(invalidMove);
      return;
    }
    boolean isTie = p1Input.equals(p2Input);
    if (isTie) {
      System.out.println(tie);
      return;
    }
    
    boolean isP1Win =
      p1Input.equals(rock) && p2Input.equals(scissors) || p1Input.equals(paper) && p2Input.equals(rock) || p1Input.equals(scissors) && p2Input.equals(paper);
    
    if (isP1Win) {
      System.out.println(p1Wins);
      return;
    }
    System.out.println(p2Wins);
    
    
  }
}
