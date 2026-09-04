# Gift Tax

**Exercise:** `part01-Part01_37.GiftTax`  
**Package:** `part01.s06conditionalstatements`

## Spec

Write a program that calculates the gift tax for a gift received from a close relative or family member according to the Finnish tax administration guidelines.

If the value of the gift is less than 5,000 euros, no tax is paid:
- Output: `"No tax!"`

If the value is 5,000 euros or more, tax is determined by the following tax brackets:

| Value of Gift (€) | Tax at Lower Limit (€) | Tax Rate (%) on Exceeding Part |
| :--- | :--- | :--- |
| 5,000 – 25,000 | 100 | 8% (`0.08`) |
| 25,000 – 55,000 | 1,700 | 10% (`0.10`) |
| 55,000 – 200,000 | 4,700 | 12% (`0.12`) |
| 200,000 – 1,000,000 | 22,100 | 15% (`0.15`) |
| 1,000,000+ | 142,100 | 17% (`0.17`) |

- Prompt: `"Value of the gift?"`
- Tax formula: `taxAtLowerLimit + (value - lowerLimit) * taxRate`
- Output: `"Tax: "` followed by the calculated tax as a floating-point number (e.g., `Tax: 100.0`, `Tax: 1950.0`).

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| <pre>3500</pre> | <pre>Value of the gift?<br>No tax!</pre> |
| <pre>5000</pre> | <pre>Value of the gift?<br>Tax: 100.0</pre> |
| <pre>6000</pre> | <pre>Value of the gift?<br>Tax: 180.0</pre> |
| <pre>27500</pre> | <pre>Value of the gift?<br>Tax: 1950.0</pre> |

## Terminal Practice

Run the test suite from your command line:
```bash
./gradlew test --tests "part01.s06conditionalstatements.GiftTaxTest"
```
