package week2.week2;

public class ChangeLoopVariable {
    public static void main(String[] args) {
        for (int count = 1; count < 10; count++) {
            System.out.print(count);
            if (count > 5) {
                //count = 10;
                break;

            }
        }
    }
}
//DO NOT DO ANY OF THIS