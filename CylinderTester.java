package week3;

public class CylinderTester {
    public static void main(String[] args) {

        Circle c1 = new Circle(5);
        // Other Methods
        System.out.println(c1);
        System.out.println("The area is " + c1.calculateArea());

        Cylinder cyl1 = new Cylinder(c1,9);
        // Other Methods
        System.out.println(cyl1);
        System.out.println("The volume is " + cyl1.calculateVolume());}
}
