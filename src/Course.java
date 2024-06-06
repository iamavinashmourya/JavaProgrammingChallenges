/*
Design a Course class
Instance variable: courseName, enrolledStudents.
Static variable: maxCapacity, the maximum number of students for any course.
Instance methods: enrollStudent(String studentName), unenrollStudent(String studentName).
Static method: setMaxCapacity(int capacity), to set the maximum capacity of courses.
 */

public class Course {
    static int maxCapacity=100;
    String courseName;
    int enrollments;
    String[] enrolledStudents;

    Course(String courseName){
        this.courseName=courseName;
        this.enrollments=0;
        this.enrolledStudents= new String[maxCapacity];
    }

    static void setMaxCapacity(int maxCapacity){
        Course.maxCapacity = maxCapacity;
    }

    void enrollStudent(String studentName){
        enrolledStudents[enrollments]=studentName;
        enrollments++;
    }

    void unenrollStudents(String studentName){
        System.out.println("Student Removed");
        enrollments--;
    }


}
