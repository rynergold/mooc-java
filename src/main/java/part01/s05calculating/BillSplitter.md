# Bill Splitter (Extension Drill)

**Exercise:** `part01-Part01_Drill_03.BillSplitter`  
**Package:** `part01.s05calculating`

## Spec

Write a program that calculates tip, total bill, and each person's share when dining out.

The program must prompt for input in this exact order:
1. `"Enter food bill:"` (read as `double`)
2. `"Enter tip percentage (e.g. 15 for 15%):"` (read as `int`)
3. `"Enter number of people splitting:"` (read as `int`)

After reading the inputs, the program calculates:
- `tip`: `foodBill * tipPercentage / 100.0`
- `total`: `foodBill + tip`
- `perPerson`: `total / numberOfPeople`

Finally, print the breakdown matching the exact lines:
```text
Tip amount: <tip>
Total bill: <total>
Each person pays: <perPerson>
```

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| <pre>80.0<br>15<br>4</pre> | <pre>Enter food bill:<br>Enter tip percentage (e.g. 15 for 15%):<br>Enter number of people splitting:<br>Tip amount: 12.0<br>Total bill: 92.0<br>Each person pays: 23.0</pre> |
| <pre>50.0<br>10<br>2</pre> | <pre>Enter food bill:<br>Enter tip percentage (e.g. 15 for 15%):<br>Enter number of people splitting:<br>Tip amount: 5.0<br>Total bill: 55.0<br>Each person pays: 27.5</pre> |
| <pre>100.0<br>20<br>5</pre> | <pre>Enter food bill:<br>Enter tip percentage (e.g. 15 for 15%):<br>Enter number of people splitting:<br>Tip amount: 20.0<br>Total bill: 120.0<br>Each person pays: 24.0</pre> |

## Terminal Practice

Run the test suite from your command line:
```bash
./gradlew test --tests "part01.s05calculating.BillSplitterTest"
```
