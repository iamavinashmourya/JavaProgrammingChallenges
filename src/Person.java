/* Create a class Person with attributes for name and age. Include a constructor to
initialize these attributes and a method to display the person's details. */

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Person person = new Person("Alice", 30);
        person.displayDetails();
    }
}
