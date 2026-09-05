# Electricity Bill

**Category:** Logic Drill (Tier 2)  
**Package:** `part01.s06conditionalstatements`

## Spec

Write a program that calculates a tiered electricity bill based on consumption in kilowatt-hours (kWh).

- Prompt: `"Enter consumption (kWh):"`
- Billing Structure:
  - Every customer pays a fixed monthly base fee of `5.0` euros.
  - Slices of consumption are billed in stepped tiers:
    - Tier 1: The first 100 kWh (0–100) are billed at `0.10` euros per kWh.
    - Tier 2: The next 100 kWh (101–200) are billed at `0.15` euros per kWh.
    - Tier 3: Any consumption exceeding 200 kWh is billed at `0.20` euros per kWh.
- Output: `"Total bill: "` followed by the total cost as a double and `"€"`.

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| <pre>50</pre> | <pre>Enter consumption (kWh):<br>Total bill: 10.0€</pre> |
| <pre>150</pre> | <pre>Enter consumption (kWh):<br>Total bill: 22.5€</pre> |
| <pre>250</pre> | <pre>Enter consumption (kWh):<br>Total bill: 40.0€</pre> |

## Terminal Practice

Run the test suite from your command line:
```bash
./gradlew test --tests "part01.s06conditionalstatements.ElectricityBillTest"
```
