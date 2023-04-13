package week2;



public class PizzaSlice {
    public static void main(String[] args) {
        int radius;
        int slices;
//        System.out.print("Input Pizza Diameter: ");
//        int num = input.nextInt();
//        System.out.print("Input Number of Pizza Slices: ");
//        int num = input.nextInt();
        double pi = 3.14, area;
        radius = 7;
        // calculating the area of the circle
        area = pi * radius * radius;
        // printing the area of the circle
        slices = 8;
        System.out.println("Area of a pizza slice is :" + area/ slices);
    }
}
