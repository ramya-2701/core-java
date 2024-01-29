package arrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import arrayList.StudentList;
import java.util.ArrayList;

public class StudentListTest {
    @Test
    public void testRemoveGPA() {
        ArrayList<StudentList> studentList = new ArrayList<>();
        studentList.add(new StudentList("John", "Doe", 3.5));
        studentList.add(new StudentList("Jane", "Smith", 2.8));
        studentList.add(new StudentList("Alice", "Johnson", 3.2));
        studentList.add(new StudentList("Bob", "Williams", 2.9));
        ArrayList<StudentList> result = StudentList.removeGPA(studentList);
        for (StudentList student : result) {
            assertTrue(student.gpa >= 3.1);
        }
    }
    @Test
    public void testRemoveGPAEmptyList() {
        ArrayList<StudentList> emptyList = new ArrayList<>();
        ArrayList<StudentList> result = StudentList.removeGPA(emptyList);
        assertTrue(result.isEmpty());
    }
}

