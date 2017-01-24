# Activity 3: Instructor's Guide

This activity focuses on primitive types, literals, and assignment statements.
By the end of the activity students will be able to identify the types of
literals, identify illegal assignment statements, and trace a sequence of
assignment statements and their effects in memory.

**Content Learning Objectives**  
*After completing this activity, students should be able to:*

* Identify the type of a literal.
* Identify illegal assignment statement and explain why they are illegal.
* Explain that reference variables do not store an object, but a reference to
  an object.
* Trace the execution of a sequence of assignment statements and determine the
  values of variables after execution.

**Process Skill Goals**
*During the activity, students should make progress toward:*

* Discuss benefits of working as a learning team. (Teamwork)

**Acknowledgements**  
TODO


## Facilitation Notes

* Question 5: If students are stumbling on the letters used in
  primitive literals (e.g., L and F), you might direct them back to Model 1 and
  have them read out loud the primitive types. They'll usually make the
  connection.
* Question 7 is good for report-out, allowing students to collectively develop a
  rule for when an assignment is allowed. It might be helpful to have a couple
  of assignment statements handy to challenge their definition if it is a little
  off. But be careful, examples like `short x = 3; byte y = 3; char c = 3;`,
  which are legal, may challenge their definition, but open a can of worms.
  If they come up you'll need to explain that javac will check the range of the
  value, and if it is acceptable it allows the assignment; that means
  `byte z = 255;` will fail.  
