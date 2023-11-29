# StudentProject
Create a Student class as a super class which contains:
 Student’s name as string
 Student’s id as int
o Create a subclass from the Student class named InternationalStudent which contains:
 Student’s name (inherited)
 Student’s id (inherited)
 Country name as string
 Visa period in years as int
o Create a class named OnlineTool which contains: 
 The name of the tool as string
o Create another subclass from the Student class named OnlineStudent which contains:
 Student’s name (inherited)
 Student’s id (inherited)
 Name of online-tool as OnlineTool (defined above)
 Study period in years as int
o Include appropriate methods in each class
 No detailed statements in the methods are required for this task
o The InternationStudent class will have a default constructor and an overloaded constructor 
which receives the visa period
 Create an internal(private) method that performs the construction of student’s name, 
student’s id and country name for both constructors.
o Create a main class that demonstrates polymorphism.
 Declare Student objects and show how Student objects can be either OnlineStudent
or InternationStudent. 
 Demonstrate how to make a Student object behave as an InternationalStudent and 
how to make the same Student object behave as an OnlineStudent.
