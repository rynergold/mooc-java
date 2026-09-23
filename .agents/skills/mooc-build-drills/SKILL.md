---
name: mooc-build-drills
description: Generates extra practice drills (<n>.5-drills-<topic>.md) and test suites to reinforce section concepts after completing standard exercises.
---

# mooc-build-drills

Generate extra practice drills to build muscle memory after completing standard MOOC exercises.

---

## 1. Directory Structure & Naming

```text
src/main/java/partXX/sYY<name>/drills/
├── <n>.5-drills-<topic>.md  <-- Drill guide
└── exercises/
    ├── <ExerciseName>.java   <-- Starter file
    └── <ExerciseName>.md     <-- Specification
src/test/java/partXX/sYY<name>/drills/exercises/
└── <ExerciseName>Test.java   <-- Baseline JUnit 5 test suite
```

- Guide: `src/main/java/partXX/sYY<name>/drills/<n>.5-drills-<topic>.md`
- Exercises: `src/main/java/partXX/sYY<name>/drills/exercises/`
- Package: `partXX.sYY<name>.drills.exercises`

---

## 2. Construction Rules

1. **Audit existing exercises first:**
   Read all files in `src/main/java/partXX/sYY<name>/exercises/`. Every drill must be a brand-new scenario with different prompts, variables, and calculations. Never duplicate upstream exercises.

2. **Provide high repetition volume:**
   Standard MOOC sections only offer 1 to 4 exercises. Generate a generous set of drills (typically 15–25 exercises across the subsection) so the learner builds automaticity.

3. **Calibrate difficulty to the topic's natural ceiling:**
   Never force higher star ratings if the concept does not support them.
   - Output and printing sections cap strictly at ✪ (1/7).
   - Single operations, type conversion, and basic branching cap at ✪✪ (2/7).
   - Compound conditions, tiered rules, and running accumulators reach ✪✪✪ (3/7).
   - Dependent state and loop invariants reach ✪✪✪✪ (4/7).
   - Never pull in syntax from future sections to manufacture difficulty (no methods before Part 2, no loops before Section 2.2, no arrays before Part 3, no objects before Part 4).

4. **Link back instead of re-teaching:**
   Do not re-explain mechanics already covered in the reading guide. Link back to the concept in `<n>-<name>.md`, identify the specific edge cases to watch, and provide the exercise reps.

---

## 3. Document Layout

```text
┌────────────────────────────────────────────────────────┐
│ FRONTMATTER & TITLE (Practice Drills: <Topic>)         │
├────────────────────────────────────────────────────────┤
│ OVERVIEW                                               │
│ └── 1-2 sentences linking to the main reading guide    │
├────────────────────────────────────────────────────────┤
│ TOPIC 1 REINFORCEMENT                                  │
│ ├── Concept Link (back to <n>-<name>.md)               │
│ ├── Edge Cases to Watch                                │
│ ├── Reps Tier 1 (e.g. ✪ Direct Translation)            │
│ └── Reps Tier 2 (e.g. ✪✪ Single Rule, if applicable)   │
├────────────────────────────────────────────────────────┤
│ TOPIC 2 REINFORCEMENT                                  │
│ ├── Concept Link (back to <n>-<name>.md)               │
│ ├── Edge Cases to Watch                                │
│ ├── Reps Tier 2 (e.g. ✪✪ Single Rule)                  │
│ └── Reps Tier 3 (e.g. ✪✪✪ Compound, if applicable)     │
└────────────────────────────────────────────────────────┘
```

---

## 4. Document Template

````markdown
---
path: '/part-X/Y.5-drills-<topic>'
title: 'Practice Drills: <Topic>'
hidden: false
---

# Practice Drills: <Topic>

Extra practice problems reinforcing the concepts from [<Section Title>](../<n>-<name>.md).

---

## 1. <Topic 1 Name>

Reinforces concepts from [<Concept Title>](../<n>-<name>.md#<anchor>).

### Edge Cases to Watch

- <Specific boundary, sign issue, or truncation risk>

### Practice Exercises

| Difficulty | Exercise | Test Command |
| :--- | :--- | :--- |
| ✪ | [<Ex1>.md](./exercises/<Ex1>.md) / [<Ex1>.java](./exercises/<Ex1>.java) | `./gradlew test --tests "partXX.sYY<name>.drills.exercises.<Ex1>Test"` |
| ✪ | [<Ex2>.md](./exercises/<Ex2>.md) / [<Ex2>.java](./exercises/<Ex2>.java) | `./gradlew test --tests "partXX.sYY<name>.drills.exercises.<Ex2>Test"` |
| ✪✪ | [<Ex3>.md](./exercises/<Ex3>.md) / [<Ex3>.java](./exercises/<Ex3>.java) | `./gradlew test --tests "partXX.sYY<name>.drills.exercises.<Ex3>Test"` |

---

## 2. <Topic 2 Name>

Reinforces concepts from [<Concept Title>](../<n>-<name>.md#<anchor>).

### Edge Cases to Watch

- <Specific edge case>

### Practice Exercises

| Difficulty | Exercise | Test Command |
| :--- | :--- | :--- |
| ✪✪ | [<Ex4>.md](./exercises/<Ex4>.md) / [<Ex4>.java](./exercises/<Ex4>.java) | `./gradlew test --tests "partXX.sYY<name>.drills.exercises.<Ex4>Test"` |
| ✪✪✪ | [<Ex5>.md](./exercises/<Ex5>.md) / [<Ex5>.java](./exercises/<Ex5>.java) | `./gradlew test --tests "partXX.sYY<name>.drills.exercises.<Ex5>Test"` |
````

---

## 5. Exercise & Test Scaffolding

1. **Specifications (`<ExerciseName>.md`):**
   - State difficulty rating and package declaration (`partXX.sYY<name>.drills.exercises`).
   - Give clear requirements, exact console prompts, and a concrete test table.
   - Include the `./gradlew test --tests "..."` command.

2. **Starter files (`<ExerciseName>.java`):**
   - Provide minimal starter stubs (empty `main` method or empty method signatures returning default values).
   - Never include solution logic.

3. **JUnit 5 tests (`<ExerciseName>Test.java`):**
   - Use `assertEquals` with clear failure messages:
     ```java
     assertEquals(expected, actual, "Input: " + input + "\nExpected: " + expected + "\nReceived: " + actual);
     ```
   - Trim trailing whitespace and normalize newlines before asserting console output.
   - Cover zero, negative numbers, boundaries, and distinct cases to prevent hardcoded answers.

4. **Verify compilation:**
   ```bash
   ./gradlew compileJava compileTestJava
   ```

---

## 6. Standard Difficulty Scale (1–7 Stars)

- **✪ (1/7) — Direct Translation:** Sequential execution, single print or read operations, or basic arithmetic without transforming the problem. For example, reading an integer and printing its square.
- **✪✪ (2/7) — Single Rule Evaluation:** Evaluating a single condition or mapping an input to a binary outcome using basic comparisons, type conversion, or modulo checks. For example, calculating an absolute value or checking whether a number is even or odd.
- **✪✪✪ (3/7) — Interacting Conditions & Running Totals:** Coordinating multiple conditions simultaneously or tracking a changing value across iterations. Uses compound boolean logic (`&&`, `||`), tiered rate calculations, or running accumulators inside a loop. For example, calculating leap year rules or computing tiered tax rates.
- **✪✪✪✪ (4/7) — Dependent State & Loop Invariants:** Managing multiple moving variables where decisions depend on prior state. Uses nested loops, multi-step validation loops, or min/max tracking. Standard MOOC exercises cap at this level. For example, prime number verification or finding greatest common divisor.
- **✪✪✪✪✪ (5/7) — Non-Obvious Strategy (LeetCode Medium):** Deducing an algorithmic pattern rather than following instructions verbatim. Solutions rely on two-pointer coordination, frequency counting, or sliding windows.
- **✪✪✪✪✪✪ (6/7) — Multi-Constraint Optimization:** Balancing conflicting rules or pruning search spaces to prevent brute-force execution. Solutions use binary search over ranges, recursion with backtracking, or cycle detection.
- **✪✪✪✪✪✪✪ (7/7) — Multi-Layered Deduction (LeetCode Hard):** Coordinating multiple algorithmic insights and tracking interdependent state transitions.
