import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
    int rollNo;
    int age;
    String name;

    // Constructor: ensures all fields are initialized
    public Student(int rollNo, int age, String name) {
        this.rollNo = rollNo;
        this.age = age;
        this.name = name;
    }

    // toString: formats how each Student is printed
    @Override
    public String toString() {
        return rollNo + " " + age + " " + name;
    }

    // compareTo: sorts by roll number in ascending order
    @Override
    public int compareTo(Student s) {
        return this.rollNo - s.rollNo;
    }

    // main method for testing
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        // Creating Student objects
        list.add(new Student(103, 22, "Alice"));
        list.add(new Student(101, 19, "Bob"));
        list.add(new Student(102, 21, "Charlie"));

        // Sorting the list using compareTo()
        Collections.sort(list);

        // Printing sorted students
        for (Student s : list) {
            System.out.println(s);
        }
    }
}
