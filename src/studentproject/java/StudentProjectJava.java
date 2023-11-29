package studentproject.java;

public class StudentProjectJava {

    /**
     * Mehraneh - 30062786 - 03/04/2023
     * AT2 - Activity 5 - Task B 
     */
    public static void main(String[] args) {
        // Define a pointer as a student
        Student st1;
        // Create an object of the student class
        st1 = new Student();
        // Declare studentID
        st1.studentId = 444;
        // Display student ID, student name 
        System.out.println("Student ID: " + st1.studentId);
        st1.setStudentName("Roz");
        System.out.println("Student Name: " + st1.getStudentName());
        
        // Create an object of online student class
        st1 = new OnlineStudent();
        // Create an object of the onlineTool class
        OnlineTool onTool = new OnlineTool();
        // Display online tool
        System.out.println("Online tool: " + 
                ((OnlineStudent)st1).OnlineTool(onTool));
        // Display study period time
        System.out.println("Study time: " + 
                ((OnlineStudent)st1).studyPeriodInYears);
        
        // Create an object of the international student class
        st1 = new InternationalStudent();
        // Display country name
        System.out.println("Country name: " + 
                ((InternationalStudent)st1).countryName);
        // Create an object of the international student class with argument
        st1 = new InternationalStudent(12);
        // Display Visa period time
        System.out.println("Visa takes time: " +
                ((InternationalStudent)st1).visaPeriodInYears);
        
        
    }

}
