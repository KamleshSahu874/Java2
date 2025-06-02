import java.util.ArrayList;
import java.util.Collections;

class Student2 implements Comparable<Student> {
    int age;
    String name;

    public Student2(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public String toString() {
        return age + " " + name;
    }
    public int compareTo(Student s) {
        return this.age - s.age; // Ascending order
    }

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(22, "Akbar"));
        list.add(new Student(19, "Birbal"));
        list.add(new Student(21, "Tansen"));

        Collections.sort(list);
        for (Student s : list) {
            System.out.println(s);
        }
    }
}
