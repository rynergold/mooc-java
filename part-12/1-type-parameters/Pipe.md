# Pipe

**Exercise:** `part12-Part12_02.Pipe`
**Section:** Part 12 / 1-type-parameters
**Course:** https://java-programming.mooc.fi/part-12/1-type-parameters

## Spec

Implement a class called Pipe, which has a single generic parameter type. The pipe works, such that we can add values into it and values can be taken out. Adding to the pipe happens from one end, and taking out from the other end. In other words, we always remove the value which has been inside the pipe the longest and add to it the newest value. The class should provide a parameterless constructor as well as the following three methods:

- `public void putIntoPipe(T value)` puts an object with a type in accordance with the type parameter given to the the class into the pipe.

- `public T takeFromPipe()` takes out the value, which has been in the pipe the longest. In case there is nothing in the pipe, return `null`. Calling the method returns the value, which has been in the pipe the longest, and removes it from the pipe.

- `public boolean isInPipe()` returns the value `true` if the pipe has values. In case the pipe is empty, it returns the value `false`.

Use ArrayList to implement the internal functionality of the class.

**There are no tests for the class in the exercise template**. Submit the exercise when the following examples work as intended.

```java
Pipe pipe = new Pipe<>();
pipe.putIntoPipe("dibi");
pipe.putIntoPipe("dab");
pipe.putIntoPipe("dab");
pipe.putIntoPipe("daa");
while(pipe.isInPipe()) {
    System.out.println(pipe.takeFromPipe());
}
```

dibi
dab
dab
daa

```java
Pipe numberPipe = new Pipe<>();
numberPipe.putIntoPipe(1);
numberPipe.putIntoPipe(2);
numberPipe.putIntoPipe(3);

int sum = 0;
while(numberPipe.isInPipe()) {
    sum = sum + numberPipe.takeFromPipe();
}
System.out.println(sum);
System.out.println(numberPipe.takeFromPipe());
```

6
null

## Expected Output

```
dibi
dab
dab
daa
6
null
```
