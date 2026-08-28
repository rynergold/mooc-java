# Product

**Exercise:** `part04-Part04_07.Product`
**Package:** `part04.s01introductiontoobjectorientedprogramming`

## Spec

Create a class `Product` that represents a store product. The product should have a price (double), a quantity (int) and a name (String).

The class should have:

- the constructor `public Product (String initialName, double initialPrice, int initialQuantity)`
- a method `public void printProduct()` that prints product information in the following format:

The output above is based on the product being assigned the name `banana`, with a price of `1.1`, and a quantity of `13` .

## Examples

| Scenario / State | Expected Console Output (stdout) |
| :--- | :--- |
| Program execution | `Banana, price 1.1, 13 pcs` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part04.s01introductiontoobjectorientedprogramming.ProductTest"
```
