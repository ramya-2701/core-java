package hashMap;
import java.util.HashMap;

public class StudentInfo {
    String firstName;
    String lastName;
    double gpa;

    public StudentInfo(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }
    public static StudentInfo getStudentByName(HashMap<String, StudentInfo> studentMap, String firstName) {
        return studentMap.get(firstName);
    }
}
