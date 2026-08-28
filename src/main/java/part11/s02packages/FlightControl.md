# FlightControl (2 parts)

**Exercise:** `part11-Part11_10.FlightControl`
**Package:** `part11.s02packages`

## Spec

In this exercise, you will implement the application that was described above. You are free to design the structure as you wish, or you can follow the structure sketched out above. The appearance of the user interface and the required commands are predefined. This exercise is worth two normal exercise points.

In this exercise, you will implement a flight control application. It is used to control the airplanes and their flight routes. The system always knows the identifier and the capacity of an airplane. The flight information consists of the used airplane, the departure airport id (e.g. HEL), and the destination airport ID (e.g. BAL).

There can be multiple airplanes and flights. The same airplane can be used to make several flights.

The application should operate in two parts: first, the user enters information about airplanes and flights in the airport asset control, after which the program offers the flight information service for the user. There are three operations in this latter flight control -- printing the airplanes, printing the flights, and printing the information of a single airplane. In addition, the user may exit the program by choosing the option `x`. If the user enters an invalid command, the program asks for a command again.

**NB** For the purposes of the test it is essential that the *user interface* work **exactly** as described above. You should probably copy the options printed by the program from here to your code. The tests won't assume that your program is prepared to handle improper input.

## Examples

| User Input (stdin) | Expected Program Output (stdout) |
| :--- | :--- |
| <pre>1. 1<br>2. HA-LOL<br>3. 42<br>4. 1<br>5. G-OWAC<br>6. 101<br>7. 2<br>8. HA-LOL<br>9. HEL<br>10. BAL<br>11. 2<br>12. G-OWAC<br>13. JFK<br>14. BAL<br>15. 2<br>16. HA-LOL<br>17. BAL<br>18. HEL<br>19. x</pre> | <pre>Airport Asset Control<br>--------------------<br>Choose an action:<br>[1] Add an airplane<br>[2] Add a flight<br>[x] Exit Airport Asset Control<br>&gt;<br>Give the airplane id:<br>Give the airplane capacity:<br>Choose an action:<br>[1] Add an airplane<br>[2] Add a flight<br>[x] Exit Airport Asset Control<br>&gt;<br>Give the airplane id:<br>Give the airplane capacity:<br>Choose an action:<br>[1] Add an airplane<br>[2] Add a flight<br>[x] Exit Airport Asset Control<br>&gt;<br>Give the airplane id:<br>Give the departure airport id:<br>Give the target airport id:<br>Choose an action:<br>[1] Add an airplane<br>[2] Add a flight<br>[x] Exit Airport Asset Control<br>&gt;<br>Give the airplane id:<br>Give the departure airport id:<br>Give the target airport id:<br>Choose an action:<br>[1] Add an airplane<br>[2] Add a flight<br>[x] Exit Airport Asset Control<br>&gt;<br>Give the airplane id:<br>Give the departure airport id:<br>Give the target airport id:<br>Choose an action:<br>[1] Add an airplane<br>[2] Add a flight<br>[x] Exit Airport Asset Control<br>&gt;</pre> |
| <pre>1. 1<br>2. 2</pre> | <pre>Flight Control<br>------------<br>Choose an action:<br>[1] Print airplanes<br>[2] Print flights<br>[3] Print airplane details<br>[x] Quit<br>&gt;<br>G-OWAC (101 capacity)<br>HA-LOL (42 capacity)<br>Choose an action:<br>[1] Print airplanes<br>[2] Print flights<br>[3] Print airplane details<br>[x] Quit<br>&gt;<br>HA-LOL (42 capacity) (HEL-BAL)<br>HA-LOL (42 capacity) (BAL-HEL)<br>G-OWAC (101 capacity) (JFK-BAL)</pre> |
| <pre>1. 3<br>2. G-OWAC</pre> | <pre>Choose an action:<br>[1] Print airplanes<br>[2] Print flights<br>[3] Print airplane details<br>[x] Quit<br>&gt;<br>Give the airplane id:<br>G-OWAC (101 capacity)</pre> |
| <pre>x</pre> | <pre>Choose an action:<br>[1] Print airplanes<br>[2] Print flights<br>[3] Print airplane details<br>[x] Quit<br>&gt;</pre> |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part11.s02packages.FlightControlTest"
```
