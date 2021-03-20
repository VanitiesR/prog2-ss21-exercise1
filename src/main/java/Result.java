import java.util.*;

public class Result {


    public static List<Integer> gradingStudents(List<Integer> grades) {
        //TODO
        System.out.println("Studentenanzahl: " + grades.size());
        System.out.print("Before rounding\n");
        for(int i = 0; i <= grades.size()-1; i++){
            System.out.print(grades.get(i) + " ");
        }
        System.out.print("\nAfter rounding\n");
        for(int i = 0; i <= grades.size()-1; i++){
            if(grades.get(i) >= 38) {
                if (grades.get(i) % 5 >= 3) {
                    grades.set(i, (grades.get(i) + 5) - (grades.get(i) % 5));
                }
            }
            System.out.print(grades.get(i) + " ");
        }
        System.out.print("\n\n");
        return grades;
    }
}
