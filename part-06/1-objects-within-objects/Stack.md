# Stack (2 parts)

**Exercise:** `part06-Part06_02.Stack`
**Section:** Part 06 / 1-objects-within-objects
**Course:** https://java-programming.mooc.fi/part-6/1-objects-within-objects

## Spec

A stack is a data structure that you can add to and take from. Always to the top of it or from the top.

 Adding to the Stack and Checking Emptiness 

Create a `Stack` class that has a list of strings as an instance variable. Add the following methods to the class:

- `public boolean isEmpty()` - returns a `boolean`-type value (true or false) that tells whether or not the stack is empty.

- `public void add(String value)` - Adds the value given as a parameter to the top of the stack.

- `public ArrayList values()` - returns the values ​​contained in the stack as a list.

You can test your class with the following code:

```java
Stack s = new Stack();
System.out.println(s.isEmpty());
System.out.println(s.values());
s.add("Value");
System.out.println(s.isEmpty());
System.out.println(s.values());
```

true
[]
false
[Value]

Taking from the Stack

Add to the `Stack` class a `public String take()` method, which returns the topmost value (i.e., the last value added to the deque) and removes it from the stack.

```java
Stack s = new Stack();
System.out.println(s.isEmpty());
System.out.println(s.values());
s.add("Value");
System.out.println(s.isEmpty());
System.out.println(s.values());
String taken = s.take();
System.out.println(s.isEmpty());
System.out.println(s.values());
System.out.println(taken);
```

true
[]
false
[Value]
true
[]
Value

```java
Stack s = new Stack();
s.add("1");
s.add("2");
s.add("3");
s.add("4");
s.add("5");

while (!s.isEmpty()) {
    System.out.println(s.take());
}
```

5
4
3
2
1

Tip! When a value is added to an ArrayList, it goes to the end of the list. As such, the most recently added value is in the last index of the list - the `size()` method provided by the list is useful for finding the last index. You can remove an element from a particular index using the `remove` method provided by the list.

## Expected Output

```
true
[]
false
[Value]
true
[]
false
[Value]
true
[]
Value
5
4
3
2
1
```
