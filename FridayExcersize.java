package week1.Week1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FridayExcersize {
    public static void main(String[] args) {
        int integer1;
        int integer2;
        int integer3;

        Scanner scannerA = new Scanner(System.in);
        System.out.println("Enter a number: ");
        integer1 = scannerA.nextInt();
        System.out.println("Enter a number: ");
        integer2 = scannerA.nextInt();
        System.out.println("Enter a number: ");
        integer3 = scannerA.nextInt();
        if (integer1 <= integer2 && integer2 <= integer3) {
            System.out.println("Increasing");
            System.out.println("Ok");
        } else if (integer1 >= integer2 && integer2 >= integer3) {
            System.out.println("Decreasing");
        } else {
            System.out.println("neither");
        }
    }
}
