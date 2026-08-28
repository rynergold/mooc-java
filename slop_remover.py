import glob
import re

base_dir = '/Users/ryner/Documents/Library/Programming/Java/Courses/MOOC/src/main/java'
md_files = glob.glob(f'{base_dir}/**/*.md', recursive=True)

patterns = [
    r"(?i)It is important to note that\s+",
    r"(?i)It's important to note that\s+",
    r"(?i)It is worth noting that\s+",
    r"(?i)The reality is that\s+",
    r"(?i)The truth is that\s+",
    r"(?i)As you can see,\s+",
    r"(?i)The key point is that\s+",
    r"(?i)In other words,\s+",
    r"(?i)At the end of the day,\s+",
    r"(?i)Here's the thing,\s+",
    r"(?i)Let me be clear,\s+",
    r"(?i)I'll be honest,\s+",
    r"(?i)Ultimately,\s+",
    r"(?i)Overall,\s+",
]

modified_count = 0

for filepath in md_files:
    with open(filepath, 'r', encoding='utf-8') as f:
        text = f.read()
    
    original_text = text
    
    for p in patterns:
        text = re.sub(p + r"([a-z])", lambda m: m.group(1).upper(), text)
        text = re.sub(p, "", text)
        
    text = re.sub(r"(?i)Let's dive in\.?\s*", "", text)
    
    if text != original_text:
        with open(filepath, 'w', encoding='utf-8') as f:
            f.write(text)
        modified_count += 1

print(f"Slop removed. Modified {modified_count} files.")
