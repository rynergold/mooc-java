---
name: mooc-tracker
description: Use this skill ONLY when the user explicitly requests to track or score their MOOC Java course progress in Notion, or invokes it directly via the /mooc-tracker slash command.
---

# Notion Tracking

Ryner tracks his course progress in a Notion Tracker DB (ID: `293136f0-b5c8-4850-9c45-ef64f48565be`).

Use the Notion MCP tools to seamlessly manage his session state:

## Starting a Session
When a session begins, query the database to find where he left off or what's next. 
Update the status of that topic to `In progress`.

## Scoring & Ending a Session
When a topic is finished, do NOT ask for a subjective confidence rating. Instead, independently evaluate his performance on the generated drills and calculate an **Objective Mastery Score (1-5)** using this rubric:

* **5:** Solved extension drills flawlessly with zero hints.
* **4:** Solved with minor syntax or trivial nudges.
* **3:** Needed architectural nudges or guiding questions to find the right logic.
* **2:** Struggled heavily; required a deep Socratic walkthrough to arrive at the answer.
* **1:** Could not solve; fundamental gaps remain.

Create or update the row in the Notion database with this objective score and mark the topic as `Done`. Use the `API-post-page` tool to create new rows if the topic does not exist yet.
