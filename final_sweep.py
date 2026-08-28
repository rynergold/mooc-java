import glob
import re

base_dir = '/Users/ryner/Documents/Library/Programming/Java/Courses/MOOC/src/main/java'
md_files = glob.glob(f'{base_dir}/**/*.md', recursive=True)

modified = 0
for filepath in md_files:
    with open(filepath, 'r', encoding='utf-8') as f:
        text = f.read()
    
    original_text = text
    
    # Remove A/B study tags
    text = re.sub(r'<ab-study.*?>', '', text)
    text = re.sub(r'</ab-study>', '', text)
    text = re.sub(r'<only-for-ab-group.*?>', '', text)
    text = re.sub(r'</only-for-ab-group>', '', text)
    
    # Convert sample-data
    text = re.sub(r'<sample-data>\s*(.*?)\s*</sample-data>', r'**Sample Data**\n```text\n\1\n```', text, flags=re.DOTALL)
    
    # Sometimes it has a > prefix if it was inside a text box
    text = re.sub(r'> <sample-data>\n> (.*?)\n> \n> (.*?)\n> \n> (.*?)\n> \n> (.*?)\n> \n> (.*?)\n> \n> (.*?)\n> \n> (.*?)\n> \n> (.*?)\n> \n> (.*?)\n> \n> (.*?)\n> \n> (.*?)\n> \n> </sample-data>', 'Wait I should just do a generic replace', text)
    text = re.sub(r'>\s*<sample-data>(.*?)</sample-data>', r'**Sample Data**\n```text\n\1\n```', text, flags=re.DOTALL)

    if text != original_text:
        with open(filepath, 'w', encoding='utf-8') as f:
            f.write(text)
        modified += 1

print(f"Final sweep done. Modified {modified} files.")
