package week1.Week1;

import java.util.Scanner;

public class TemperatureInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a Temperature: ");
        int num = input.nextInt();
        if (num < 30) {
        System.out.println("Cold");
        }
        else {
               System.out.println("Not Bad");
        }
        }

    }
