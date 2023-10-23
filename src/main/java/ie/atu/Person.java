package ie.atu;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Person {
    String firstName;
    String lastName;
    int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void getUserInput(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Name: ");
        this.firstName = scanner.nextLine();

        System.out.println("Enter Last Name: ");
        this.lastName = scanner.nextLine();

        System.out.println("Enter age: ");
        this.age = scanner.nextInt();

    }
    public void displayInfo(){
        System.out.println("Name: " + firstName + " " + lastName + " Age: "+ age);
    }
}
