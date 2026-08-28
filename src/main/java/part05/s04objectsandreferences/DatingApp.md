# Dating app (3 parts)

**Exercise:** `part05-Part05_16.DatingApp`
**Package:** `part05.s04objectsandreferences`

## Spec

With the exercise base the class `SimpleDate` is supplied. The date is stored with the help of the object variables `year`, `month`, and `day`:

```java
public class SimpleDate {
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        // first compare years
        if (this.year Next day

Implement the method `public void advance()` that moves the date by one day. In this exercise we assume that each month has 30 day. NB! In *certain* situations you need to change the values of month and year.

Advance specific number of days

Implement the method `public void advance(int howManyDays)` that moves the date by the number of days that is given. Use the method `advance()` that you implemented in the previous section to help you in this.

Passing of time

Let's add the possibility to advance time to the `SimpleDate` class. Create the method `public SimpleDate afterNumberOfDays(int days)` for the class. It creates a **new** `SimpleDate` object whose date is the specified number of days greater than the object that the method was called on. You may still assume that each month has 30 days. Notice that the old date object must remain unchanged!

Since the method must create **a new object**, the structure of the code should be somewhat similar to this:

```java
public SimpleDate afterNumberOfDays(int days) {
    SimpleDate newDate = new SimpleDate( ... );

    // do something..

    return newDate;
}
```

Here is an example of how the method works.

```java
public static void main(String[] args) {
    SimpleDate date = new SimpleDate(13, 2, 2015);
    System.out.println("Friday of the examined week is " + pvm);

    SimpleDate newDate = date.afterNumberOfDays(7);
    int week = 1;
    while (week 

Friday of the examined week is 13.2.2015
Friday after 1 weeks is 20.2.2015
Friday after 2 weeks is 27.2.2015
Friday after 3 weeks is 4.3.2015
Friday after 4 weeks is 11.3.2015
Friday after 5 weeks is 18.3.2015
Friday after 6 weeks is 25.3.2015
Friday after 7 weeks is 2.4.2015
The date after 790 days from the examined Friday is ... try it out yourself!

**NB!** Instead of modifying the state of the old object we return a new one. Imagine that the `SimpleDate` class has a method `advance` that works similarly to the method we programmed, but it modifies the state of the old object. In that case the next block of code would cause problems.

```java
SimpleDate now = new SimpleDate(13, 2, 2015);
SimpleDate afterOneWeek = now;
afterOneWeek.advance(7);

System.out.println("Now: " + now);
System.out.println("After one week: " + afterOneWeek);
```

The output of the program should be like this:

Now: 20.2.2015
After one week: 20.2.2015

This is because a normal assignment only copies the reference to the object. So the objects `now` and `afterOneWeek` in the program now refer to the **one and same** `SimpleDate` object.

## Expected Output

```
Friday of the examined week is 13.2.2015
Friday after 1 weeks is 20.2.2015
Friday after 2 weeks is 27.2.2015
Friday after 3 weeks is 4.3.2015
Friday after 4 weeks is 11.3.2015
Friday after 5 weeks is 18.3.2015
Friday after 6 weeks is 25.3.2015
Friday after 7 weeks is 2.4.2015
The date after 790 days from the examined Friday is ... try it out yourself!
Now: 20.2.2015
After one week: 20.2.2015
```


## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part05.s04objectsandreferences.DatingAppTest"
```
