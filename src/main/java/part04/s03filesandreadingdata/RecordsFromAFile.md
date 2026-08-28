# Records From a File

**Exercise:** `part04-Part04_29.RecordsFromAFile`
**Package:** `part04.s03filesandreadingdata`

## Spec

In this exercise, we'll be working with files stored in CSV-format that contain names and ages separated by commas. The file format may look like this:

lily,3
anton,5
levi,4
amy,1

Your task is to write a program that first prompts the user for the name of the file they want to read. The program then prints the content of the file in the following way (we're assuming below that the output is from the above-mentioned file):

Name of the file:
**data.txt**
lily, age: 3 years
anton, age: 5 years
levi, age: 4 years
amy, age: 1 year

**NB**! The word "year" should be formatted based on the age.

## Expected Output

```
Name of the file:
**data.txt**
lily, age: 3 years
anton, age: 5 years
levi, age: 4 years
amy, age: 1 year
```


## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part04.s03filesandreadingdata.RecordsFromAFileTest"
```
