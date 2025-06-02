import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
    int rollNo;
    int age;
    String name;

    public Student(int rollNo, int age, String name) {
        this.rollNo = rollNo;
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return rollNo + " " + age + " " + name;
    }

    public int compareTo(Student s) {
        return this.rollNo - s.rollNo;
    }

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(103, 22, "Akbar"));
        list.add(new Student(101, 19, "Birbal"));
        list.add(new Student(102, 21, "Tansen"));


        Collections.sort(list);

        // Printing sorted students
        for (Student s : list) {
            System.out.println(s);
        }
    }
}
