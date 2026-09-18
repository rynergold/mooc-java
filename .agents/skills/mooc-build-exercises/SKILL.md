---
name: mooc-create-exercises
description: Scaffolds the complete batch of exercises for a MOOC section, generating readable markdown specifications, clean starter files, baseline JUnit 5 tests, and 1-7 star difficulty ratings.
---

# MOOC Exercise Batch Scaffolding

A workflow to scaffold isolated exercises for a Helsinki MOOC section. This skill focuses purely on exercise creation, readable problem specifications, starter templates, and baseline test suites.

---

## Directory Structure

```text
partXX/sYY<name>/exercises/
├── <ExerciseName>.java     <-- Clean starter file
└── <ExerciseName>.md       <-- Detailed specification
src/test/java/partXX/sYY<name>/exercises/
└── <ExerciseName>Test.java <-- Baseline JUnit 5 test suite
```

---

## Step-by-Step Execution

### Step 1: Exercise Extraction
1. Extract the complete list of programming exercises from the Helsinki section.
2. For each exercise, identify required console prompts, expected inputs, calculation rules, and output formatting.

### Step 2: Specification Generation (`<ExerciseName>.md`)
Create `src/main/java/partXX/sYY<name>/exercises/<ExerciseName>.md` with:
- Metadata headers: `**Exercise:**`, `**Category:**`, `**Difficulty:**`, `**Package:**`.
- Clear, bulleted requirements and prompt sequences.
- An input/output markdown table showing stdin vs. expected stdout.
- The exact Gradle test command:
  ```bash
  ./gradlew test --tests "partXX.sYY<name>.exercises.<ExerciseName>Test"
  ```

### Step 3: Starter File Generation (`<ExerciseName>.java`)
Create `src/main/java/partXX/sYY<name>/exercises/<ExerciseName>.java`:
```java
package partXX.sYY<name>.exercises;

import java.util.Scanner;

public class ExerciseName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here

    }
}
```

### Step 4: Baseline JUnit 5 Test Suite (`<ExerciseName>Test.java`)
Create `src/test/java/partXX/sYY<name>/exercises/<ExerciseName>Test.java`:
- Package matches: `package partXX.sYY<name>.exercises;`.
- Stream redirection via `@BeforeEach` and `@AfterEach`.
- Include initial test cases covering standard inputs and primary conditions.

### Step 5: Calibrate Difficulty Ratings (Universal 1–7 Stars)
Calibrate every exercise against the universal 7-star difficulty rubric:
- **✪ (1/7):** Sequential execution, single print/read, trivial condition.
- **✪✪ (2/7):** Two-boundary range, `if-else if-else`, type conversion, modulo parity.
- **✪✪✪ (3/7):** Multi-variable compound logic, interval overlap, tiered rates.
- **✪✪✪✪ (4/7):** Nested loops, state tracking, multi-step validation (standard course cap).
- **✪✪✪✪✪ to ✪✪✪✪✪✪✪ (5–7/7):** Advanced algorithmic drills only.

### Step 6: Verify Compilation
Run Gradle compilation to verify all newly generated starters and test classes compile cleanly:
```bash
./gradlew compileJava compileTestJava
```
