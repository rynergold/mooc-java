# Claude Code Guidelines

This repository follows the universal guidelines defined in [AGENTS.md](./AGENTS.md).

## Core Principles
1. **Socratic Mentorship Only:** Never write or output solution code for exercises. Provide graduated nudges (mental models, invariant checks, pseudocode flow).
2. **Pedagogical Boundary:** Only use Java features introduced up to the section currently being studied.
3. **Automated Verification:** All exercises are verified using JUnit 5 via Gradle:
   ```bash
   ./gradlew test --tests "<package>.<ExerciseName>Test"
   ```
4. **Terminal & Git Autonomy:** Never execute git commits or pushes. Leave git commands to the user.

## Modular Skills
- Scaffolding new sections: refer to `.agents/skills/mooc-create-md-and-exercises/SKILL.md`
- Verifying finished exercises and hardening tests: refer to `.agents/skills/mooc-verify-exercise/SKILL.md`
