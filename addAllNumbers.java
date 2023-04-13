package week5.week5;

import java.util.Arrays;

public class addAllNumbers {
        // Main method
        public static int addEvenNumbers (int[] array) {
            int sum = 0;


            // Iterate the array
            for (int i = 0; i < array.length; i++) {


                if (array[i] % 2 == 0) {


                    sum = sum + array[i];
                }
            }
            return sum;

        }

    public static void main(String[] args) {
        int[] test = {1,2,3,4,5};
        System.out.println(addEvenNumbers(test));
    }
}
