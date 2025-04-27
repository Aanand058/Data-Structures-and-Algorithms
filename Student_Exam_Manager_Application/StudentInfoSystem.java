package Data_Structures_and_Algorithms.Student_Exam_Manager_Application;


import java.util.ArrayList;

public class StudentInfoSystem {
    private static ArrayList<Student> students = new ArrayList<>();


    static boolean addStudent(Student student) {
        // TODO 1: Implement a method to add a new student to the ArrayList
        if(student == null){
            System.out.println("Null Student Value");
            return false;
        }
        students.add(student);
        System.out.println("Student added: " + student.getName());
        return true;
    }

    static Student findStudentByName(String name) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        return null;
    }
}