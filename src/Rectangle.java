class Rectangle {
    // Fields
    int length;
    int breadth;

    // Constructor
    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    // Method to calculate area
    int area() {
        return length * breadth;
    }

    // Method to calculate perimeter
    int perimeter() {
        return 2 * (length + breadth);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating objects with different values
        Rectangle rect1 = new Rectangle(10, 5);
        Rectangle rect2 = new Rectangle(7, 3);

        // Calling methods and displaying results
        System.out.println("Rectangle 1:");
        System.out.println("Area: " + rect1.area());
        System.out.println("Perimeter: " + rect1.perimeter());

        System.out.println("\nRectangle 2:");
        System.out.println("Area: " + rect2.area());
        System.out.println("Perimeter: " + rect2.perimeter());
    }
}

