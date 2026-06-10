# Dictionary of many translations

**Exercise:** `part08Part08_14.DictionaryOfManyTranslations`
**Section:** Part 08 / 4-grouping-data-using-hash-maps
**Course:** https://java-programming.mooc.fi/part-8/4-grouping-data-using-hash-maps

## Spec

Your assignment is to create the class `DictionaryOfManyTranslations`. In it can be stored one or more translations for each word. The class is to implement the following methods:

- `public void add(String word, String translation)` adds the translation for the word and preserves the old translations.

- `public ArrayList translate(String word)` returns a list of the translations added for the word. If the word has no translations, the method should return an empty list.

- `public void remove(String word)` removes the word and all its translations from the dictionary.

It's probably best to add the translations to an object variable that is of the type `HashMap>`

An example:

```java
DictionaryOfManyTranslations dictionary = new DictionaryOfManyTranslations();
dictionary.add("lie", "maata");
dictionary.add("lie", "valehdella");

dictionary.add("bow", "jousi");
dictionary.add("bow", "kumartaa");

System.out.println(dictionary.translate("lie"));
dictionary.remove("bow");
System.out.println(dictionary.translate("bow"));
```

[maata, valehdella]
[]

## Expected Output

```
[maata, valehdella]
[]
```
