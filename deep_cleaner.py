import glob
import re

base_dir = '/Users/ryner/Documents/Library/Programming/Java/Courses/MOOC/src/main/java'
md_files = glob.glob(f'{base_dir}/**/*.md', recursive=True)

def replace_exercise(match):
    tag_content = match.group(1)
    content = match.group(2)
    # extract name
    name_match = re.search(r'name=[\'"](.*?)[\'"]', tag_content)
    name = name_match.group(1) if name_match else "Exercise"
    return f"### Programming Exercise: {name}\n\n{content}"

def replace_textbox(match):
    tag_content = match.group(1)
    content = match.group(2)
    name_match = re.search(r'name=[\'"](.*?)[\'"]', tag_content)
    name = name_match.group(1) if name_match else "Note"
    lines = content.split('\n')
    quoted_content = '\n'.join('> ' + line for line in lines)
    return f"> [!NOTE]\n> **{name}**\n>\n{quoted_content}"

def replace_youtube(match):
    tag_content = match.group(1)
    id_match = re.search(r'id=[\'"](.*?)[\'"]', tag_content)
    video_id = id_match.group(1) if id_match else ""
    return f"[Watch on YouTube](https://www.youtube.com/watch?v={video_id})"

count = 0
for filepath in md_files:
    with open(filepath, 'r', encoding='utf-8') as f:
        text = f.read()
    
    original_text = text
    
    # PDF slideshows (remove entirely)
    text = re.sub(r'<pdf-slideshow>.*?</pdf-slideshow>', '', text, flags=re.DOTALL)
    
    # Code states visualizer (remove entirely)
    text = re.sub(r'<code-states-visualizer.*?>.*?</code-states-visualizer>', '', text, flags=re.DOTALL)
    
    # Programming exercises
    text = re.sub(r'<programming-exercise([^>]*)>\s*(.*?)\s*</programming-exercise>', replace_exercise, text, flags=re.DOTALL)
    
    # Text boxes
    text = re.sub(r'<text-box([^>]*)>\s*(.*?)\s*</text-box>', replace_textbox, text, flags=re.DOTALL)
    
    # Youtube
    text = re.sub(r'<youtube([^>]*)>.*?</youtube>', replace_youtube, text, flags=re.DOTALL)
    # Some youtube tags might not be closed properly like <youtube id='d-56AxspStE'><youtube>
    text = re.sub(r'<youtube([^>]*)>', replace_youtube, text)
    
    # Remove empty youtube markdown links just in case
    text = text.replace('[Watch on YouTube](https://www.youtube.com/watch?v=)', '')
    text = text.replace('[Watch on YouTube](https://www.youtube.com/watch?v=)[Watch on YouTube](https://www.youtube.com/watch?v=)', '')
    
    if text != original_text:
        with open(filepath, 'w', encoding='utf-8') as f:
            f.write(text)
        count += 1

print(f"Deep clean finished. Modified {count} files.")
