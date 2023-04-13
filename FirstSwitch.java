package week2;

import java.util.Scanner;

public class FirstSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a Letter Grade: ");
        String letterGrade = input.next();
        switch(letterGrade) {
            case "A":
                System.out.println("4");
                break;
            case "B":
                System.out.println("3");
                break;
            case "C":
                System.out.println("2");
                break;
            case "D":
                System.out.println("1");
                break;
            case "F":
                System.out.println("0");
                break;
            default:
                System.out.println("Invalid choice.");
        }

    }

}

