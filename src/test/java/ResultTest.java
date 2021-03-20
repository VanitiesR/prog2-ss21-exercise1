import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class ResultTest {

    @BeforeAll
    static void init(){}
    @BeforeEach
    public void setUp(){}

    @Test
    @DisplayName("Check if the grades have been rounded properly")
    void testgradingStudents() {
        List<Integer> grades = new ArrayList<>(Arrays.asList(44, 43, 42, 41));
        List<Integer> expected = new ArrayList<>(Arrays.asList(45, 45, 42, 41));
        assertTrue(Arrays.equals(expected.toArray(), Result.gradingStudents(grades).toArray()), "ERROR!");
    }
}