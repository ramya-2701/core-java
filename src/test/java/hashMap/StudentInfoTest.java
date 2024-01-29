package hashMap;
import java.util.HashMap;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class StudentInfoTest {

    @Test
    public void testGetStudentByName() {
        HashMap<String, StudentInfo> studentMap = new HashMap<>();
        StudentInfo student1 = new StudentInfo("John", "Doe", 3.8);
        StudentInfo student2 = new StudentInfo("Jane", "Smith", 3.9);
        StudentInfo student3 = new StudentInfo("Bob", "Johnson", 3.5);
        StudentInfo student4 = new StudentInfo("Alice", "Williams", 4.0);
        StudentInfo student5 = new StudentInfo("Charlie", "Brown", 3.7);
        StudentInfo student6 = new StudentInfo("Eva", "Davis", 3.6);
        StudentInfo student7 = new StudentInfo("David", "Lee", 3.2);
        StudentInfo student8 = new StudentInfo("Sophie", "Taylor", 3.9);
        studentMap.put(student1.firstName, student1);
        studentMap.put(student2.firstName, student2);
        studentMap.put(student3.firstName, student3);
        studentMap.put(student4.firstName, student4);
        studentMap.put(student5.firstName, student5);
        studentMap.put(student6.firstName, student6);
        studentMap.put(student7.firstName, student7);
        studentMap.put(student8.firstName, student8);
        Assertions.assertEquals(student1, StudentInfo.getStudentByName(studentMap, "John"));
        Assertions.assertNotSame(student4, StudentInfo.getStudentByName(studentMap, "John"));
        Assertions.assertNull(StudentInfo.getStudentByName(studentMap, "Nonexistent"));
    }
}
