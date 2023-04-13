package week2;

import java.util.Scanner;

public class AverageNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userTyped;
        boolean done = false;
        int sum = 0, count = 0;


        do {
            System.out.print("Input an integer (Q to quit): ");
            userTyped = input.next();
            if (userTyped.equals("Q"))
                done = true;
            else
            {
                sum += Integer.parseInt(userTyped);
                count++;

            }
        }
        while(!done); // done == false

        System.out.println("sum = " + sum + "count = " + count);
        if (count > 0)
            System.out.println("average = " + (double) sum/count);
        else {
            System.out.println("average = 0");
        }
    }
}
