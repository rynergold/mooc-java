# ABC (2 parts)

**Exercise:** `part09-Part09_01.ABC`
**Section:** Part 09 / 1-inheritance
**Course:** https://java-programming.mooc.fi/part-9/1-inheritance

## Spec

Let's practice creating and inheriting classes.

Creating classes

Create the following three classes:

- Class `A`. Class should have no object variables nor should you specify a constructor for it. It only has the method `public void a()`, which prints a string "A".
- Class `B`. Class should have no object variables nor should you specify a constructor for it. It only has the method `public void b()`, which prints a string "B".
- Class `C`. Class should have no object variables nor should you specify a constructor for it. It only has the method `public void c()`, which prints a string "C".

```java
A a = new A();
B b = new B();
C c = new C();

a.a();
b.b();
c.c();
```

A
B
C

Class inheritance

Modify the classes so that class B inherits class A, and class C inherits class B. In other words, class A will be a superclass for class B, and class B will be a superclass for class C.

```java
C c = new C();

c.a();
c.b();
c.c();
```

A
B
C

## Expected Output

```
A
B
C
A
B
C
```
