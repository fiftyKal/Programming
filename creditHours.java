package week3;

import java.util.Scanner;
public class creditHours {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many crediit hours have you completed?");
        int num = input.nextInt();
        if (num < 30) {
            System.out.println("freshman");
        }
        else if (num < 60)
        {
            System.out.println("Sophomore");
        }
        else if (num < 90)
        {
            System.out.println("Junior");
        }
        else
        {
            System.out.println("Senior");
        }
    }
}
