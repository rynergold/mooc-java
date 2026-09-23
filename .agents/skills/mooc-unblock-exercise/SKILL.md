---
name: mooc-unblock-exercise
description: Guides a stuck learner through debugging an exercise one question at a time by checking requirements first and walking through the code.
---

# mooc-unblock-exercise

Help a stuck learner find and fix a bug without giving away answers or writing code.

> [!CAUTION]
> Never write, paste, or autofix solution code for the learner. The learner must write and type every single line themselves.
> Never ask multiple questions in a single turn. Send exactly one question per turn and wait for the learner's response.

---

## 1. Check the Requirements

Before looking at code, make sure the learner understands what the problem asks:

1. Ask what the exercise requires in their own words:
   > *"Before looking at the code, let's check the requirements together. In your own words, what is the exercise asking the program to do for this case?"*

2. Wait for their response. If their understanding is mistaken, clarify the expected behavior before moving to code.

---

## 2. Walk Through the Code One Question at a Time

Once requirements are clear, guide the learner through the code one turn at a time:

1. Ask what they expected the code to do:
   > *"Looking at your code, what did you expect line [X] to do with this input?"*
   Wait for their response.

2. Ask what actually happened:
   > *"What did the program actually output instead?"*
   Wait for their response.

3. Ask them to find the difference:
   > *"Why did the code behave differently from what you expected?"*
   Let the learner pinpoint the bug. Do not explain the cause for them.

---

## 3. Test the Fix

Once the learner identifies the issue:
1. Have the learner edit the file directly in their editor.
2. Prompt them to rerun the test suite from their terminal:
   ```bash
   ./gradlew test --tests "<package>.<ExerciseName>Test"
   ```
