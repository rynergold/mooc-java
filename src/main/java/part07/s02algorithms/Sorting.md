# Sorting (5 parts)

**Exercise:** `part07-Part07_03.Sorting`
**Package:** `part07.s02algorithms`

## Spec

Finding the smallest value

Create in the class `MainProgram` a class method `smallest` that takes an integer array as a parameter. It should return the smallest value in the array.

Here is the structure of the method:

```java
public static int smallest(int[] array){
    // write your code here
}
```

The next example illustrates how the method works:

```java
int[] numbers = {6, 5, 8, 7, 11};
System.out.println("Smallest: " + MainProgram.smallest(numbers));
```

Smallest: 5

Index of the smallest value

Create a method called `indexOfSmallest` in the class MainProgram. It should return the index of the smallest number in the array that it receives as a parameter.

Here is the structure of the method:

```java
public static int indexOfSmallest(int[] array){
    // write your code here
}
```

The following code illustrates how to use the method:

```java
// indices:      0  1  2  3  4
int[] numbers = {6, 5, 8, 7, 11};
System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(numbers));
```

Index of the smallest number: 1

The smallest number in the array is 5, and its position in the array (i.e. index) is 1. Be sure to remember that indexing an array begins at 0.

Index of the smallest value after a certain value

Create in the class MainProgram a class method called `indexOfSmallestFrom`. It works similarly to the method in the previous section, but only considers the table values from a certain index forwards. In addition to the table, it receives this start index as a parameter.

The structure of the method is the following:

```java
public static int indexOfSmallestFrom(int[] table, int startIndex) {
    // write your code here
}
```

The following code illustrates how the method words:

```java
// indices:       0  1  2  3   4
int[] numbers = {-1, 6, 9, 8, 12};
System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));
```

0
1
3

In this example the first method call searches for the index of the smallest number, starting from index 0. Starting from index 0, the smallest number is -1 and its index is 0. The second method call searches for the index of the smallest value starting from index 1. In this case the smallest number is 6 and its index is 1. The third calls searches for the index of the smallest value starting at index 2. Then the smallest number is 8 and its index is 3.

Swapping numbers

Create a class method `swap` in the class MainProgram. It receives as its parameters an array and two indices inside it. The method swaps the numbers in these indices with each other.

The basic structure of the method is:

```java
public static void swap(int[] array, int index1, int index2) {
    // write your code here
}
```

The following illustrates how to use the method. To print an array we take use of the `toString` class method of the class `Arrays`. It formats an array into an easily readable string.

```java
int[] numbers = {3, 2, 5, 4, 8};

System.out.println(Arrays.toString(numbers));

MainProgram.swap(numbers, 1, 0);
System.out.println(Arrays.toString(numbers));

MainProgram.swap(numbers, 0, 3);
System.out.println(Arrays.toString(numbers));
```

[3, 2, 5, 4, 8]
[2, 3, 5, 4, 8]
[4, 3, 5, 2, 8]

Sorting

We have now assembled a set of useful methods. With their help, we can implement a sorting algorithm known by the name of selection sort.

The idea of selection sort is:

- Move the smallest number in the array to index 0.

- Move the second smallest number to index 1.

- Move the third smalles number in the array to index 2.

- Etc.

In other words:

- Examine the array starting from index 0. Swap the following two numbers with each other: the number at index 0, and the smallest number in the array starting from index 0.
- Examine the array starting from index 1. Swap the following two numbers with each other: the number at index 1, and the smallest number in the array starting from index 1.
- Examine the array starting from index 2. Swap the following two numbers with each other: the number at index 2, and the smallest number in the array starting from index 2.
- Etc.

Implement a class method called `sort` based on the idea above in the class MainProgram. It should include a loop that goes through the indices of the array. Certainly the method `indexOfSmallestFrom` and `swap` will come in handy. Additionally, print the contents of the array before sorting and after every iteration of the loop to ensure that the algorithm works as you expect it to.

The definition of the method looks like this:

```java
public static void sort(int[] array) {

}
```

Use at least the following example to test how the method functions:

```java
int[] numbers = {8, 3, 7, 9, 1, 2, 4};
MainProgram.sort(numbers);
```

The output of the program should look like the print below. Observe that you must print the contents of the array after each swap!

[8, 3, 7, 9, 1, 2, 4]
[1, 3, 7, 9, 8, 2, 4]
[1, 2, 7, 9, 8, 3, 4]
[1, 2, 3, 9, 8, 7, 4]
[1, 2, 3, 4, 8, 7, 9]
[1, 2, 3, 4, 7, 8, 9]
[1, 2, 3, 4, 7, 8, 9]

Mark how the array becomes sorted little by little starting from the beginning and advancing towards the end of the array.

## Examples

| Scenario / State | Expected Program Output (stdout) |
| :--- | :--- |
| Program execution | <pre>Smallest: 5<br>Index of the smallest number: 1<br>0<br>1<br>3<br>[3, 2, 5, 4, 8]<br>[2, 3, 5, 4, 8]<br>[4, 3, 5, 2, 8]<br>[8, 3, 7, 9, 1, 2, 4]<br>[1, 3, 7, 9, 8, 2, 4]<br>[1, 2, 7, 9, 8, 3, 4]<br>[1, 2, 3, 9, 8, 7, 4]<br>[1, 2, 3, 4, 8, 7, 9]<br>[1, 2, 3, 4, 7, 8, 9]<br>[1, 2, 3, 4, 7, 8, 9]</pre> |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part07.s02algorithms.SortingTest"
```
