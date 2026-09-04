# Password

**Exercise:** `part01-Part01_33.Password`  
**Package:** `part01.s06conditionalstatements`

## Spec

Write a program that prompts the user for a password. If the password is `"Caput Draconis"`, the program prints `"Welcome!"`. Otherwise, it prints `"Off with you!"`.

- Prompt: `"Password?"`
- If input matches `"Caput Draconis"`: print `"Welcome!"`
- Otherwise: print `"Off with you!"`

> [!IMPORTANT]
> In Java, always compare strings using the `.equals()` method rather than the `==` operator. `==` checks reference equality (memory addresses), whereas `.equals()` compares the actual character sequences.

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| <pre>Wattlebird</pre> | <pre>Password?<br>Off with you!</pre> |
| <pre>Caput Draconis</pre> | <pre>Password?<br>Welcome!</pre> |

## Terminal Practice

Run the test suite from your command line:
```bash
./gradlew test --tests "part01.s06conditionalstatements.PasswordTest"
```
