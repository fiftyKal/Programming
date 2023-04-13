package week3;

public class sumTheRange {
    public static int getSum(int lower, int upper) {
        if (lower > upper)
            return 0;
        else
            return lower + getSum(lower + 1, upper);

    }
    public static void main(String[] args) {
        System.out.println("The sum is " + getSum(2, 4));
    }
}
