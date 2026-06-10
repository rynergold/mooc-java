# Card payments (4 sections)

**Exercise:** `part05-Part05_10.CardPayments`
**Package:** `part05.04objectsandreferences`

## Spec

"Dumb" payment card

In a previous part we created a class called PaymentCard. The card had methods for eating affordably and heartily, and also for adding money to the card.

However, there was a problem with the PaymentCard class that is implemented in this fashion. The card knew the prices of the different lunches, and therefore was able to decrease the balance by the proper amount. What about if the prices are raised? Or new items are added to the list of offered products? A change in the pricing would mean that all the existing cards would have to be replaced with new cards that are aware of the new prices.

An improved solution is to make the cards "dumb"; unaware of the prices and products that are sold, and only keeping track of their balance. All the intelligence is better placed in separate objects, payment terminals.

Let's first implement the "dumb" version of the PaymentCard. The card only has methods for asking for the balance, adding money, and taking money. Complete the method `public boolean takeMoney(double amount)` in the class below (and found in the exercise template), using the following as a guide:

```java
public class PaymentCard {
    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public void addMoney(double increase) {
        this.balance = this.balance + increase;
    }

    public boolean takeMoney(double amount) {
        // implement the method so that it only takes money from the card if
        // the balance is at least the amount parameter.
        // returns true if successful and false otherwise
    }
}
```

Test main program:

```java
public class MainProgram {
    public static void main(String[] args) {
        PaymentCard petesCard = new PaymentCard(10);

        System.out.println("money " + petesCard.balance());
        boolean wasSuccessful = petesCard.takeMoney(8);
        System.out.println("successfully withdrew: " + wasSuccessful);
        System.out.println("money " + petesCard.balance());

        wasSuccessful = petesCard.takeMoney(4);
        System.out.println("successfully withdrew: " + wasSuccessful);
        System.out.println("money " + petesCard.balance());
    }
}
```

The output should be like below

money 10.0
successfully took: true
money 2.0
successfully took: false
money 2.0

Payment terminal and cash

When visiting a student cafeteria, the customer pays either with cash or with a payment card. The cashier uses a payment terminal to charge the card or to process the cash payment. First, let's create a terminal that's suitable for cash payments.

The outline of the payment terminal. The comments inside the methods tell the wanted functionality:

```java
public class PaymentTerminal {
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        // register initially has 1000 euros of money
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable meal and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty meal and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
    }

    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
```

The terminal starts with 1000 euros in it. Implement the methods so they work correctly, using the basis above and the example prints of the main program below.

```java
public class MainProgram {
    public static void main(String[] args) {
        PaymentTerminal unicafeExactum = new PaymentTerminal();

        double change = unicafeExactum.eatAffordably(10);
        System.out.println("remaining change " + change);

        change = unicafeExactum.eatAffordably(5);
        System.out.println("remaining change " + change);

        change = unicafeExactum.eatHeartily(4.3);
        System.out.println("remaining change " + change);

        System.out.println(unicafeExactum);
    }
}
```

remaining change: 7.5
remaining change: 2.5
remaining change: 0.0
money: 1009.3, number of sold afforable meals: 2, number of sold hearty meals: 1

Card payments

Let's extend our payment terminal to also support card payments. We are going to create new methods for the terminal. It receives a payment card as a parameter, and decreases its balance by the price of the meal that was purchased. Here are the outlines for the methods, and instructions for completing them.

```java
public class PaymentTerminal {
    // ...

    public boolean eatAffordably(PaymentCard card) {
        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
    }

    public boolean eatHeartily(PaymentCard card) {
        // a hearty meal costs 4.30 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
    }

    // ...
}
```

**NB:** card payments don't increase the amount of cash in the register

Below is a main program to test the classes, and the output that is desired:

```java
public class MainProgram {
    public static void main(String[] args) {
        PaymentTerminal unicafeExactum = new PaymentTerminal();

        double change = unicafeExactum.eatAffordably(10);
        System.out.println("remaining change: " + change);

        PaymentCard annesCard = new PaymentCard(7);

        boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);
        wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);
        wasSuccessful = unicafeExactum.eatAffordably(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);

        System.out.println(unicafeExactum);
    }
}
```

remaining change: 7.5
there was enough money: true
there was enough money: false
there was enough money: true
money: 1002.5, number of sold afforable meals: 2, number of sold hearty meals: 1

Adding money

Let's create a method for the terminal that can be used to add money to a payment card. Recall that the payment that is received when adding money to the card is stored in the register. The basis for the method:

```java
public void addMoneyToCard(PaymentCard card, double sum) {
    // ...
}
```

A main program to illustrate:

```java
public class MainProgram {
    public static void main(String[] args) {
        PaymentTerminal unicafeExactum = new PaymentTerminal();
        System.out.println(unicafeExactum);

        PaymentCard annesCard = new PaymentCard(2);

        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

        boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);

        unicafeExactum.addMoneyToCard(annesCard, 100);

        wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);

        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

        System.out.println(unicafeExactum);
    }
}
```

money: 1000.0, number of sold afforable meals: 0, number of sold hearty meals: 0
amount of money on the card is 2.0 euros
there was enough money: false
there was enough money: true
amount of money on the card is 97.7 euros
money: 1100.0, number of sold afforable meals: 0, number of sold hearty meals: 1

## Expected Output

```
money 10.0
successfully took: true
money 2.0
successfully took: false
money 2.0
remaining change: 7.5
remaining change: 2.5
remaining change: 0.0
money: 1009.3, number of sold afforable meals: 2, number of sold hearty meals: 1
remaining change: 7.5
there was enough money: true
there was enough money: false
there was enough money: true
money: 1002.5, number of sold afforable meals: 2, number of sold hearty meals: 1
money: 1000.0, number of sold afforable meals: 0, number of sold hearty meals: 0
amount of money on the card is 2.0 euros
there was enough money: false
there was enough money: true
amount of money on the card is 97.7 euros
money: 1100.0, number of sold afforable meals: 0, number of sold hearty meals: 1
```
