package app;

public class Person {
    private String name;
    private int age;
    private Gender gender;

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void displayPerson() {
       System.out.println("Name: " + name + ", Age: " + age + ", Gender: " + gender);
    }
}
