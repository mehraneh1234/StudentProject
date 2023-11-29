package studentproject.java;

/**
 *Mehraneh - 30062786 - 03/04/2023
 * AT2 - Activity 5 - Task B 
 */
//Create a class which is inherited from super class (student) 
public class InternationalStudent extends Student{
    // Define variables
    String countryName;
    int visaPeriodInYears;
    
    // Define the constructor of the class
    public InternationalStudent(){
        // Declare variable and assign a value to it
        visaPeriodInYears = 1;
        // Call method
        runConstructors();
       
    }
    // Define the overloaded constructor with a parameter as input
    public InternationalStudent(int visaPeriod){
        // Assign a value to the variable
        visaPeriodInYears = visaPeriod;
        // Call method
        runConstructors();
       
    }// Define a private method
    private void runConstructors() {
        // Create an object
        Student is = new Student(); 
        // Declare a variable by assigning a value
        is.studentId = 234;
        // Declare a private variable by assigning a value
        is.setStudentName("REW");
        
        // Assign a value to the variable
        countryName = "Iran";
       
    }
}


