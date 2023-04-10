package grades;

import java.util.ArrayList;

public class Student {

    private String name;

    private ArrayList<Integer> grades;

    public Student(String name, int grade) {
        this.name = name;
        this.grades = new ArrayList<>();
        grades.add(grade);
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double gradeAverage() {
        double finalGrade = 0;

        for (Integer grade : grades) {
            finalGrade += grade;
        }
        return finalGrade / grades.size();
    }

}