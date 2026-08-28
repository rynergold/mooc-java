import re

text = '<programming-exercise name="Abbreviations" tmcname="part08-Part08_01.Abbreviations">\ncontent\n</programming-exercise>'

# My old regex:
m = re.search(r'<programming-exercise name=[\'"](.*?)[\'"] tmcname=[\'"](.*?)[\'"]>\s*(.*?)\s*</programming-exercise>', text, flags=re.DOTALL)
print(m is not None)
