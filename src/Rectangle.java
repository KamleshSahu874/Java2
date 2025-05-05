class Rectangle {

    int length;
    int breadth;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    int area() {
        return length * breadth;
    }

    int perimeter() {
        return 2 * (length + breadth);
    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(10, 5);
        Rectangle rect2 = new Rectangle(7, 3);
        System.out.println("Rectangle 1:");
        System.out.println("Area: " + rect1.area());
        System.out.println("Perimeter: " + rect1.perimeter());

        System.out.println("\nRectangle 2:");
        System.out.println("Area: " + rect2.area());
        System.out.println("Perimeter: " + rect2.perimeter());
    }
}

