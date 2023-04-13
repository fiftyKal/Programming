package week4;

public class ForLoop {

    public static int countNumbers(int number)
    {
        int counter = 0;
        int b = 0;
        System.out.print("List of divisible numbers from 0 to "+ number +": ");
        for (int i=1 ; i <= 100; i++)
        {
//logic to check if the number is odd or not
            if (i% number ==0)
            {
                System.out.print(i + " ");
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(countNumbers(5));
    }
}