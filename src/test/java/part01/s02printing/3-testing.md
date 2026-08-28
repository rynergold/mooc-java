# Testing Console Output

> [!NOTE]
> You don't need to master this yet. You will formally learn testing in Part 2. This guide explains how to read the provided tests.

Most tests are simple: feed a method `2` and `3`, and check if it returns `5`. (See [MathExampleTest.java](file:///Users/ryner/Documents/Library/Programming/Java/Courses/MOOC/src/test/java/part01/s02printing/MathExampleTest.java) for a standard test).

But testing programs that only print text means intercepting the system's output. Open [AdaLovelaceTest.java](file:///Users/ryner/Documents/Library/Programming/Java/Courses/MOOC/src/test/java/part01/s02printing/AdaLovelaceTest.java) and follow the 4 annotated steps.

---

## 1. The Bucket (`ByteArrayOutputStream`)

By default, `System.out` flows directly to your screen. Our test code cannot read your screen. To fix this, we create a `ByteArrayOutputStream`—a memory bucket.

```mermaid
flowchart LR
    Program["Your Program"] -- "System.out.println()" --> Router{"System.out"}
    Router -- "Default Flow" --> Screen["🖥️ Screen / Console"]
    Router -. "Intercepted (@BeforeEach)" .-> Bucket[("🪣 ByteArrayOutputStream")]
    
    style Screen fill:#9e4b15,stroke:#333,stroke-width:2px,color:#fff
    style Bucket fill:#1d5b79,stroke:#333,stroke-width:2px,color:#fff
```

* **References:** 
  * [Oracle Docs: System.out](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/System.html#out) | [Baeldung: Testing System.out](https://www.baeldung.com/java-testing-system-out-println)
  * [Oracle Docs: ByteArrayOutputStream](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/io/ByteArrayOutputStream.html) | [Baeldung: OutputStreams](https://www.baeldung.com/java-outputstream)

---

## 2. The Setup (`@BeforeEach`)

JUnit uses annotations (words starting with `@`) to know when to run specific code. The `@BeforeEach` method runs right before every test. In `AdaLovelaceTest`, we use it to hijack the `System.out` stream and route it into our bucket.

* **References:** [JUnit 5 User Guide](https://junit.org/junit5/docs/current/user-guide/#writing-tests-annotations) | [Baeldung: JUnit 5 Guide](https://www.baeldung.com/junit-5)

---

## 3. The Teardown (`@AfterEach`)

The `@AfterEach` method runs right after a test finishes. We must use it to restore `System.out` to its default state. If we forget, the stream stays hijacked and IntelliJ permanently stops printing to your console.

---

## 4. The Execution (`@Test`)

The `@Test` annotation flags the method that triggers your program and checks the result. 

This is the exact data flow when JUnit runs the test suite:

```mermaid
sequenceDiagram
    participant JUnit as JUnit Runner
    participant Test as AdaLovelaceTest
    participant System as System.out
    participant Program as AdaLovelace
    participant Bucket as 🪣 Bucket

    JUnit->>Test: 1. @BeforeEach
    Test->>System: System.setOut(Bucket)
    Note over System,Bucket: Output routed to memory bucket
    
    JUnit->>Test: 2. @Test
    Test->>Program: AdaLovelace.main()
    Program->>System: println("Ada Lovelace")
    System->>Bucket: stores "Ada Lovelace"
    
    Test->>Bucket: bucket.toString()
    Bucket-->>Test: "Ada Lovelace\n"
    Test->>Test: assertEquals(expected, actual)
    
    JUnit->>Test: 3. @AfterEach
    Test->>System: System.setOut(Original Screen)
    Note over System: Output restored to console
```
