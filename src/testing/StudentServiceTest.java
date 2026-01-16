package testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StudentServiceTest {

    @Test
    void gradeATest() {

        // ARRANGE
        StudentService service = new StudentService();
        int marks = 95;

        // ACT
        String grade = service.getGrade(marks);

        // ASSERT
        assertEquals("A", grade);
        assertNotNull(grade);
    }

    @Test
    void gradeFailTest() {

        // ARRANGE
        StudentService service = new StudentService();
        int marks = 40;

        // ACT
        String grade = service.getGrade(marks);

        // ASSERT
        assertEquals("F", grade);
        assertTrue(grade.equals("F"));
    }

    @Test
    void invalidMarksExceptionTest() {

        // ARRANGE
        StudentService service = new StudentService();

        // ACT & ASSERT
        Exception ex = assertThrows(
                IllegalArgumentException.class,
                () -> service.getGrade(120)
        );

        assertEquals("Invalid marks", ex.getMessage());
    }
}
