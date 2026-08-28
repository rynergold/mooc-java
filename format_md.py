import re

file_path = '/Users/ryner/Documents/Library/Programming/Java/Courses/MOOC/src/main/java/part01/s02printing/2-printing.md'

with open(file_path, 'r') as f:
    text = f.read()

# Remove HTML comments
text = re.sub(r'<!--.*?-->', '', text, flags=re.DOTALL)

# Replace <sample-output>
text = re.sub(r'<sample-output>\s*(.*?)\s*</sample-output>', r'**Sample Output**\n```text\n\1\n```', text, flags=re.DOTALL)

# Replace <text-box>
def replace_textbox(match):
    name = match.group(2)
    content = match.group(3)
    lines = content.split('\n')
    quoted_content = '\n'.join('> ' + line for line in lines)
    return f"> [!NOTE]\n> **{name}**\n>\n{quoted_content}"

text = re.sub(r'<text-box variant=[\'"](.*?)[\'"] name=[\'"](.*?)[\'"]>\s*(.*?)\s*</text-box>', replace_textbox, text, flags=re.DOTALL)

# Replace <programming-exercise>
def replace_exercise(match):
    name = match.group(1)
    content = match.group(3)
    return f"### Programming Exercise: {name}\n\n{content}"

text = re.sub(r'<programming-exercise name=[\'"](.*?)[\'"] tmcname=[\'"](.*?)[\'"]>\s*(.*?)\s*</programming-exercise>', replace_exercise, text, flags=re.DOTALL)

# Replace <youtube>
text = re.sub(r'<youtube id=[\'"](.*?)[\'"]></youtube>', r'[Watch on YouTube](https://www.youtube.com/watch?v=\1)', text)

# Cleanup extra blank lines
text = re.sub(r'\n{3,}', '\n\n', text)

with open(file_path, 'w') as f:
    f.write(text)

print("Formatting applied successfully.")
