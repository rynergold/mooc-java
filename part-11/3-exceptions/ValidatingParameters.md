# Validating parameters (2 parts)

**Exercise:** `part11-Part11_11.ValidatingParameters`
**Section:** Part 11 / 3-exceptions
**Course:** https://java-programming.mooc.fi/part-11/3-exceptions

## Spec

Let's practise a little parameter validation with the `IllegalArgumentException` exception. There are two classes included with the exercise base: `Person` and `Calculator`. Modify the classes in the following manner:

Validating a person

The constructor of the class `Person` should ensure that the name given as the parameter is not null, empty, or over 40 characters in length. The age should between 0 and 120. If some of these conditions are not met, the constructor should throw an `IllegalArgumentException`.

Validating the calculator

The methods of the `Calculator` class should be as follows: The method `factorial` should only work if the parameter is a non-negative number (0 or greater). The method `binomialCoefficient` should only work when the parameters are non-negative and the subset size does not exceed the set size. If these methods receive invalid parameters when they are called, they should throw an `IllegalArgumentException`

## Expected Output

```
(see spec)
```
