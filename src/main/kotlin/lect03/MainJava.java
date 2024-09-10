package oop_02;

public class MainJava {

    public static void main(String[] args) {
        Person p1 = new Person("Andrii", "Krenevych", 18);
        Person p2 = new Person("Andrii", "Krenevych", 18);

        System.out.printf("Ref eq : %s\n", (p1 == p2)); // == - оператор порівння посилань для не примітивних типів
        System.out.printf("Equals : %s\n", p1.equals(p2)); // equals - оператор порівння вмісту
    }

}
