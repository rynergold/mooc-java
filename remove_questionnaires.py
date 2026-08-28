import glob
import re

base_dir = '/Users/ryner/Documents/Library/Programming/Java/Courses/MOOC/src/main/java'
md_files = glob.glob(f'{base_dir}/**/*.md', recursive=True)

for filepath in md_files:
    with open(filepath, 'r', encoding='utf-8') as f:
        text = f.read()
    
    original_text = text
    
    # Remove blockquotes about questionnaires
    # This matches a blockquote block (lines starting with >) that contains "questionnaire"
    # and removes the entire blockquote.
    blocks = text.split('\n\n')
    new_blocks = []
    for block in blocks:
        if block.startswith('> [!NOTE]\n> **') and 'questionnaire' in block.lower():
            continue
        if block.startswith('>') and 'questionnaire' in block.lower():
            continue
        if 'answer the questionnaire' in block.lower():
            continue
        if '<google-form-link' in block:
            continue
        
        new_blocks.append(block)
    
    text = '\n\n'.join(new_blocks)
    
    if text != original_text:
        with open(filepath, 'w', encoding='utf-8') as f:
            f.write(text)
            print(f"Cleaned questionnaires from {filepath}")

