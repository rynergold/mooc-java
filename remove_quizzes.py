import glob
import re

base_dir = '/Users/ryner/Documents/Library/Programming/Java/Courses/MOOC/src/main/java'
md_files = glob.glob(f'{base_dir}/**/*.md', recursive=True)

for filepath in md_files:
    with open(filepath, 'r', encoding='utf-8') as f:
        text = f.read()
    
    original_text = text
    
    # Remove quiz and questionnaire tags
    text = re.sub(r'<quiz.*?>.*?</quiz>', '', text, flags=re.DOTALL)
    text = re.sub(r'<questionnaire.*?>.*?</questionnaire>', '', text, flags=re.DOTALL)
    
    # Remove obvious sentences pointing to the quiz
    text = re.sub(r'Finish by answering to the quiz below\.', '', text)
    text = re.sub(r'Please answer the questionnaire below\.', '', text)
    text = re.sub(r'> The quiz below uses.*?end of the output\.', '', text)
    
    # Cleanup extra blank lines
    text = re.sub(r'\n{3,}', '\n\n', text)
    
    if text != original_text:
        with open(filepath, 'w', encoding='utf-8') as f:
            f.write(text)

print("Removed all quizzes and questionnaires.")
