import os
import re
import glob

base_dir = '/Users/ryner/Documents/Library/Programming/Java/Courses/MOOC/src/main/java'
md_files = glob.glob(f'{base_dir}/**/*.md', recursive=True)

def replace_textbox(match):
    name = match.group(2)
    content = match.group(3)
    lines = content.split('\n')
    quoted_content = '\n'.join('> ' + line for line in lines)
    return f"> [!NOTE]\n> **{name}**\n>\n{quoted_content}"

def replace_exercise(match):
    name = match.group(1)
    content = match.group(3)
    return f"### Programming Exercise: {name}\n\n{content}"

for filepath in md_files:
    with open(filepath, 'r', encoding='utf-8') as f:
        text = f.read()
    
    # 1. Remove HTML comments
    text = re.sub(r'<!--.*?-->', '', text, flags=re.DOTALL)
    
    # 2. Structural replacements
    text = re.sub(r'<sample-output>\s*(.*?)\s*</sample-output>', r'**Sample Output**\n```text\n\1\n```', text, flags=re.DOTALL)
    
    text = re.sub(r'<text-box variant=[\'"](.*?)[\'"] name=[\'"](.*?)[\'"]>\s*(.*?)\s*</text-box>', replace_textbox, text, flags=re.DOTALL)
    text = re.sub(r'<programming-exercise name=[\'"](.*?)[\'"] tmcname=[\'"](.*?)[\'"]>\s*(.*?)\s*</programming-exercise>', replace_exercise, text, flags=re.DOTALL)
    text = re.sub(r'<youtube id=[\'"](.*?)[\'"]></youtube>', r'[Watch on YouTube](https://www.youtube.com/watch?v=\1)', text)
    
    # 3. Phrasing / Typos / TMC removals
    text = text.replace("TMC server", "the next task")
    text = text.replace("TMC Henrik", "The automated tests")
    text = text.replace("TMC-Henrik", "The automated tests")
    text = re.sub(r'\bNetBeans\b', 'your IDE (like IntelliJ or VS Code)', text)
    text = text.replace("Java-interpreter", "Java interpreter")
    text = text.replace("string[] args", "String[] args")
    text = text.replace("TMC-menu", "top menu")
    text = text.replace("TMC menu", "top menu")
    text = text.replace("in TMC by", "in your IDE by")
    text = text.replace("return the exercise to the TMC", "move on to the next task")
    text = text.replace("palauta tehtävä TMC:lle", "move on to the next task")
    
    # 4. Cleanup extra blank lines
    text = re.sub(r'\n{3,}', '\n\n', text)
    
    with open(filepath, 'w', encoding='utf-8') as f:
        f.write(text)

print(f"Processed {len(md_files)} markdown files.")
