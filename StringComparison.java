package week4;

public class StringComparison {

    public static boolean compareString(String s1, String s2, String s3) {

        return s3.compareTo(s2)<0&&s2.compareTo(s1)<0;



    }

    public static void main(String[] args) {
        System.out.println(compareString("hard place","man","rock"));
        System.out.println(compareString("Java","IntelliJ","IDE"));
        System.out.println(compareString("a cup","a slip","a lip"));
        System.out.println(compareString("this","this","that"));
        System.out.println(compareString("their","there","they're"));
    }
}

