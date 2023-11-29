
package studentproject.java;

/**
 *Mehraneh - 30062786 - 03/04/2023
 * AT2 - Activity 5 - Task B 
 */
public class Student {
    // Declare variables 
    private String studentName;
    public int studentId;
    // Because of using private variable in the other classes, setter method 
    // Helps to assign value to the private varible
    public void setStudentName(String name){
        studentName = name;
    }
    // Getter method just returns the value of the private variable
    public String getStudentName(){
        return studentName;
    }
}
