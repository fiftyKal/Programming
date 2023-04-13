package week2.week2;

public class ForLoopTemperature {
    public static void main(String[] args) {
        int x = 0;
        for( int i = 100; i >= x; x+= 10) {
            int farenheight = x * (9/5) +32;
            System.out.println( x + "         " + farenheight);
        }
    }
}
