# AI Usage

Briefly describe how you used AI (tools, prompts, code snippets, fixes). Be concise and honest (using AI is fine; it's just a tool; we want to know your method). If you did not use AI, state that here.

1. Could not get project setup running on intellij, needed help with run configurations. I used Claude with different prompts and copied any errors that appeared.

2. In third part, I used Claude on whether to use JPA naming convention to resolve finByLoanedTo() or write an explicit custom query.

Here are some thoughts, not related to AI but worth mentioning:
1. In the last task on the first section (Returns should only succeed when initiated by the 
current borrower.) I had to alter the front end. Front was sending no memberId in post("return"), 
I checked from browser -> inspect -> network, in request payload. Went to front code, 
changed app.component.ts line 90 & 93. Not sure if this was the assignment, but that seemed to be the 
easiest solution considering the task (and without more information on the functionality for return without memberId).

2. I can see that if a book is borrowed, the user can still reserve the same book (even tough it's 
already in their hand). I don't think it should be allowed, but I can't see it in the task description 
to be changed. 


