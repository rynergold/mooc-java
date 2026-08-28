# Payment Card (6 parts)

**Exercise:** `part04-Part04_16.PaymentCard`
**Package:** `part04.s01introductiontoobjectorientedprogramming`

## Spec

At the University of Helsinki student canteen, i.e. Unicafe, students pay for their lunch using a payment card. The final PaymentCard will look like the following as a class diagram:

In this exercise series, a class called `PaymentCard` is created which aims to mimic Unicafe's payment process

The class template

The project will include two code files:

The exercise template comes with a code file called `Main`, which contains the `main` method.

Add a new class to the project called `PaymentCard`. Here's how to add a new class: On the left side of the screen is the list of projects. Right-click on the project name. Select _New_ and _Java Class_ from the drop-down menu. Name the class as "PaymentCard".

First, create the `PaymentCard` object's constructor, which is passed the opening balance of the card, and which then stores that balance in the object's internal variable. Then, write the `toString` method, which will return the card's balance in the form "The card has a balance of X euros".

The following is the template of the `PaymentCard` class:

```java
public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        // write code here
    }

    public String toString() {
        // write code here
    }
}
```

The following main program tests the class:

```java
public class MainProgram {
    public static void main(String[] args) {
        PaymentCard card = new PaymentCard(50);
        System.out.println(card);
    }
}
```

The program should print the following:

The card has a balance of 50.0 euros

Making transactions

Complement the `PaymentCard` class with the following methods:

```java
public void eatAffordably() {
    // write code here
}

public void eatHeartily() {
    // write code here
}
```

The method `eatAffordably` should reduce the card's balance by € 2.60, and the method `eatHeartily` should reduce the card's balance by € 4.60.

The following main program tests the class:

```java
public class MainProgram {
    public static void main(String[] args) {
        PaymentCard card = new PaymentCard(50);
        System.out.println(card);

        card.eatAffordably();
        System.out.println(card);

        card.eatHeartily();
        card.eatAffordably();
        System.out.println(card);
    }
}
```

The program should print approximately the following:

The card has a balance of 50.0 euros
The card has a balance of 47.4 euros
The card has a balance of 40.199999999999996 euros

Non-negative balance

What happens if the card runs out of money? It doesn't make sense in this case for the balance to turn negative. Change the methods `eatAffordably` and `eatHeartily` so that they don't reduce the balance should it turn negative.

The following main program tests the class:

```java
public class MainProgram {
    public static void main(String[] args) {
        PaymentCard card = new PaymentCard(5);
        System.out.println(card);

        card.eatHeartily();
        System.out.println(card);

        card.eatHeartily();
        System.out.println(card);
    }
}
```

The program should print the following:

The card has a balance 5.0 euros
The card has a balance 0.40000000000000036 euros
The card has a balance 0.40000000000000036 euros

The second call to the method `eatHeartily` above did not affect the balance, since the balance would have otherwise become negative.

Topping up the card

Add the following method to the `PaymentCard` class:

```java
public void addMoney(double amount) {
    // write code here
}
```

The purpose of the method is to increase the card's balance by the amount of money given as a parameter. However, the card's balance may not exceed 150 euros. As such, if the amount to be topped up exceeds this limit, the balance should, in any case, become exactly 150 euros.

The following main program tests the class:

```java
public class MainProgram {
    public static void main(String[] args) {
        PaymentCard card = new PaymentCard(10);
        System.out.println(card);

        card.addMoney(15);
        System.out.println(card);

        card.addMoney(10);
        System.out.println(card);

        card.addMoney(200);
        System.out.println(card);
    }
}
```

The program should print the following:

The card has a balance of 10.0 euros
The card has a balance of 25.0 euros
The card has a balance of 35.0 euros
The card has a balance of 150.0 euros

Topping up the card with a negative value

Change the `addMoney` method further, so that if there is an attempt to top it up with a negative amount, the value on the card will not change.

The following main program tests the class:

```java
public class MainProgram {
    public static void main(String[] args) {
        PaymentCard card = new PaymentCard(10);
        System.out.println("Paul: " + card);
        card.addMoney(-15);
        System.out.println("Paul: " + card);
    }
}
```

The program should print the following:

Paul: The card has a balance of 10.0 euros
Paul: The card has a balance of 10.0 euros

Multiple cards

Write code in the `main` method of the `MainProgram` class that contains the following sequence of events:

- Create Paul's card. The opening balance of the card is 20 euros
- Create Matt's card. The opening balance of the card is 30 euros
- Paul eats heartily
- Matt eats affordably
- The cards' values ​​are printed (each on its own line, with the cardholder name at the beginning of it)
- Paul tops up 20 euros
- Matt eats heartily
- The cards' values ​​are printed (each on its own line, with the cardholder name at the beginning of it)
- Paul eats affordably
- Paul eats affordably
- Matt tops up 50 euros
- The cards' values ​​are printed (each on its own line, with the cardholder name at the beginning of it)

The main program's template is as follows:

```java
public class Main {
    public static void main(String[] args) {
        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);

        // write code here
    }
}
```

The program should produce the following print output:

Paul: The card has a balance of 15.4 euros
Matt: The card has a balance of 27.4 euros
Paul: The card has a balance of 35.4 euros
Matt: The card has a balance of 22.799999999999997 euros
Paul: The card has a balance of 30.199999999999996 euros
Matt: The card has a balance of 72.8 euros

## Examples

| Scenario / State | Expected Program Output (stdout) |
| :--- | :--- |
| Program execution | <pre>The card has a balance of 50.0 euros<br>The card has a balance of 50.0 euros<br>The card has a balance of 47.4 euros<br>The card has a balance of 40.199999999999996 euros<br>The card has a balance 5.0 euros<br>The card has a balance 0.40000000000000036 euros<br>The card has a balance 0.40000000000000036 euros<br>The card has a balance of 10.0 euros<br>The card has a balance of 25.0 euros<br>The card has a balance of 35.0 euros<br>The card has a balance of 150.0 euros<br>Paul: The card has a balance of 10.0 euros<br>Paul: The card has a balance of 10.0 euros<br>Paul: The card has a balance of 15.4 euros<br>Matt: The card has a balance of 27.4 euros<br>Paul: The card has a balance of 35.4 euros<br>Matt: The card has a balance of 22.799999999999997 euros<br>Paul: The card has a balance of 30.199999999999996 euros<br>Matt: The card has a balance of 72.8 euros</pre> |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part04.s01introductiontoobjectorientedprogramming.PaymentCardTest"
```
