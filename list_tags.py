import glob
import re

base_dir = '/Users/ryner/Documents/Library/Programming/Java/Courses/MOOC/src/main/java'
md_files = glob.glob(f'{base_dir}/**/*.md', recursive=True)

tags = set()
for filepath in md_files:
    with open(filepath, 'r', encoding='utf-8') as f:
        text = f.read()
    
    # find all <tagname ...> or <tagname>
    found = re.findall(r'<([a-zA-Z0-9\-]+)(?:\s+[^>]*?)?>', text)
    tags.update(found)

print("Found tags:", sorted(list(tags)))
