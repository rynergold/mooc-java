# Character Sheet (Extension Drill)

**Exercise:** `part01-Part01_Drill_02.CharacterSheet`  
**Package:** `part01.s04variables`

## Spec

Write a program that prompts for character profile details across all four data types (`String`, `int`, `double`, `boolean`) in this exact order:

1. `"Enter character name:"` (String)
2. `"Enter character level:"` (int — converted via `Integer.valueOf(...)`)
3. `"Enter gold coins:"` (double — converted via `Double.valueOf(...)`)
4. `"Is in active guild? (true/false):"` (boolean — converted via `Boolean.valueOf(...)`)
5. `"Enter earned title:"` (String)

After reading all inputs, the program should construct a full title (combining `<character name> the <earned title>`) and output the summary profile matching the exact format below.

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| <pre>Ada Lovelace<br>42<br>999.75<br>true<br>Grand Architect</pre> | <pre>Enter character name:<br>Enter character level:<br>Enter gold coins:<br>Is in active guild? (true/false):<br>Enter earned title:<br>=== CHARACTER PROFILE ===<br>Name: Ada Lovelace<br>Full Title: Ada Lovelace the Grand Architect<br>Level: 42<br>Purse: 999.75 gold<br>Guild Member: true</pre> |
| <pre>Sir Fluffy<br>7<br>12.5<br>FALSE<br>Brave Duck</pre> | <pre>Enter character name:<br>Enter character level:<br>Enter gold coins:<br>Is in active guild? (true/false):<br>Enter earned title:<br>=== CHARACTER PROFILE ===<br>Name: Sir Fluffy<br>Full Title: Sir Fluffy the Brave Duck<br>Level: 7<br>Purse: 12.5 gold<br>Guild Member: false</pre> |

## Terminal Practice

Run the test suite from your command line:
```bash
./gradlew test --tests "part01.s04variables.CharacterSheetTest"
```
