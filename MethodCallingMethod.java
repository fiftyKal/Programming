package week3examples;

public class MethodCallingMethod {

    public static String happy() {
        return " Happy Birthday to you.";
    }

    public static void singHappyBirthday(String person) {
        System.out.println(happy() + happy() + " Happy birthday dear "
                + person + ",\n" + happy());
    }

    public static void main(String[] args)  {

        singHappyBirthday(" Grandma Paulette");
    }

}
