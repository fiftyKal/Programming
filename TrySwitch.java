package week1.Week1;

public class TrySwitch {

    public static void main(String[] args) {
        String foodGrade = "GradeB";

        switch(foodGrade) {
            case "GradeA":
                System.out.println("30 cents per lb.");
                break;
            case "GradeB":
                System.out.println("20 cents per lb.");
                break; // keeps program from running everything below in the switch, instead of what you want.
            case "GradeC":
                System.out.println("15 cents per lb.");
                break;
            default:
                System.out.println("Invalid choice.");
        }

    }
}
