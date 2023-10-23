package ie.atu;

public class Person {
    String firstName;
    String lastName;
    int age;

    public Person(){
        this.firstName = "Tamer";
        this.lastName = "Zraiq";
        this.age = 18;
    }
    
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void displayInfo(){
        System.out.println("Name: " + firstName + " " + lastName + " Age: "+ age);
    }
}
