package gr.aueb.cf.schoolapp.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeacherTest {

    @Test
    void gettersSetters() {
        Teacher teacher = new Teacher();
        teacher.setId(1);
        teacher.setFirstname("Thanasis");
        teacher.setLastname("Androutsos");

        assertEquals(1, teacher.getId());
        assertEquals( "Thanasis", teacher.getFirstname());
        assertEquals("Androutsos", teacher.getLastname());
    }

    @Test
    void overloadedConstructorAndToString() {
        Teacher teacher = new Teacher(2, "Anna", "Kefala");
        assertEquals(2, teacher.getId());
        assertEquals("Anna", teacher.getFirstname());
        assertEquals("Kefala", teacher.getLastname());

        String excepted = "2, Anna, Kefala";
        assertEquals(excepted, teacher.toString());
    }
}