import java.util.*;

public class Result {

    public static List<Integer> getGrades() {
        return grades;
    }
    public static void setGrades(List<Integer> grades) {
        Result.grades = grades;
    }
    public static List<Integer> grades = new ArrayList<>(60);

    public static List<Integer> gradingStudents(List<Integer> grades) throws Exception {

        if (grades.size() > 60 || grades.size() == 0) {
            throw new Exception();
        }
        for (int i = 0; i <= grades.size() - 1; i++) {
            if (grades.get(i) > 100) {
                System.out.println("Jemand hat zu viele Punkte!");
            }
        }

        //print the amount of grades/students
        System.out.println("Studentenanzahl (max. 60): " + grades.size());
        System.out.print("Before rounding\n");

        //print the grades before rounding
        for (int i = 0; i <= grades.size() - 1; i++) {
            System.out.print(grades.get(i) + " ");
        }

        //where the rounding/sorting takes place
        System.out.print("\nAfter rounding\n");
        for (int i = 0; i <= grades.size() - 1; i++) {
            if (grades.get(i) >= 38) { //only round grades greater than or equal to 38
                if (grades.get(i) % 5 >= 3) {
                    grades.set(i, (grades.get(i) + 5) - (grades.get(i) % 5));
                }

            }
            System.out.print(grades.get(i) + " ");
        }

        //check and print if more or less than 30 grades have been calculated
        if(grades.size() > 60){
            System.out.println("\nEs wurde/n "+ (grades.size()-60) +" Arbeit/en zu viel abgegeben. Hier ist was faul!\n");
        }else if (grades.size() < 60){
            System.out.println("\nEs wurde/n "+ (-grades.size()+60) +" Arbeit/en zu wenig abgegeben. Fehlt jemand?\n");
        }

        System.out.print("\n\n");
        return grades;
    }



    //Random grade generation for Testing | 60 grades, each between 0 and 100
    public static List<Integer> gradeGeneratorSixty() {
        List<Integer> random = new ArrayList<>();
        Random rand = new Random();
        int size  = 60;
        for (int i = 1; i <= size; i++) {
            int temp = rand.nextInt(100);
            random.add(temp);
        }
        return random;
    }
    //Random grade generation for Testing | n grades, each between 0 and 100
    public static List<Integer> gradeGeneratorSized(int size) {
        List<Integer> random = new ArrayList<>();
        Random rand = new Random();
        for (int i = 1; i <= size; i++) {
            int temp = rand.nextInt(100);
            random.add(temp);
        }
        return random;
    }


}
