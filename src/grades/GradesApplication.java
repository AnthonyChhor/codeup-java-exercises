package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {

        HashMap<String, Object> students = new HashMap<>();

        Student studentOne = new Student("Anthony", 85);
        studentOne.addGrade(91);
        studentOne.addGrade(96);

        Student studentTwo = new Student("Ahna", 95);
        studentTwo.addGrade(90);
        studentTwo.addGrade(93);

        Student studentThree = new Student("Lily", 98);
        studentThree.addGrade(95);
        studentThree.addGrade(90);

        Student studentFour = new Student("Bella", 80);
        studentFour.addGrade(95);
        studentFour.addGrade(90);

        students.put("Achhor", studentOne);
        students.put("AhnaC", studentTwo);
        students.put("LilyC", studentThree);
        students.put("BellaDoge", studentFour);

        Input input = new Input();

        System.out.println("Greetings!\n");



                boolean myBool;
                do {
                    System.out.println("Here are the GitHub usernames of our students:\n");

                    for (String student : students.keySet()) {
                        System.out.printf("|%s| ", student);
                    }

                    System.out.println("\n\nWhat student would you like to see more information on?");

                    String userInput = input.getString();

                    if (!students.containsKey(userInput)) {
                        System.out.printf("Sorry, no student found with the GitHub username of '%s'.\n\n", userInput);
                    } else {
                        Student student = (Student) students.get(userInput);
                        System.out.printf("\tName: %s - GitHub Username: %s\n\tGrades: %s\n\tCurrent Average: %.1f\n\n", student.getName(), userInput, student.getGrades(), student.gradeAverage());
                    }

                    System.out.println("Would you like to see another student? [Y/N]");
                    myBool = input.yesNo();

                } while (myBool);


        System.out.println("\nGoodbye, and have a wonderful day!");
    }
}