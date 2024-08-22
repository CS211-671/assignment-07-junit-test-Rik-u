package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student s1;

    @BeforeEach
    void init(){
        s1 = new Student("6610406006", "Riku", 0);
    }

    @Test
    @DisplayName("Change name from Riku to Ruki")
    void testChangeName(){
        s1.changeName("Ruki");
        assertEquals("Ruki", s1.getName());
    }

    @Test
    @DisplayName("Add 40 and 30 score")
    void testAddScore(){
        s1.addScore(40);
        assertEquals(40, s1.getScore());
        s1.addScore(30);
        assertEquals(70, s1.getScore());
    }

    @Test
    @DisplayName("Show grade with 10 score")
    void testCalculateGrade(){
        s1.addScore(10);
        assertEquals("F", s1.grade());
    }

    @Test
    @DisplayName("Check Id")
    void testIsId(){
        s1.isId("6610406006");
        assertTrue(s1.isId("6610406006"));
    }
}