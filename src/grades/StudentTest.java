package grades;

public class StudentTest {


    public static void main(String[] args) {

        Student studentOne = new Student("Anthony", 89);
        Student studentTwo = new Student("Ahna", 91);
        Student studentThree = new Student("Lily", 99);

        studentOne.addGrade(95);
        studentTwo.addGrade(99);
        studentThree.addGrade(90);

        System.out.printf("Name: %s | Grades: %s | Average: %.1f\n", studentOne.getName(), studentOne.getGrades(), studentOne.gradeAverage());

        System.out.printf("Name: %s | Grades: %s | AVG: %.1f\n", studentTwo.getName(), studentTwo.getGrades(), studentTwo.gradeAverage());

        System.out.printf("Name: %s | Grades: %s | AVG: %.1f\n", studentThree.getName(), studentThree.getGrades(), studentThree.gradeAverage());

    }
}
