public class Person {
    private String name;
    public static void main(String[] args) {

        Person person1 = new Person("John");
        Person person2 = new Person("Jane");
        person1.setName("John");
        person2.setName("Jane");
        person1.sayHello();
        person2.sayHello();

    }

    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
    public void sayHello(){
        System.out.printf("Hello, %s\n", this.name);
    }

}