# Saveable person

**Exercise:** `part11-Part11_06.SaveablePerson`
**Package:** `part11.s01classdiagrams`

## Spec

Below you'll see the interface Saveable and the class Person. Implement the contents of this class diagram in the exercise base.

> Saveable ||+save():void;+delete():void;+load(address:String):void]^-.-[Person|-name:String;-address:String]">

## Examples

| Scenario / State | Expected Program Output (stdout) |
| :--- | :--- |
| Program execution | <pre>(see spec)</pre> |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part11.s01classdiagrams.SaveablePersonTest"
```
