---
name: mooc-verify-solution
description: Tests student solutions against JUnit 5 suites, reports test failures neutrally without unsolicited advice, and reviews passing code with scope-aligned improvements only when objectively better.
---

# mooc-verify-solution

Verify student exercise solutions using these steps:

---

## 1. Run the test suite

Run the exercise test from the project root:

```bash
./gradlew test --tests "<package>.<ExerciseName>Test"
```

Check whether the test suite covers core boundaries (such as zero, negative values, and exact thresholds). If the test suite missed an obvious boundary, test the student's code against that input as well to ensure thorough verification.

---

## 2. Handle test failures

If any test fails:

- Do not provide unsolicited hints or coaching. The learner asked to verify their solution, not for immediate help.
- Output the failure table:

```markdown
### Test Results
[X] of [N] tests passed.

| Test Case | Input | Expected Output | Received Output |
| :--- | :--- | :--- | :--- |
| `<testMethod>` | `<input>` | `<expected>` | `<actual>` |
```

Stop here so the learner can inspect the mismatch and debug independently.

If the learner asks for help or gets stuck, switch to `mooc-unblock-exercise`.

---

## 3. Handle test success

When all tests pass:

```markdown
### Test Results
All [N] tests passed.
```

### Check for objective improvements
Ask: *Is there an objectively cleaner, more readable, or more maintainable way to write this code within the section's scope?*

- If yes: Provide at most one suggestion. State the technical reason it is better (such as removing redundant nested branches or eliminating dead conditions) and show a brief code snippet. Never suggest language features from future chapters (no Streams, lambdas, or objects before they are taught).
- If no: Do not invent feedback or give forced praise. Leave it out.

### Reflection question
Ask one conversational question to get the learner talking about their experience:
- Ask what felt tricky, what took the longest to figure out, or what clicked (such as "What part of the logic took the most time to get right?").
- Do not quiz the learner on hypothetical inputs or ask broad theoretical questions.
