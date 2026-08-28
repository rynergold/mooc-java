# Recipe search (4 parts)

**Exercise:** `part07-Part07_07.RecipeSearch`
**Package:** `part07.s03largerexercises`

## Spec

In this exercise we are going to create a program that allows for searching for recipes based on their name, cooking time, or the name of an ingredient. The program should read the recipes from a file that the user provides. *It might be a good idea to brush up on reading information from files (part 4) before beginning*

Each recipe consists of three or more rows in a recipe file. The first row is for the name of the recipe, the second the cooking time (an integer), and the third and possibly following rows list the ingredients used in the recipe. An empty row follows the last ingredient row. There can be many recipes in a single file. Below, an example file containing recipes is described.

Tofu rolls
30
tofu
rice
water
carrot
cucumber
avocado
wasabi

The program will be implemented in parts. First we'll create the possibility to read and list recipes. After that we'll add the functionality to search for recipes based on their name, cooking time, or the name of an ingredient.

There is a file called `recipes.txt` supplied with the exercise base. You can use it for testing purposes. Notice that the program should not list the ingredients of the recipes, but they will be used in the search functionality.

 

Reading and listing recipes

First create the functionality to read and list recipes. The user interface of the program is described below. You may assume that the user only enters files that exist. Below we assume that the example recipes given earlier in the exercise description are stored in the file `recipes.txt`.

File to read: **recipes.txt**

Finding recipes by name

Make it possible to find recipes by their names. Finding by name is done with the command `find name`, after which the user is asked for the name that is used to search. The search should print all the recipes whose names contain the string given by the user.

File to read: **recipes.txt**

find name - searches recipes by name

Searching for recipes by cooking time

Next, implement the possibility to find recipes based on their cooking time. This is done with the command `find cooking time`, after which the user is asked for the longest acceptable cooking time. The program should react by printing all the recipes whose cooking times don't exceed the cooking time given by the user (so equal or less time).

File to read: **recipes.txt**

find name - searches recipes by name
find cooking time - searches recipes by cooking time

Finding recipes based on their ingredients

Finally, add the functionality to search for recipes based on their ingredients. This is done by choosing the command `find ingredient`, after which the user is asked for a string. The program should then print all the recipes that contain the specified string. Notice that with this option the given string must match exactly the ingredient that is searched for (e.g. "ugar" will return different results than "sugar").

File to read: **recipes.txt**

find name - searches recipes by name
find cooking time - searches recipes by cooking time
find ingredient - searches recipes by ingredient

Pancake dough, cooking time: 60

Pancake dough, cooking time: 60
Meatballs, cooking time: 20

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| Program execution | `Pancake dough`<br>`60`<br>`milk`<br>`egg`<br>`flour`<br>`salt`<br>`butter` |
| Program execution | `Meatballs`<br>`20`<br>`ground meat`<br>`egg`<br>`breadcrumbs` |
| `recipes.txt` | `Tofu rolls`<br>`30`<br>`tofu`<br>`rice`<br>`water`<br>`carrot`<br>`cucumber`<br>`avocado`<br>`wasabi`<br>`File to read:` |
| Program execution | `Commands:`<br>`list - lists the recipes`<br>`stop - stops the program` |
| `list` | `Enter command:` |
| Program execution | `Recipes:`<br>`Pancake dough, cooking time: 60`<br>`Meatballs, cooking time: 20`<br>`Tofu rolls, cooking time: 30` |
| 1. `stop`<br>2. `recipes.txt` | `Enter command:`<br>`File to read:` |
| Program execution | `Commands:`<br>`list - lists the recipes`<br>`stop - stops the program`<br>`find name - searches recipes by name` |
| `list` | `Enter command:` |
| Program execution | `Recipes:`<br>`Pancake dough, cooking time: 60`<br>`Meatballs, cooking time: 20`<br>`Tofu rolls, cooking time: 30` |
| 1. `find name`<br>2. `roll` | `Enter command:`<br>`Searched word:` |
| Program execution | `Recipes:`<br>`Tofu rolls, cooking time: 30` |
| 1. `stop`<br>2. `recipes.txt` | `Enter command:`<br>`File to read:` |
| Program execution | `Commands:`<br>`list - lists the recipes`<br>`stop - stops the program`<br>`find name - searches recipes by name`<br>`find cooking time - searches recipes by cooking time` |
| 1. `find cooking time`<br>2. `30` | `Enter command:`<br>`Max cooking time:` |
| Program execution | `Recipes:`<br>`Meatballs, cooking time: 20`<br>`Tofu rolls, cooking time: 30` |
| 1. `find cooking time`<br>2. `15` | `Enter command:`<br>`Max cooking time:` |
| Program execution | `Recipes:` |
| 1. `find name`<br>2. `roll` | `Enter command:`<br>`Searched word:` |
| Program execution | `Recipes:`<br>`Tofu rolls, cooking time: 30` |
| 1. `stop`<br>2. `recipes.txt` | `Enter command:`<br>`File to read:` |
| Program execution | `Commands:`<br>`list - lists the recipes`<br>`stop - stops the program`<br>`find name - searches recipes by name`<br>`find cooking time - searches recipes by cooking time`<br>`find ingredient - searches recipes by ingredient` |
| 1. `find cooking time`<br>2. `30` | `Enter command:`<br>`Max cooking time:` |
| Program execution | `Recipes:`<br>`Meatballs, cooking time: 20`<br>`Tofu rolls, cooking time: 30` |
| 1. `find ingredient`<br>2. `sugar` | `Enter command:`<br>`Ingredient:` |
| Program execution | `Recipes:`<br>`Pancake dough, cooking time: 60` |
| 1. `find ingredient`<br>2. `egg` | `Enter command:`<br>`Ingredient:` |
| Program execution | `Recipes:`<br>`Pancake dough, cooking time: 60`<br>`Meatballs, cooking time: 20` |
| 1. `find ingredient`<br>2. `gg` | `Enter command:`<br>`Ingredient:` |
| Program execution | `Recipes:` |
| `stop` | `Enter command:` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part07.s03largerexercises.RecipeSearchTest"
```
