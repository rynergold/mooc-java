# Conversation

**Exercise:** `part01-Part01_09.Conversation`  
**Package:** `part01.s03readinginput`

## Spec

Write a program that conducts the following conversation with the user:
1. Prompts: `"Greetings! How are you doing?"`
2. Reads user input.
3. Prompts: `"Oh, how interesting. Tell me more!"`
4. Reads user input.
5. Prints: `"Thanks for sharing!"`

## Examples

| User Inputs (stdin) | Expected Console Output (stdout) |
| :--- | :--- |
| 1. `Good thank you!`<br>2. `Well, there's really nothing to tell.` | `Greetings! How are you doing?`<br>**`Good thank you!`**<br>`Oh, how interesting. Tell me more!`<br>**`Well, there's really nothing to tell.`**<br>`Thanks for sharing!` |
| 1. `Nice and dandy like cotton candy!`<br>2. `Just went shopping.` | `Greetings! How are you doing?`<br>**`Nice and dandy like cotton candy!`**<br>`Oh, how interesting. Tell me more!`<br>**`Just went shopping.`**<br>`Thanks for sharing!` |

## Terminal Practice

Run the test suite from your command line:
```bash
./gradlew test --tests "part01.s03readinginput.ConversationTest"
```
