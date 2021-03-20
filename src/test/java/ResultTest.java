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
    void testgradingStudents(){
        List<Integer> grades = new ArrayList<>(Arrays.asList(14,44,43,42,41));
        List<Integer> expected = new ArrayList<>(Arrays.asList(14,45,45,42,41));
        assertTrue(Arrays.equals(expected.toArray(), Result.gradingStudents(grades).toArray()), "1 ore more Integers have been wrongly/or not rounded!");
    }

    @Test
    @DisplayName("Check if grades below 38 have not been rounded")
    void testgradingStudents1(){
        List<Integer> grades = new ArrayList<>(Arrays.asList(1,13,29,37,38,53,62,89));
        List<Integer> expected = new ArrayList<>(Arrays.asList(1,13,29,37,40,55,62,90));
        assertTrue(Arrays.equals(expected.toArray(), Result.gradingStudents(grades).toArray()), "An Integer <= 37 has been rounded!");
    }

    @Test
    @DisplayName("InputHere")
    void testgradingStudents3(){
        ArrayList<Float> grades = new ArrayList<>();
        //TODO
        // 1.5,13.7,29.00,37.54,38.99,53.10,62.9,89.2

    }
}