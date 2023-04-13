package week2;

public class test {
    public static void main(String[] args) {
        int b = 2;
        int a = 3;
        b = (a == ++b) ? b - 1 : a + 1;

            if (a == ++b) {
                b = b - 1;
            } else {
                b = a + 1;
            }
        System.out.println(b);
    }
}