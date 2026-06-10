# Is it in the file?

**Exercise:** `part04-Part04_27.IsItInTheFile`
**Section:** Part 04 / 3-files-and-reading-data
**Course:** https://java-programming.mooc.fi/part-4/3-files-and-reading-data

## Spec

The exercise template comes with two files, `names.txt` and `other-names.txt`. Write a program that first asks the user for the name of the file to be read, after which the user is prompted for the string that they're looking for. The program then reads the file and searches for the desired string.

If the string is found, the program should print "Found!". If not, the program should print "Not found.". If reading the file fails (the reading ends in an error) the program should print the message "Reading the file " + file + " failed.".

Name of the file:
**names.txt**
Search for:
**Antti**
Not found.

Name of the file:
**names.txt**
Search for:
**ada**
Found!

Name of the file:
**nonexistent.txt**
Search for:
**test**
Reading the file nonexistent.txt failed.

## Expected Output

```
Name of the file:
**names.txt**
Search for:
**Antti**
Not found.
Name of the file:
**names.txt**
Search for:
**ada**
Found!
Name of the file:
**nonexistent.txt**
Search for:
**test**
Reading the file nonexistent.txt failed.
```
