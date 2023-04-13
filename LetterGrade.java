package week2;

public class LetterGrade {
    public static void main(String[] args) {
        String letterGrade = "F";
        int grade = 95;  //Note this must work for all values of grade
        if (grade >= 90) {letterGrade = "A";}
        else if (grade >= 80) {letterGrade = "B";}
        else if (grade >= 70) {letterGrade = "C";}
        else if (grade >= 60) {letterGrade = "D";}
        System.out.println(letterGrade);

    }
}
