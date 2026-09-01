---
name: mooc-create-md-and-exercises
description: Scaffolds Java exercises, JUnit 5 test suites, and refactors MOOC conceptual markdown files into clean, no-ai-slop guides with modular exercise links. Use when starting a new section or preparing section exercises and notes.
---

# MOOC Section Scaffolding & Conceptual Markdown Refactor

This skill defines the end-to-end workflow for preparing a new Helsinki MOOC Java course section: extracting exercises into dedicated files, generating JUnit 5 test suites, and modernizing the conceptual guide.

---

## Workflow Steps

### 1. Analyze the Raw Section Material
- Read the section's raw overview file (e.g., `src/main/java/partXX/sYY<name>/<n>-<name>.md`).
- Catalog every exercise in the section:
  - Class name (PascalCase)
  - Exercise identifier (`partXX-PartXX_YY.Name`)
  - Prompts, input data types, logic requirements
  - Expected terminal input/output examples

---

### 2. Scaffold Individual Exercises

For each exercise in the section:

#### A. Create the Exercise Specification (`<ExerciseName>.md`)
Location: `src/main/java/partXX/sYY<name>/<ExerciseName>.md`
Include:
- Title & Exercise metadata (`Exercise:` and `Package:`)
- **Spec:** Bullet points with exact prompts and calculation requirements
- **Examples:** Markdown table with stdin vs expected stdout
- **Terminal Practice:** Exact Gradle test command:
  ```bash
  ./gradlew test --tests "partXX.sYY<name>.<ExerciseName>Test"
  ```

#### B. Create the Java Starter File (`<ExerciseName>.java`)
Location: `src/main/java/partXX/sYY<name>/<ExerciseName>.java`
```java
package partXX.sYY<name>;

import java.util.Scanner;

public class ExerciseName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here

    }
}
```

#### C. Create the JUnit 5 Test Class (`<ExerciseName>Test.java`)
Location: `src/test/java/partXX/sYY<name>/<ExerciseName>Test.java`
- Redirect `System.in` and `System.out` via `@BeforeEach` and restore them in `@AfterEach`.
- Include at least 2 test cases covering standard inputs and edge cases (e.g., zero, negative numbers, decimals).
- Assert against prompts and computed outputs with helpful failure messages.

---

### 3. Refactor the Conceptual Markdown (`<n>-<name>.md`)

Refactor the section overview file applying these rules:

#### A. Clean Exercise Links (No Duplication)
- Remove all inline exercise problem text, sample inputs/outputs, and boilerplate.
- Insert clean progress links immediately following the relevant concept:
  ```markdown
  👉 **Ready?** Open [ExerciseName.md](./ExerciseName.md) / [ExerciseName.java](./ExerciseName.java)
  ```

#### B. Apply `/no-ai-slop` Principles
- Cut banned words (`delve`, `foster`, `leverage`, `utilize`, `streamline`, `robust`, `crucial`, `paramount`, `dive in`).
- Cut binary contrasts ("This is not X. It's Y."), throat-clearing openers, and rhetorical setups.
- Use active voice, direct verbs, and concrete code examples.
- Format follows content—no emoji in headers, no gratuitous bolding.

#### C. Educational & Technical Enhancements
- Explain memory layout, bit representation, overflow/underflow, and type-casting nuances.
- Include structured trace tables for step-by-step state changes.
- Add an **Official Documentation** section at the bottom linking to relevant Oracle Java Tutorials and Javadocs.

---

### 4. Verification & Build Check
- Run `./gradlew compileJava compileTestJava` to verify all Java starter files and test suites compile cleanly.
- Do not modify git state on behalf of the user—prompt them with the summary of prepared exercises so they can proceed solo.
