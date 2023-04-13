package week2;

import java.util.Scanner;

public class PizzaInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the Pizza Diameter: ");
        int d = input.nextInt();
        System.out.println("Input the Number of Pizza Slices: ");
        int s = input.nextInt();
        System.out.println("the area of the pizza slice is = " + (((d/2) * (d/2)) * 3.14) / s);
        input.close();
    }
}
