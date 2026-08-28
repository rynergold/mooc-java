# Gift tax

**Exercise:** `part01-Part01_37.GiftTax`
**Package:** `part01.s06conditionalstatements`

## Spec

[https://www.vero.fi/en/individuals/property/gifts/](https://www.vero.fi/en/individuals/property/gifts/): _A gift is a transfer of property to another person against no compensation or payment. If the total value of the gifts you receive from the same donor in the course of 3 years is €5,000 or more, you must pay gift tax._

When a gift is given by a close relative or a family member, the amount of gift tax is determined by the following table (source [vero.fi](https://www.vero.fi/en/individuals/property/gifts/gift-tax-calculator/#gifttaxtables)):

| Value of gift        | Tax at the lower limit    | Tax rate(%) for exceeding part  |
| -------------------- | ----------------------    | ------------------------------  |
| 5 000 -- 25 000      | 100                       | 8                               |
| 25 000 -- 55 000     | 1 700                     | 10                              |
| 55 000 -- 200 000    | 4 700                     | 12                              |
| 200 000 -- 1 000 000 | 22 100                    | 15                              |
| 1 000 000 --         | 142 100                   | 17                              |

For example 6000€ gift implies 180€ of gift tax (100 + (6000-5000) * 0.08), and 75000€ gift implies 7100€ of gift tax (4700 + (75000-55000) * 0.12).

Write a program that calculates the gift tax for a gift from a close relative or a family member.

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| <pre>3500</pre> | <pre>Value of the gift?<br>No tax!</pre> |
| <pre>5000</pre> | <pre>Value of the gift?<br>Tax: 100.0</pre> |
| <pre>27500</pre> | <pre>Value of the gift?<br>Tax: 1950.0</pre> |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part01.s06conditionalstatements.GiftTaxTest"
```
