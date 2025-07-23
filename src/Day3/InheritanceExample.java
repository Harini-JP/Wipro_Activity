package Day3;

class Person {
    String name;
    int age;

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Studen1 extends Person {
    String course;

    public void displayStudentDetails() {
        displayDetails();
        System.out.println("Course: " + course);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
    	Studen1 s = new Studen1();
        s.name= "Harini";
        s.age = 21;
        s.course = "B.E Computer Science";

        s.displayStudentDetails();
    }
}
