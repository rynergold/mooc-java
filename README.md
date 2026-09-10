# Helsinki Java MOOC: Socratic Mastery Lab

A structured, test-driven companion for mastering Java from first principles through the [University of Helsinki Java MOOC](https://java-programming.mooc.fi/). Built for deliberate practice, spoiler-free conceptual understanding, and automated verification using JUnit 5.

---

## 🚀 Quickstart (Getting Started for Anyone)

If you have just cloned or forked this repository, follow these steps to get started immediately:

### 1. Prerequisites
- **JDK 17 or 21 (LTS):** Verify your installed Java version:
  ```bash
  java -version
  ```
- **Git:** For local version control and terminal practice.

### 2. Verify Your Environment
Test that Gradle compiles and all existing tests pass:
```bash
./gradlew test
```
*(On Windows, use `gradlew.bat test`)*

### 3. Repository Architecture
The repository separates conceptual guides, exercise starter code, and test suites:

```text
src/
├── main/java/partXX/sYY<name>/
│   ├── <n>-<name>.md               <-- Spoiler-free conceptual guide
│   └── exercises/                  <-- Package: partXX.sYY<name>.exercises
│       ├── <ExerciseName>.md       <-- Detailed specification & stdin/stdout table
│       └── <ExerciseName>.java     <-- Clean starter template
└── test/java/partXX/sYY<name>/
    └── exercises/
        └── <ExerciseName>Test.java <-- Independent JUnit 5 test suite
```

### 4. How to Practice
1. **Read the Conceptual Guide:** Open `src/main/java/partXX/sYY<name>/<n>-<name>.md`. Guides are deliberately crafted with alternative examples so they never spoil the exercises.
2. **Open the Exercise Spec:** Read `exercises/<ExerciseName>.md` for requirements and sample outputs.
3. **Implement Solo:** Write your solution in `exercises/<ExerciseName>.java`.
4. **Run Terminal Verification:** Run the exercise's specific test suite:
   ```bash
   ./gradlew test --tests "partXX.sYY<name>.exercises.<ExerciseName>Test"
   ```
5. **Commit Your Work:** Stage and commit your code via the terminal to build git fluency.

---

## 🤖 AI Mentorship & Modular Skills (Tool-Agnostic)

This repository is designed to be paired with an AI coding assistant (Antigravity, Claude Code, Cursor, Windsurf, Copilot, or local LLMs) acting as a **Socratic Mentor**.

All agent behaviors and core rules are specified in **[AGENTS.md](./AGENTS.md)** (with synchronized shims in `CLAUDE.md` and `GEMINI.md`).

### Modular Skills

Specialized workflows live in `.agents/skills/`:

| Skill | Trigger / Command | Purpose |
| :--- | :--- | :--- |
| **`mooc-create-md-and-exercises`** | Scaffolding a new section | Scrapes Helsinki MOOC, modernizes Java advice (LTS standards), **redacts spoilers from conceptual examples**, generates exercise specs/starters, builds JUnit 5 tests, and calibrates 1–7 star difficulty ratings. |
| **`mooc-verify-exercise`** | *"Look, I finished this"* or `/mooc-verify` | Audits test suites for cheat loopholes (hardcoded outputs, missing boundaries), hardens JUnit 5 tests, verifies execution with Gradle, and delivers Socratic code reviews. |

> [!TIP]
> **Progress Tracking:** Tracking style is left entirely to the learner. You can use local notes (e.g. Obsidian, markdown logs, or the roadmap checklist below).

---

## ⚔️ Rules of Engagement (Methodology)

To ensure genuine mastery and eliminate copy-pasting:
1. **No Free Answers:** The AI mentor provides mental models, invariant checks, and pseudocode flow—never raw Java implementation code.
2. **Standardized Star Calibration:** Exercises follow a 1–7 difficulty scale. The standard MOOC curriculum is capped at 3–4 stars; custom progressive overload drills scale from 5 to 7 stars.
3. **Automated Verification:** Rather than relying on broken or rigid remote runners, all logic is verified locally with custom **JUnit 5** test suites.
4. **Terminal Autonomy:** All git commands and test invocations are run by the learner.

---

## 🗺️ The Roadmap (Table of Contents)

- [x] **Part 1.1–1.6:** Getting Started (Printing, Variables, Conditionals)
- [ ] **Part 1.65:** Applied Logic & Problem-Solving Drills (In Progress)
- [ ] **Part 2:** Repeating Functionality (Loops & Methods)
- [ ] **Part 3:** Lists and Arrays
- [ ] **Part 4:** Object-Oriented Programming (OOP)
- [ ] **Part 5:** Overloading and Objects in Lists
- [ ] **Part 6:** Objects within Objects (Testing)
- [ ] **Part 7:** Programming Paradigms & Algorithms
- [ ] **Part 8:** HashMaps and Data Organization
- [ ] **Part 9:** Inheritance and Interfaces
- [ ] **Part 10:** Useful Techniques (Streams & Regex)
- [ ] **Part 11:** Exceptions and File Processing
- [ ] **Part 12:** Type Parameters
- [ ] **Part 13:** Graphical User Interfaces (JavaFX)
- [ ] **Part 14:** Data Visualization

---

## 🔗 Resources

- **Official Course:** [University of Helsinki Java Programming](https://java-programming.mooc.fi/)
- **Agent Instructions:** [AGENTS.md](./AGENTS.md) | [GEMINI.md](./GEMINI.md) | [CLAUDE.md](./CLAUDE.md)

---

## 💡 The "Aha!" Log (Wall of Triumphs)

*Record notes here whenever you hit a major conceptual roadblock and break through:*

- **Part 1.1:** Realized that `System.out.println()` requires a semicolon at the end, and text must be wrapped in double-quotes to be treated as a String parameter.
- **Part 1.6:** Discovered De Morgan's Laws: inverting `a && b` becomes `!a || !b`, which makes guard clauses and early rejection checks much cleaner.
