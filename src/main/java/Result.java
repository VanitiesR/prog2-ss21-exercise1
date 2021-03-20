import java.util.*;

public class Result {



    public static List<Integer> gradingStudents(List<Integer> grades) {

        System.out.println("Studentenanzahl (max. 30): " + grades.size());
        System.out.print("Before rounding\n");


        for (int i = 0; i <= grades.size() - 1; i++) {
            System.out.print(grades.get(i) + " ");
        }

        System.out.print("\nAfter rounding\n");
        for (int i = 0; i <= grades.size() - 1; i++) {
            if (grades.get(i) >= 38) {
                if (grades.get(i) % 5 >= 3) {
                    grades.set(i, (grades.get(i) + 5) - (grades.get(i) % 5));
                }
            }
            System.out.print(grades.get(i) + " ");
        }

        if(grades.size() > 30){
            System.out.println("\nEs wurde/n "+ (grades.size()-30) +" Arbeit/en zu viel abgegeben. Hier ist was faul!\n");
        }else if (grades.size() < 30){
            System.out.println("\nEs wurde/n "+ (-grades.size()+30) +" Arbeit/en zu wenig abgegeben. Fehlt jemand?\n");

        }

        System.out.print("\n\n");
        return grades;
    }


    //Random grade generation => n grades, each between 0 and 100
    public static List<Integer> gradeGenerator(int size) {
        List<Integer> random = new ArrayList<>();
        Random rand = new Random();
        for (int i = 1; i <= size; i++) {
            int temp = rand.nextInt(100);
            random.add(temp);
        }
        return random;
    }


}
