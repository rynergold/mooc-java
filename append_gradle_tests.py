import os
import glob

base_dir = '/Users/ryner/Documents/Library/Programming/Java/Courses/MOOC/src/main/java'

count = 0

# Walk through all directories in base_dir
for root, dirs, files in os.walk(base_dir):
    for file in files:
        if file.endswith('.md'):
            base_name = file[:-3] # remove .md
            java_file = base_name + '.java'
            
            # If there's a corresponding .java file, it's an exercise
            if java_file in files:
                md_path = os.path.join(root, file)
                
                # Determine package name from path
                # e.g. root = .../src/main/java/part01/s02printing
                rel_path = os.path.relpath(root, base_dir)
                package_name = rel_path.replace(os.sep, '.')
                
                test_class = f"{package_name}.{base_name}Test"
                
                # Append the terminal instructions
                append_text = f"\n\n## Terminal Practice\n\nTo build terminal fluency, run this specific test directly from your command line:\n```bash\n./gradlew test --tests \"{test_class}\"\n```\n"
                
                with open(md_path, 'r') as f:
                    content = f.read()
                    
                # Avoid appending multiple times if run twice
                if "## Terminal Practice" not in content:
                    with open(md_path, 'a') as f:
                        f.write(append_text)
                    count += 1

print(f"Updated {count} exercise markdown files.")
