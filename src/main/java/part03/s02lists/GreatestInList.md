# Greatest in list

**Exercise:** `part03-Part03_09.GreatestInList`
**Package:** `part03.02lists`

## Spec

The exercise template contains a base that reads numbers from the user and adds them to a list. Reading is stopped once the user enters the number -1.

Continue developing the program so that it finds the greatest number in the list and prints its value after reading all the numbers. The programming should work in the following manner.

**72**
**2**
**8**
**93**
**11**
**-1**

The greatest number: 93

You can use the source code below as an example. It is used to find the smallest number.

```java
// assume we have a list that contains integers

int smallest = list.get(0);

for(int i = 0; i  number) {
        smallest = number;
    }
}

System.out.println("The smallest number: " + smallest);
```

## Expected Output

```
**72**
**2**
**8**
**93**
**11**
**-1**

The greatest number: 93
```
