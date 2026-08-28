# Literacy comparison (2 parts)

**Exercise:** `part10-Part10_13.LiteracyComparison`
**Package:** `part10.s02interfacecomparable`

## Spec

This exercise uses open data about literacy levels, provided by UNESCO. The data includes statistics of estimated or reported levels of literacy for various countries for the past two years.
File `literacy.csv`, included with the exercise template, includes the literacy estimates for women and men over 15 years of age. Each line in the file `literacy.csv` is as follows:
"theme, age group, gender, country, year, literacy percent. Below are the first five lines as an example.

Adult literacy rate, population 15+ years, female (%),United Republic of Tanzania,2015,76.08978
Adult literacy rate, population 15+ years, female (%),Zimbabwe,2015,85.28513
Adult literacy rate, population 15+ years, male (%),Honduras,2014,87.39595
Adult literacy rate, population 15+ years, male (%),Honduras,2015,88.32135
Adult literacy rate, population 15+ years, male (%),Angola,2014,82.15105

Create a program that first reads the file `literacy.csv` and then prints the contents from the lowest to the highest ranked on the literacy rate. The output must be exactly as in the following example. The example shows the first five  of the expected rows.

This exercise is worth two points.

Tip! Here's how to split a string into an array by each comma.

```java
String string = "Adult literacy rate, population 15+ years, female (%),Zimbabwe,2015,85.28513";
String[] pieces = string.split(",");
// now pieces[0] equals "Adult literacy rate"
// pieces[1] equals " population 15+ years"
// etc.

// to remove whitespace, use the trim() method:
pieces[1] = pieces[1].trim();
```

## Examples

| Scenario / State | Expected Program Output (stdout) |
| :--- | :--- |
| Program execution | `Niger (2015), female, 11.01572`<br>`Mali (2015), female, 22.19578`<br>`Guinea (2015), female, 22.87104`<br>`Afghanistan (2015), female, 23.87385`<br>`Central African Republic (2015), female, 24.35549` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part10.s02interfacecomparable.LiteracyComparisonTest"
```
