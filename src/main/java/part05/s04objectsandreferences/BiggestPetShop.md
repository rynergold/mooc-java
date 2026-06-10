# Biggest pet shop

**Exercise:** `part05-Part05_08.BiggestPetShop`
**Package:** `part05.04objectsandreferences`

## Spec

Two classes, `Person` and `Pet`, are included in the exercise template. Each person has one pet. Modify the `public String toString` method of the `Person` class so that the string it returns tells the pet's name and breed in addition to the person's own name.

```java
Pet lucy = new Pet("Lucy", "golden retriever");
Person leo = new Person("Leo", lucy);

System.out.println(leo);
```

Leo, has a friend called Lucy (golden retriever)

## Expected Output

```
Leo, has a friend called Lucy (golden retriever)
```
