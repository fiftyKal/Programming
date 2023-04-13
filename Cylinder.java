package week3;

public class Cylinder {
    // Attributes
    private Circle base;
    private int height;
    // Constructor

    public Cylinder( Circle theBase, int height) {
        this.base = theBase;
        this.height = height;
    }
    public double calculateVolume() {
        return base.calculateArea() * height;
    }
    public String toString() {
       return " Cylinder with base" + base + " and height" + height;
    }
}
