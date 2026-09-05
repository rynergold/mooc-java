# Rock Paper Scissors

**Category:** Logic Drill (Tier 4)  
**Package:** `part01.s06conditionalstatements`

## Spec

Write a program that evaluates a two-player game of Rock, Paper, Scissors.

- Prompts:
  - `"Player 1 move:"`
  - `"Player 2 move:"`
- Game Rules:
  - Valid moves are strictly: `"rock"`, `"paper"`, and `"scissors"`.
  - Rock beats scissors.
  - Scissors beats paper.
  - Paper beats rock.
  - If both players choose the same valid move: print `"Tie!"`
  - If either player provides an unrecognized move: print `"Invalid move!"`
- Output:
  - `"Player 1 wins!"`
  - `"Player 2 wins!"`
  - `"Tie!"`
  - `"Invalid move!"`

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| <pre>rock<br>scissors</pre> | <pre>Player 1 move:<br>Player 2 move:<br>Player 1 wins!</pre> |
| <pre>paper<br>scissors</pre> | <pre>Player 1 move:<br>Player 2 move:<br>Player 2 wins!</pre> |
| <pre>rock<br>rock</pre> | <pre>Player 1 move:<br>Player 2 move:<br>Tie!</pre> |
| <pre>lizard<br>paper</pre> | <pre>Player 1 move:<br>Player 2 move:<br>Invalid move!</pre> |

## Terminal Practice

Run the test suite from your command line:
```bash
./gradlew test --tests "part01.s06conditionalstatements.RockPaperScissorsTest"
```
