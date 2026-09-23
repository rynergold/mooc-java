---
name: mooc-build-guide
description: Generates section reading guides (<n>-<name>.md) paired directly with exercises using a structured layout and template.
---

# mooc-build-guide

Instructions for generating or updating a section reading guide (`<n>-<name>.md`).

---

## 1. Sources & References

1. **Source material:** Read the upstream Helsinki MOOC markdown (`https://raw.githubusercontent.com/rage/java-programming/master/data/part-X/Y-name.md`) or the local section file.
2. **Reference guides:** Check these standard section guides in the repository for style and depth:
   - `src/main/java/part01/s06conditionalstatements/6-conditional-statements.md`
   - `src/main/java/part01/s05calculating/5-calculating.md`
3. **Exercise mapping:** List all exercises in the section and map each to a concept section.

---

## 2. Modern Java Standards

The Helsinki MOOC uses Java 8/11. When drafting guides:
- Teach the base construct required to solve the section exercises.
- Add a `> [!TIP]` **Modern Java Note** when Java 17/21 introduces a clearer syntax or standard library method (such as `switch` arrow expressions, `Math.clamp()`, or pattern matching).
- Keep examples within the learner's current scope (no methods before Part 2, no objects before Part 4).

---

## 3. Document Layout

Every guide follows this visual structure:

```text
┌────────────────────────────────────────────────────────┐
│ FRONTMATTER & TITLE                                    │
├────────────────────────────────────────────────────────┤
│ LEARNING OBJECTIVES ([!NOTE])                          │
├────────────────────────────────────────────────────────┤
│ CONCEPT SECTION 1                                      │
│ ├── Technical Explanation                              │
│ ├── Optional Modern Java Note ([!TIP])                 │
│ ├── Code Example                                       │
│ ├── Common Mistakes for This Concept                   │
│ └── Practice Exercises (✪ links)                       │
├────────────────────────────────────────────────────────┤
│ CONCEPT SECTION 2                                      │
│ ├── Technical Explanation                              │
│ ├── Optional Modern Java Note ([!TIP])                 │
│ ├── Code Example                                       │
│ ├── Common Mistakes for This Concept                   │
│ └── Practice Exercises (✪ links)                       │
├────────────────────────────────────────────────────────┤
│ ... (repeat for each concept)                          │
├────────────────────────────────────────────────────────┤
│ NEXT STEPS                                             │
│ └── 1 to 2 sentences connecting to next section        │
└────────────────────────────────────────────────────────┘
```

---

## 4. Document Template

````markdown
---
path: '/part-X/Y-<name>'
title: '<Section Title>'
hidden: false
---

> [!NOTE]
> **Learning Objectives**
>
> - <Objective 1>
> - <Objective 2>
> - <Objective 3>

---

## 1. <Concept Name>

<Technical explanation of syntax and mechanics>

> [!TIP]
> **Modern Java Note: <Feature Name>**
> <Modern Java 17/21 equivalent or best practice>

```java
// Code example illustrating the syntax
<code snippet>
```

### Common Mistakes

- **<Mistake Name>:** <Explanation of syntax error, runtime bug, or misconception specific to this concept with code snippet>

#### Practice (<Difficulty Rating>)

- **<Stars>** [<Exercise1>.md](./<Exercise1>.md) / [<Exercise1>.java](./<Exercise1>.java) — <One-sentence summary>
- **<Stars>** [<Exercise2>.md](./<Exercise2>.md) / [<Exercise2>.java](./<Exercise2>.java) — <One-sentence summary>

---

## 2. <Next Concept Name>

<Technical explanation of syntax and mechanics>

```java
<code snippet>
```

### Common Mistakes

- **<Mistake Name>:** <Concept-specific trap with code snippet>

#### Practice (<Difficulty Rating>)

- **<Stars>** [<Exercise3>.md](./<Exercise3>.md) / [<Exercise3>.java](./<Exercise3>.java) — <One-sentence summary>

---

## 3. Next Steps

<1 to 2 sentences explaining how this connects to the next topic>
````

---

## 5. Difficulty Scale for Practice Links

- **✪ (1/7) — Direct Translation:** The learner translates the problem description directly into code without transforming the problem. Code runs sequentially, handles single print or read operations, or computes basic arithmetic. For example, reading an integer and printing its square.
- **✪✪ (2/7) — Single Rule Evaluation:** The learner evaluates a single condition or maps an input to a binary outcome. Code uses `if-else` branching, basic comparisons, type conversion, or modulo checks like `% 2 == 0`. For example, calculating an absolute value or checking whether a number is even or odd.
- **✪✪✪ (3/7) — Interacting Conditions & Running Totals:** The learner coordinates multiple conditions simultaneously or tracks a changing value across iterations. Code uses compound boolean logic (`&&`, `||`), tiered rate calculations, or running accumulators inside a loop. For example, calculating leap year rules, computing tiered tax rates, or finding the average of positive numbers.
- **✪✪✪✪ (4/7) — Dependent State & Loop Invariants:** The learner manages multiple moving variables where decisions in one step depend on prior state. Code uses nested loops, multi-step validation loops, or min/max tracking. Standard MOOC exercises cap at this level. For example, prime number verification, the Euclidean algorithm for greatest common divisor, or printing asterisks patterns.
