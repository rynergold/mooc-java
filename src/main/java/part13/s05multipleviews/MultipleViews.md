# Multiple views

**Exercise:** `part13-Part13_09.MultipleViews`
**Package:** `part13.s05multipleviews`

## Spec

There is a class called MultipleViews in the exercise template. Create in it an application that contains three separate views. The views are as follows:

- The layout of the first view is done with the help of the BorderPane class. At the top there is the text "First view!". The center of the view contains a button with the text "To the second view!". By pressing that button the application swithces to the second view.

- The layout of the second view is done with the help of the VBox class. The first element in the layout is a button with the text "To the third view!" in it -- by pressing the button the application switches to the third view. The button is followed by the text "Second view!".

- The third view uses the GridPane class for its layout. At the coordinates (0, 0) there is a text that reads "Third view!". At coordinates (1, 1) there is a button with the text "To the first view!". Pressing this button brings back the first view.

When first started, the program should display the first view.

## Examples

| Scenario / State | Expected Console Output (stdout) |
| :--- | :--- |
| Program execution | `(see spec)` |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part13.s05multipleviews.MultipleViewsTest"
```
