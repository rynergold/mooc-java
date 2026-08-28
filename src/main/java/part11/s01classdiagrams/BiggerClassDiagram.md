# Bigger class diagram

**Exercise:** `part11-Part11_07.BiggerClassDiagram`
**Package:** `part11.s01classdiagrams`

## Spec

Below you'll see a somewhat larger class diagram. In it are the classes A, B, C, D, and E, as well as the interfaces IA, IB, and IC. Create these classes and interfaces in the exercise.

>;IA][>;IB][>;IC][A]-.-^[>;IA][B]-.-^[>;IB][C]-.-^[>;IC][D]->[>;IA][E]*-*[C][C]-^[B][B]-^[A]">

## Examples

| Scenario / State | Expected Program Output (stdout) |
| :--- | :--- |
| Program execution | <pre>(see spec)</pre> |

## Terminal Practice

To build terminal fluency, run this specific test directly from your command line:
```bash
./gradlew test --tests "part11.s01classdiagrams.BiggerClassDiagramTest"
```
