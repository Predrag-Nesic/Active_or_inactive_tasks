# Active_or_inactive_tasks
So, this is the actual assignment that i had to solve in order to pass the beginners exam.
It is a group of employees spread across the active or inactive tasks that are a part of an imaginary project.
Feel free to mess with the code in order to see how many there are employees that are hard working and those who are on a well deserved break.
Hope you like it...

This is the translation of the assignment:

Write a task management application in the java programming language.
There is an Employee in the team package. The employee has a name, surname and email.
• Printed in the format:
Last name first name - email
• They can be sorted by last name, and then by first name (those who have
same last name)
There is a Task in the project package. The task has a name, description and status (active /
ready), task creation time and list of employees.
• Records the time the task was created when it was created.
• Employees are added individually to the list.
• The task can be closed.
• Tasks can be sorted by creation time - descending.
It is printed in the format:
Task Name ({day}. {Month}. {Year}) - Status (ACTIVE / DONE)
- Employees 1
- Employees 2
..
- Employees n
(Employees sort before printing)
There is a Group in the project package. The group has a name and a list of tasks. Groups can
add a task.
• Tasks are added individually to the list.
• The total number of employees on active tasks in the group can be returned.
• The total number of active tasks can be restored.
• A sorted list of employees who are not on an active task can be returned.
It is printed in the format:
Group - Name ({m} of employees on {n} tasks)
- Task 1
- Task 2
..
- Task n
(Sort jobs before printing)
There is a Project in the project package. The project has a name, project code and a list of groups.
A group can be added to the project.
• Groups are added to the list individually.
It is printed in the format:
Project - Name
- Group 1
- Group 2
..
- Group n
Write a main program that examines the functionalities of these classes.
