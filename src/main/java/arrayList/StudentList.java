package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentList {
    String firstName;
    String lastName;
    public double gpa;
    public StudentList(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }
    public static ArrayList<StudentList> removeGPA(ArrayList<StudentList> studentList) {
        double total = 0;
        for (StudentList student : studentList) {
            total += student.gpa;
        }
        double averageGPA = total / studentList.size();
        Iterator<StudentList> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            StudentList student = iterator.next();
            if (student.gpa < averageGPA) {
                iterator.remove();
            }
        }
        System.out.println(studentList);
        return studentList;
    }
}
