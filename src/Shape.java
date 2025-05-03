 class Shape {
    void draw() {
        System.out.println("Drawing a shape.");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(5.0);
        c.draw();
        c.calculateArea();
    }
}
