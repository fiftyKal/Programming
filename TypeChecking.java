package week3;

public class TypeChecking {
    // Static Attributes
    public static int func1(int x, String y) {
        return 10;
    }

    public static String func2(String x, int y) {
        return "Hi";
    }


//    public static void main(String[] args) {
//        // Attributes
//        int a = 10;
//        String b = "Hey";
//
//        System.out.println(func1(2 * a , a + b));
//    }

//    public static void main(String[] args) {
//        // Attributes
//        int a = 10;
//        String b = "Hey";
//
//        System.out.println(func2(func2(b,a), int a));
//    }

    public static void main(String[] args) {
        // Attributes
        int a = 10;
        String b = "Hey";

        System.out.println(func2(b + func1(5, b), func1(a, b) + func1(a / 2, b)));
    }

}
