import re

filepath = '/Users/ryner/Documents/Library/Programming/Java/Courses/MOOC/src/main/java/part01/s01startingprogramming/1-starting-programming.md'

with open(filepath, 'r') as f:
    text = f.read()

# Fix Q1
text = re.sub(
    r'\* \*\*Answer\*\*: No\. It is missing a semicolon `;` closing the print statement\. The Java compiler is unforgiving and will halt with a syntax error\.',
    r'<details>\n<summary><strong>View Answer</strong></summary>\n\nNo. It is missing a semicolon `;` closing the print statement. The Java compiler is unforgiving and will halt with a syntax error.\n</details>',
    text
)

# Fix Q2
text = re.sub(
    r'\* \*\*Answer\*\*: A \*\*parameter\*\*\. \(e\.g\., "I passed the string \'Ada Lovelace\' as a parameter to the println command\."\)',
    r'<details>\n<summary><strong>View Answer</strong></summary>\n\nA **parameter**. (e.g., "I passed the string \'Ada Lovelace\' as a parameter to the println command.")\n</details>',
    text
)

# Fix Q3
text = re.sub(
    r'\* \*\*Answer\*\*: The source code is compiled into \*\*bytecode\*\*\. Then, the \*\*Java Interpreter\*\* \(part of the JVM - Java Virtual Machine\) reads the bytecode and converts it into the exact machine code for the specific OS on the fly\. This enables "Write Once, Run Anywhere" \(WORA\)\.',
    r'<details>\n<summary><strong>View Answer</strong></summary>\n\nThe source code is compiled into **bytecode**. Then, the **Java Interpreter** (part of the JVM - Java Virtual Machine) reads the bytecode and converts it into the exact machine code for the specific OS on the fly. This enables "Write Once, Run Anywhere" (WORA).\n</details>',
    text
)

with open(filepath, 'w') as f:
    f.write(text)

