package studentproject.java;

/**
 *Mehraneh - 30062786 - 03/04/2023
 * AT2 - Activity 5 - Task B 
 */
public class OnlineStudent extends Student{
    // Define a variable
    int studyPeriodInYears = 2;
    // Create a method with two parameters
    public void student(String name, int id){
        // Create an object
        Student s = new Student();
        // Assign a value to the private variable
        s.setStudentName(name);
        // Assign a value to the variable
        s.studentId = id;
    } 
    // Create a method with a parameter
    public String OnlineTool(OnlineTool onTool){
        // Declare a varible and assign a value to it.
        String OnlineTool = onTool.toolName;
        // Return the output
        return(OnlineTool);
    }
    
}
