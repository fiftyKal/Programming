package week3;

public class Circle {
    // attributes
    private int radius;

    // Constructor
    public Circle(int radius) {
        this.radius = radius;
    }
    // Other Methods
    public double  calculateArea() {
        return Math.PI * radius * radius; // Math.pow(radius,2)
    }
    public String toString() {
        return " " + radius;
    }
}
