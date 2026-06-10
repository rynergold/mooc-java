// Exercise: part07-Part07_07.RecipeSearch
// Section: Part 07 / 3-larger-exercises
// Course: https://java-programming.mooc.fi/part-7/3-larger-exercises
//
// Spec (brief):
// In this exercise we are going to create a program that allows for searching for recipes based on their name, cooking time, or the name of an ingredient. The program should read the recipes from a file that the user provides. *It might be a good idea to brush up on reading information from files (part 4) before beginning*
// Each recipe consists of three or more rows in a recipe file. The first row is for the name of the recipe, the second the cooking time (an integer), and the third and possibly following rows list the ingredients used in the recipe. An empty row follows the last ingredient row. There can be many recipes in a single file. Below, an example file containing recipes is described.
//
// Expected output:
// Lettutaikina
// 60
// maito
// muna
// jauho
// sokeri
// suola
// voi
//
// Lihapullat
// 20
// jauheliha
// muna
// korppujauho
//
// Tofurullat
// 30
// tofu
// riisi
// vesi
// porkkana
// kurkku
// avokado
// wasabi
// Pancake dough
// 60
// milk
// egg
// flour
// salt
// butter
//
// Meatballs
// 20
// ground meat
// egg
// breadcrumbs
//
// Tofu rolls
// 30
// tofu
// rice
// water
// carrot
// cucumber
// avocado
// wasabi
// Mistä luetaan? **reseptit.txt**
//
// Komennot:
// listaa - listaa reseptit
// lopeta - lopettaa ohjelman
//
// Syötä komento: **listaa**
//
// Reseptit:
// Lettutaikina, keittoaika: 60
// Lihapullat, keittoaika: 20
// Tofurullat, keittoaika: 30
//
// Syötä komento:  **lopeta**
// File to read: **recipes.txt**
//
// Commands:
// list - lists the recipes
// stop - stops the program
//
// Enter command: **list**
//
// Recipes:
// Pancake dough, cooking time: 60
// Meatballs, cooking time: 20
// Tofu rolls, cooking time: 30
//
// Enter command:  **stop**
// Mistä luetaan? **reseptit.txt**
//
// Komennot:
// listaa - listaa reseptit
// lopeta - lopettaa ohjelman
// hae nimi - hakee reseptiä nimen perusteella
//
// Syötä komento: **listaa**
//
// Reseptit:
// Lettutaikina, keittoaika: 60
// Lihapullat, keittoaika: 20
// Tofurullat, keittoaika: 30
//
// Syötä komento: **hae nimi**
// Mitä haetaan: **rulla**
//
// Reseptit:
// Tofurullat, keittoaika: 30
//
// Syötä komento:  **lopeta**
// File to read: **recipes.txt**
//
// Commands:
// list - lists the recipes
// stop - stops the program
// find name - searches recipes by name
//
// Enter command: **list**
//
// Recipes:
// Pancake dough, cooking time: 60
// Meatballs, cooking time: 20
// Tofu rolls, cooking time: 30
//
// Enter command: **find name**
// Searched word: **roll**
//
// Recipes:
// Tofu rolls, cooking time: 30
//
// Enter command:  **stop**
// Mistä luetaan? **reseptit.txt**
//
// Komennot:
// listaa - listaa reseptit
// lopeta - lopettaa ohjelman
// hae nimi - hakee reseptiä nimen perusteella
// hae keittoaika - hakee reseptiä keittoajan perusteella
//
// Syötä komento: **hae keittoaika**
// Keittoaika korkeintaan: **30**
//
// Reseptit:
// Lihapullat, keittoaika: 20
// Tofurullat, keittoaika: 30
//
// Syötä komento: **hae keittoaika**
// Keittoaika korkeintaan: **15**
//
// Reseptit:
//
// Syötä komento: **hae nimi**
// Mitä haetaan: **rulla**
//
// Reseptit:
// Tofurullat, keittoaika: 30
//
// Syötä komento:  **lopeta**
// File to read: **recipes.txt**
//
// Commands:
// list - lists the recipes
// stop - stops the program
// find name - searches recipes by name
// find cooking time - searches recipes by cooking time
//
// Enter command: **find cooking time**
// Max cooking time: **30**
//
// Recipes:
// Meatballs, cooking time: 20
// Tofu rolls, cooking time: 30
//
// Enter command: **find cooking time**
// Max cooking time: **15**
//
// Recipes:
//
// Enter command: **find name**
// Searched word: **roll**
//
// Recipes:
// Tofu rolls, cooking time: 30
//
// Enter command:  **stop**
// Mistä luetaan? **reseptit.txt**
//
// Komennot:
// listaa - listaa reseptit
// lopeta - lopettaa ohjelman
// hae nimi - hakee reseptiä nimen perusteella
// hae keittoaika - hakee reseptiä keittoajan perusteella
// hae aine - hakee reseptiä raaka-aineen perusteella
//
// Syötä komento: **hae keittoaika**
// Keittoaika korkeintaan: **30**
//
// Reseptit:
// Lihapullat, keittoaika: 20
// Tofurullat, keittoaika: 30
//
// Syötä komento: **hae aine**
// Mitä raaka-ainetta haetaan: **sokeri**
//
// Reseptit:
// Lettutaikina, keittoaika: 60
//
// Syötä komento: **hae aine**
// Mitä raaka-ainetta haetaan: **muna**
//
// Reseptit:
// Lettutaikina, keittoaika: 60
// Lihapullat, keittoaika: 20
//
// Syötä komento: **hae aine**
// Mitä raaka-ainetta haetaan: **una**
//
// Reseptit:
//
// Syötä komento:  **lopeta**

public class RecipeSearch {
    public static void main(String[] args) {
        // Write your program here

    }
}
