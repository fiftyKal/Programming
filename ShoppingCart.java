package week3examples;

public class ShoppingCart {
    public static void main(String[] args) {
        double total = 10;
        double distance = 10;
        int day = 1;

        do {
            System.out.println("Day " + day + " distance today " + distance + " total = " + total);
            distance *= 0.7;
            day++;
            total+=distance;

        }while(distance > 0.1);
    }
}
