# Activity 3: Instructor's Guide

This activity focuses on primitive types, literals, and assignment statements.
By the end of the activity, students will be able to identify the types of literals, identify illegal assignment statements, and trace a sequence of assignment statements and their effects in memory.

**Content Learning Objectives**  
*After completing this activity, students should be able to:*

* Identify the type of a literal.
* Identify illegal assignment statements, and explain why they are illegal.
* Explain that reference variables do not store an object, but a reference to an object.

**Process Skill Goals**  
*During the activity, students should make progress toward:*

* Trace the execution of a sequence of assignment statements and determine the values of variables after execution. (Information Processing)
* Discuss benefits of working as a learning team. (Teamwork)

**Acknowledgements**  
Question 6 is based on an example program by Stoney Jackson.


## Facilitation Notes

Question 5: If students are stumbling on the letters used in primitive literals (e.g., L and F), you might direct them back to Model 1 and have them read out loud the primitive types. Now is a good opportunity to introduce `float` as a (broken) floating-point data type and have students explain where the name `double` comes from.

Question 6 is good for report-out, allowing students to collectively develop a rule for when an assignment is allowed. It might be helpful to have a couple of assignment statements handy to challenge their definition if it is a little off. But be careful, examples like `short x = 3; byte y = 3; char c = 3;`, which are legal, may challenge their definition, but open a can of worms. If these issues come up, you'll need to explain that javac will check the range of the value, and if it is acceptable, allow the assignment; that means `byte z = 255;` will fail.

Model 2 introduces a standard technique for drawing diagrams of variables to show the difference between primitive and reference types. It may be helpful at this point to direct students to [Java Tutor](http://pythontutor.com/java.html) which draws similar diagrams (including stack frames). This tool also has options for "render all objects on the heap" (instead of inlining) and "use text labels for pointers" (instead of drawing arrows), which can help reinforce the concept of memory addresses.

Question 14: have 2-3 teams draw their diagrams on the board and address common misconceptions.
