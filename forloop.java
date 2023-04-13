package week1;

public class forloop {
    public static void main(String args[])
    {
        int number=11;
        System.out.print("List of odd numbers from 817 to "+number+": ");
        for (int i=817; i>=number; i--)
        {
//logic to check if the number is odd or not
//if i%2 is not equal to zero, the number is odd
            if (i%2!=0)
            {
                System.out.print(i + " ");
            }
        }
    }
}
