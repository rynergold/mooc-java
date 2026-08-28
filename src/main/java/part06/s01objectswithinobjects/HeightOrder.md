# Height Order (3 parts)

**Exercise:** `part06-Part06_07.HeightOrder`
**Package:** `part06.s01objectswithinobjects`

## Spec

A `Person` class is included in the exercise template. A person has a name and a height. In this exercise, we'll implement a `Room` class, which can be used to add people and order them according to their height -- taking a person out of the room always returns the shortest person.

The class should eventually work in the following way.

Room

Create `Room` class. The class should contain a list of persons as an instance variable, and it should have a parameterless constructor. In addition, add the following methods to the class:

- `public void add(Person person)` - add the person passed as a paramter to the list.

- `public boolean isEmpty()` - returns a `boolean`-type value `true` or `false`, that tells whether the room is empty or not.

- `public ArrayList getPersons()` - returns a list of the persons in the room.

```java
Room room = new Room();
System.out.println("Empty room? " + room.isEmpty());
room.add(new Person("Lea", 183));
room.add(new Person("Kenya", 182));
room.add(new Person("Auli", 186));
room.add(new Person("Nina", 172));
room.add(new Person("Terhi", 185));
System.out.println("Empty room? " + room.isEmpty());

System.out.println("");
for (Person person : room.getPersons()) {
    System.out.println(person);
}
```

Shortest person

Add a `public Person shortest()` method to the `Room` class, which returns the shortest person added to the room. If the room is empty, a null reference is returned. The method should not remove a person from the room.

```java
Room room = new Room();
System.out.println("Shortest: " + room.shortest());
System.out.println("Empty room? " + room.isEmpty());
room.add(new Person("Lea", 183));
room.add(new Person("Kenya", 182));
room.add(new Person("Auli", 186));
room.add(new Person("Nina", 172));
room.add(new Person("Terhi", 185));
System.out.println("Empty room? " + room.isEmpty());

System.out.println("");
for (Person person : room.getPersons()) {
    System.out.println(person);
}

System.out.println();
System.out.println("Shortest: " + room.shortest());
System.out.println("");
for (Person person : room.getPersons()) {
    System.out.println(person);
}
```

Shortest: null

Taking from a room

Add a `public Person take()` method to the `Room` class, which takes the shortest person in the room. When a room is empty, it returns a `null` reference.

```java
Room room = new Room();
room.add(new Person("Lea", 183));
room.add(new Person("Kenya", 182));
room.add(new Person("Auli", 186));
room.add(new Person("Nina", 172));
room.add(new Person("Terhi", 185));

System.out.println("");
for (Person person : room.getPersons()) {
    System.out.println(person);
}

System.out.println();
System.out.println("Shortest: " + room.take());
System.out.println("");
for (Person person : room.getPersons()) {
    System.out.println(person);
}
```

Lea (183 cm)
Kenya (182 cm)
Auli (186 cm)
Terhi (185 cm)

It's now possible to print the persons in height order.

```java
Room room = new Room();
room.add(new Person("Lea", 183));
room.add(new Person("Kenya", 182));
room.add(new Person("Auli", 186));
room.add(new Person("Nina", 172));
room.add(new Person("Terhi", 185));

while (!room.isEmpty()) {
    System.out.println(room.take());
}
```

Nina (172 cm)
Kenya (182 cm)
Lea (183 cm)
Terhi (185 cm)
Auli (186 cm)

## Examples

| Scenario / State | Expected Program Output (stdout) |
| :--- | :--- |
| Program execution | <pre>Empty room? true<br>Empty room? false</pre> |
| Program execution | <pre>Lea (183 cm)<br>Kenya (182 cm)<br>Auli (186 cm)<br>Nina (172 cm)<br>Terhi (185 cm)<br>Shortest: null<br>Empty room? true<br>Empty room? false</pre> |
| Program execution | <pre>Lea (183 cm)<br>Kenya (182 cm)<br>Auli (186 cm)<br>Nina (172 cm)<br>Terhi (185 cm)</pre> |
| Program execution | <pre>Shortest: Nina (172 cm)</pre> |
| Program execution | <pre>Lea (183 cm)<br>Kenya (182 cm)<br>Auli (186 cm)<br>Nina (172 cm)<br>Terhi (185 cm)<br>Lea (183 cm)<br>Kenya (182 cm)<br>Auli (186 cm)<br>Nina (172 cm)<br>Terhi (185 cm)</pre> |
| Program execution | <pre>Shortest: Nina (172 cm)</pre> |
| Program execution | <pre>Lea (183 cm)<br>Kenya (182 cm)<br>Auli (186 cm)<br>Terhi (185 cm)<br>Nina (172 cm)<br>Kenya (182 cm)<br>Lea (183 cm)<br>Terhi (185 cm)<br>Auli (186 cm)</pre> |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part06.s01objectswithinobjects.HeightOrderTest"
```
