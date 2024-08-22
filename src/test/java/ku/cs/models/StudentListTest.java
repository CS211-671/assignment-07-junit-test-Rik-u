package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    StudentList list;

    @BeforeEach
    void setUp() {
        list = new StudentList();
    }

    @Test
    void testAddNewStudent() {
        list.addNewStudent("6610406006", "Riku");
        assertEquals(list.getStudents().size(), 1);
        list.addNewStudent("6610406007", "Ruki", 10);
        assertEquals(list.getStudents().size(), 2);
    }

    @Test
    void testFindStudentById() {
        list.addNewStudent("6610406006", "Riku");
        Student s1 = list.findStudentById("6610406006");
        assertEquals("6610406006", s1.getId());
    }

    @Test
    void testGiveScoreToId() {
        list.addNewStudent("6610406006", "Riku");
        list.giveScoreToId("6610406006", 20);
        assertEquals(20, list.findStudentById("6610406006").getScore());
    }

    @Test
    void testViewGradeOfId() {
        list.addNewStudent("6610406006", "Riku");
        list.giveScoreToId("6610406006", 70);
        assertEquals("B", list.findStudentById("6610406006").grade());
    }
}