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

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| <pre>1. Good thank you!<br>2. Well, there's really nothing to tell.</pre> | <pre>Greetings! How are you doing?<br>Oh, how interesting. Tell me more!<br>Thanks for sharing!</pre> |
| <pre>1. Nice and dandy like cotton candy!<br>2. Just went shopping.</pre> | <pre>Greetings! How are you doing?<br>Oh, how interesting. Tell me more!<br>Thanks for sharing!</pre> |

## Terminal Practice

Run the test suite from your command line:
```bash
./gradlew test --tests "part01.s03readinginput.ConversationTest"
```
