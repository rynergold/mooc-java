---
name: mooc-refine-exercises
description: Reviews created exercises to ensure clear problem descriptions, rigorous test cases, and accurate difficulty ratings.
---

# mooc-refine-exercises

Audit created exercises using these checks:

---

## 1. Make test assertions show expected versus received values

- **Violation:** Boolean assertions hide actual output when a test fails:
  ```java
  assertTrue(output.contains("16"), "Expected 16");
  // Fails with: expected: <true> but was: <false>
  ```
- **Fix:** Use `assertEquals` with input, expected, and received values:
  ```java
  assertEquals(expected, actual, "Input: " + input + "\nExpected: " + expected + "\nReceived: " + actual);
  ```

---

## 2. Strip trailing whitespace and normalize newlines in assertions

- **Violation:** Assertions fail on invisible trailing spaces or operating system line endings:
  ```java
  assertEquals("16\n", output); // Fails if student printed "16 \n" or uses Windows \r\n
  ```
- **Fix:** Trim output and normalize newlines before asserting (`output.trim()` or `.replaceAll("\\r\\n", "\n")`).

---

## 3. Prevent hardcoded outputs from passing

- **Violation:** A test only supplies one input, allowing a single hardcoded print statement to pass:
  ```java
  // Test only checks input 4 -> 16. Student writes: System.out.println(16);
  ```
- **Fix:** Add multiple test cases with distinct positive, negative, and zero inputs so hardcoded answers fail.

---

## 4. Test boundary and edge cases

- **Violation:** Tests only check interior values (such as testing `age = 20` and `age = 15` for `age >= 18`, skipping boundary `18`).
- **Fix:** Add tests targeting exact boundaries (`min`, `max`, threshold), zero, negative numbers, and empty inputs. Use `@ParameterizedTest` (with `@ValueSource` or `@CsvSource`) or standard `@Test` methods based on the problem structure.

---

## 5. Verify problem description and test command

- **Violation:** The markdown specification (`<ExerciseName>.md`) omits sample tables, leaves prompts ambiguous, or provides an incorrect `./gradlew` test path.
- **Fix:** Ensure the spec includes exact console prompts, a clean input/output table, and a working `./gradlew test --tests "..."` command matching the package path.

---

## 6. Verify test compilation

Run Gradle to confirm all test files compile cleanly:
```bash
./gradlew compileTestJava
```

