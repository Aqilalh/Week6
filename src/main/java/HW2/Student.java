package HW2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    Double[] testScores;
    ArrayList<Double> examScores = new ArrayList<>();
    public Student(String firstName, String lastName, Double[] testScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.testScores = testScores;


    }

    public Double[] getTestScores() {
        return testScores;
    }

    public void setTestScores(Double[] testScores) {
        this.testScores = testScores;
    }

    public String getExamScores() {
        String scores = "";
        for(int i = 0; i < examScores.size();i++){
            scores += "Exam Scores: " + '\n' + "Exam " + (i + 1) + "->" + examScores.get(i);
        }
        return scores;
    }

    public void setExamScores(ArrayList<Double> examScores) {
        this.examScores = examScores;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
public int getNumberOfExamsTaken(){
        return examScores.size();
}
public void addExamScore (double examScore){
        this.examScores.add(examScore);
}
public void setExamScore(int examNumber,double newScore){
        this.examScores.add(newScore);
}



}
