import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson(Person[] people, Person person) {
        people = Arrays.copyOf(people, people.length + 1);
        people[people.length - 1] = person;
        return people;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];
        people[0] = new Person("Anthony");
        people[1] = new Person("Ahna");
        people[2] = new Person("Lily");

        Person bella = new Person("Bella");
        people = addPerson(people, bella);

        for (Person  person : people) {
            System.out.println("Here is a person: " +person.getName());
        }

    }

}
