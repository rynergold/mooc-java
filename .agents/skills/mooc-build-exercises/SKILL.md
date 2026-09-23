---
name: mooc-build-exercises
description: Scaffolds the complete batch of exercises for a MOOC section, generating markdown specifications, starter files, baseline JUnit 5 tests, and 1-4 star difficulty ratings.
---

# mooc-build-exercises

Scaffold exercises for a section using these steps:

---

## 1. Directory Structure

```text
src/main/java/partXX/sYY<name>/exercises/
├── <ExerciseName>.java     <-- Starter file
└── <ExerciseName>.md       <-- Specification
src/test/java/partXX/sYY<name>/exercises/
└── <ExerciseName>Test.java <-- Baseline JUnit 5 test suite
```

Package: `partXX.sYY<name>.exercises`

---

## 2. Construction Steps

1. **Extract and expand exercises:**
   - Check the active section folder (`partXX/sYY<name>`). Pull exercises strictly for this section from the upstream MOOC.
   - Map each exercise to its concept in the reading guide.
   - Provide enough exercises per concept: at least 5 easy exercises (✪ or ✪✪) for the core mechanic, plus at least 1 harder exercise (✪✪✪ or ✪✪✪✪) for edge cases. If upstream provides fewer, create extra exercises to hit this count.

2. **Create exercise specifications (`<ExerciseName>.md`):**
   - Add title and metadata: exercise name, difficulty rating (1–4 stars), package.
   - Write clear requirements and prompt sequences.
   - Provide a concrete test table showing inputs and expected outputs.
   - Include the exact terminal test command:
     ```bash
     ./gradlew test --tests "partXX.sYY<name>.exercises.<ExerciseName>Test"
     ```

3. **Create starter files (`<ExerciseName>.java`):**
   - Stub only what the exercise requires: a `main` method for console programs, or method/class declarations for method and object exercises.
   - Do not write implementation code.

4. **Create readable JUnit 5 tests (`<ExerciseName>Test.java`):**
   - Use `assertEquals` instead of `assertTrue` or `assertFalse` so test failures display exact values (`expected: <X> but was: <Y>`).
   - Include input, expected, and received values in failure messages (LeetCode style):
     `assertEquals(expected, actual, "Input: " + input + "\nExpected: " + expected + "\nReceived: " + actual);`
   - For console programs, redirect `System.in`/`System.out` and trim trailing whitespace before comparing. For methods and classes, test return values and object state directly.

5. **Set difficulty ratings (1–4 stars):**
   - **✪ (1/7) — Direct Translation:** The learner translates the problem description directly into code without transforming the problem. Code runs sequentially, handles single print or read operations, or computes basic arithmetic. For example, reading an integer and printing its square.
   - **✪✪ (2/7) — Single Rule Evaluation:** The learner evaluates a single condition or maps an input to a binary outcome. Code uses `if-else` branching, basic comparisons, type conversion, or modulo checks like `% 2 == 0`. For example, calculating an absolute value or checking whether a number is even or odd.
   - **✪✪✪ (3/7) — Interacting Conditions & Running Totals:** The learner coordinates multiple conditions simultaneously or tracks a changing value across iterations. Code uses compound boolean logic (`&&`, `||`), tiered rate calculations, or running accumulators inside a loop. For example, calculating leap year rules, computing tiered tax rates, or finding the average of positive numbers.
   - **✪✪✪✪ (4/7) — Dependent State & Loop Invariants:** The learner manages multiple moving variables where decisions in one step depend on prior state. Code uses nested loops, multi-step validation loops, or min/max tracking. Standard MOOC exercises cap at this level. For example, prime number verification, the Euclidean algorithm for greatest common divisor, or printing asterisks patterns.

6. **Verify compilation:**
   Run Gradle to ensure all starter files and tests compile cleanly:
   ```bash
   ./gradlew compileJava compileTestJava
   ```
