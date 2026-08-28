import glob
import re

base_dir = '/Users/ryner/Documents/Library/Programming/Java/Courses/MOOC/src/main/java'
md_files = glob.glob(f'{base_dir}/**/*.md', recursive=True)

for filepath in md_files:
    with open(filepath, 'r', encoding='utf-8') as f:
        text = f.read()
    
    original_text = text
    
    blocks = text.split('\n\n')
    new_blocks = []
    for block in blocks:
        # If the block is a note/hint and contains questionnaire/google-form
        if (block.startswith('>') or block.startswith('> [!NOTE]')) and ('questionnaire' in block.lower() or 'google-form' in block.lower()):
            continue
        
        # If the block itself is just asking to answer a questionnaire
        if 'questionnaire' in block.lower() and ('answer' in block.lower() or 'respond' in block.lower()):
            continue
            
        if '<google-form-link' in block:
            continue
        
        new_blocks.append(block)
    
    text = '\n\n'.join(new_blocks)
    
    if text != original_text:
        with open(filepath, 'w', encoding='utf-8') as f:
            f.write(text)
            print(f"Cleaned more questionnaires from {filepath}")

