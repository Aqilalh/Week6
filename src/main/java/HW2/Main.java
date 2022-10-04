package HW2;

public class Main {
    public static void main(String[] args) {
        Double[] examsScores = {100.0,99.34,55.55,86.5};
        Student student = new Student("Aqil","ALhaidari",examsScores);

        System.out.println(student.getExamScores());
    }
}
