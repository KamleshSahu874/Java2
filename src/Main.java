
interface Walkable {
    void walk();
}
interface Runnable {
    void run();
}

class Human implements Walkable, Runnable {
    public void walk() {
        System.out.println("Human is walking.");
    }
    public void run() {
        System.out.println("Human is running.");
    }
}
public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.walk();
        human.run();
    }
}
