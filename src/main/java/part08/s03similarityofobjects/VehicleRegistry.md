# Vehicle Registry (3 parts)

**Exercise:** `part08-Part08_13.VehicleRegistry`
**Package:** `part08.s03similarityofobjects`

## Spec

Equals and hashCode for the LicensePlate class

European license plates have two parts: a two letter country code and a nationally unique license number. The license number is made up of numbers and characters. License plates are represented by the following class:

```java
public class LicensePlate {

    // these instance variables have been defined as final, meaning
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }
```

We want to be able to save the license plates in ArrayLists and to use them as keys in a HashMap. This, as explained above, means that the `equals` and `hashcode` methods need to be overwritten, or they won't work as intended. Implement the methods `equals` and `hashCode` for the LicensePlate class.

Example program:

```java
public static void main(String[] args) {
    // the following is the same sample program shown in ex 8.13 description

        LicensePlate li1 = new LicensePlate("FI", "ABC-123");
        LicensePlate li2 = new LicensePlate("FI", "UXE-465");
        LicensePlate li3 = new LicensePlate("D", "B WQ-431");

        ArrayList finnishPlates = new ArrayList<>();
        finnishPlates.add(li1);
        finnishPlates.add(li2);

        LicensePlate newLi = new LicensePlate("FI", "ABC-123");
        if (!finnishPlates.contains(newLi)) {
            finnishPlates.add(newLi);
        }
        System.out.println("finnish: " + finnishPlates);
        // if the equals-method hasn't been overwritten, the same license number will be added to the list againg

        HashMap owners = new HashMap<>();
        owners.put(li1, "Arto");
        owners.put(li3, "Jürgen");

        System.out.println("omistajat:");
        System.out.println(owners.get(new LicensePlate("FI", "ABC-123")));
        System.out.println(owners.get(new LicensePlate("D", "B WQ-431")));
        // if the hasCode-method hasn't been overwritten, the owners won't be found
}
```

Implement the methods `equals` and `hashCode`. When they are implemented correctly the example program above will print:

Pairing plates with owners

Implement the class `VehicleRegistry`, which has the following methods:

- `public boolean add(LicensePlate licensePlate, String owner)` assigns the owner it received as a parameter to a car that corresponds to the license plate received as a parameter. If the license plate doesn't have an owner, the method returns true. If the license already has an owner attached, the method returns false and does nothing.

- `public String get(LicensePlate licensePlate)` returns the owner of the car corresponding to the license plate received as a parameter. If the car isn't in the registry, the method returns null.

- `public boolean remove(LicensePlate licensePlate)` removes the license plate and attached data from the registry. The method returns true if removed successfully and false if the license plate wasn't in the registry.

Expanded vehicle registry

Add the following methods to the `VehicleRegistry`:

- `public void printLicensePlates()`prints the license plates in the registry.

- `public void printOwners()` prints the owners of the cars in the registry. Each name should only be printed once, even if a particular person owns more than one car.

Useful tip! In the printOwners method, you can create a list used for remembering the owners that were already printed. If an owner is not on the list, their name is printed and they are added to the list; conversely, if an owner is on the list, their name isn't printed.

## Examples

| Scenario / State | Expected Program Output (stdout) |
| :--- | :--- |
| Program execution | `Finnish: [FI ABC-123, FI UXE-465]` |
| Program execution | `owners:`<br>`Arto`<br>`Jürgen` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part08.s03similarityofobjects.VehicleRegistryTest"
```
