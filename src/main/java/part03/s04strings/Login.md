# Login

**Exercise:** `part03-Part03_25.Login`
**Package:** `part03.04strings`

## Spec

Write a program that recognizes the following users:

| username | password |
| -------- | -------- |
| alex     | sunshine |
| emma     | haskell  |

The program either shows a personal message or informs of an incorrect username or password.

Enter username: **alex**
Enter password: **sunshine**
You have successfully logged in!

Enter username: **emma**
Enter password: **haskell**
You have successfully logged in!

Enter username: **alex**
Enter password: **thunderstorm**
Incorrect username or password!

**NB!** You can't compare strings with `==`!

**NB!** Logins should not be implemented like this in real life! You can become familiar with safer ways to implement logins on courses focusing on web programming.

## Expected Output

```
Enter username: **alex**
Enter password: **sunshine**
You have successfully logged in!
Enter username: **emma**
Enter password: **haskell**
You have successfully logged in!
Enter username: **alex**
Enter password: **thunderstorm**
Incorrect username or password!
```
