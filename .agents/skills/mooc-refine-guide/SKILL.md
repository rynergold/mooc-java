---
name: mooc-refine-guide
description: Cleans up section guides (<n>-<name>.md) by pruning filler with /no-ai-slop, removing unnecessary diagrams, and ensuring examples don't give away exercise answers.
---

# mooc-refine-guide

Audit a section reading guide (`<n>-<name>.md`) and strip out bad patterns using these checks:

---

## 1. Ensure no example solves an upcoming exercise

- **Violation:** The guide example uses the exact logic and variables of an upcoming exercise:
  ```markdown
  ## 1. Repeating Output
  ```java
  Scanner scanner = new Scanner(System.in);
  System.out.println("Write a message:");
  String message = scanner.nextLine();

  System.out.println(message);
  System.out.println(message);
  System.out.println(message);
  ```
  #### Practice (✪ 1/7)
  - **✪** [MessageThreeTimes.md](./MessageThreeTimes.md) — Read a string and print it three times.
  ```
- **Fix:** Change the guide example to a different scenario (such as printing an airport destination across a boarding pass and luggage tag) so the student writes the exercise logic themselves.

---

## 2. Connect every code block to practice

- **Violation:** A code block sits in the guide with no practice exercises below it:
  ```markdown
  ## 2. Calculations
  ```java
  // 30 lines of code calculating telemetry readings or air freight rates...
  ```
  ---
  ## 3. Next Topic
  ```
- **Fix:** Delete the orphan example. Every code block must lead directly into a `#### Practice (✪)` block.

---

## 3. Verify practice links point to files on disk

- **Violation:** The link uses an assumed path that does not exist:
  ```markdown
  - **✪** [Squared.md](./exercises/Squared.md)
  ```
- **Fix:** Verify the path on disk and update the link to the actual file location (`[Squared.md](./Squared.md)`).

---

## 4. Nest common mistakes inside their topic

- **Violation:** Mistakes sit in an appendix at the end of the file:
  ```markdown
  ## 6. Common Mistakes
  - Type conversion errors...
  - NaN in square root...
  - Shadowed conditions...
  ```
- **Fix:** Move each mistake directly inside the concept section it belongs to, right above `#### Practice`.

---

## 5. Keep modern Java notes within the current section's scope

- **Violation:** A tip introduces language features the student has not learned yet:
  ```markdown
  > [!TIP]
  > Use `IntStream.range(0, 10).map(x -> x * x)...` to calculate squares.
  ```
- **Fix:** Cut the advanced construct. Only keep modern notes (such as `import static java.lang.Math.sqrt;` or switch expressions) that fit the current section without methods, loops, or streams before they are introduced.

---

## 6. Remove unnecessary diagrams

- **Violation:** A Mermaid diagram visualizes linear execution or simple branching:
  ```markdown
  ```mermaid
  graph LR
      A[Read input] --> B[Calculate] --> C[Print]
  ```
  ```
- **Fix:** Delete the diagram. Let the code speak for itself. Keep diagrams only for invisible memory mechanics (such as stack variables referencing heap objects).

---

## 7. Run `/no-ai-slop`

Read and execute the `/no-ai-slop` skill (`~/.gemini/config/skills/no-ai-slop/SKILL.md`) on the guide.

- **Violation:** Prose relies on essay openers, filler phrases, or decorative wording:
  > "In the vast realm of modern software engineering, mastering conditional logic is a crucial pillar that empowers programmers to navigate complex decision-making tapestries."
- **Fix:** Strip out filler and state the mechanic directly:
  > "Conditional statements route program execution using boolean expressions."
