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
    void testgradingStudents() throws Exception {
        List<Integer> grades = new ArrayList<>(Arrays.asList(14,44,43,42,41));
        List<Integer> expected = new ArrayList<>(Arrays.asList(14,45,45,42,41));
        assertTrue(Arrays.equals(expected.toArray(), Result.gradingStudents(grades).toArray()), "1 or more Integers have been wrongly/or not rounded!");
    }


    @Test
    @DisplayName("Check if grades below 38 have not been rounded")
    void testgradingStudents1() throws Exception {
        List<Integer> grades = new ArrayList<>(Arrays.asList(1,13,29,37,38,53,62,89));
        List<Integer> expected = new ArrayList<>(Arrays.asList(1,13,29,37,40,55,62,90));
        assertTrue(Arrays.equals(expected.toArray(), Result.gradingStudents(grades).toArray()), "An Integer <= 37 has been rounded!");
    }

    @Test
    @DisplayName("Check if 60+ grades have been provided")
    void testgradingStudents3(){
        try{
            Result.setGrades(Result.gradeGeneratorSized(65)); //passed 65 grades for exception
            Result.gradingStudents(Result.getGrades());
        }catch(Exception e){
            System.out.println("More than 60 or Zero grades have been provided!\n");
        }
        try{
            Result.setGrades(Result.gradeGeneratorSixty()); // passed 60 grades to see difference
            Result.gradingStudents(Result.getGrades());
        }catch(Exception e){
            System.out.println("More than 60 or Zero grades have been provided!\n");
        }

    }
}