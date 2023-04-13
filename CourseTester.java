package classes;


import java.util.ArrayList;
import java.util.Collections;

public class CourseTester {
    public static void main(String[] args) {

        ArrayList<Course> lst = new ArrayList<>();
        lst.add(new Course("art", 421, 32));
        lst.add(new Course("CMSC", 450, 23));
        lst.add(new Course("CMSC", 342, 33));
        lst.add(new Course("Math", 444, 43));
        lst.add(new Course("CMSC",2344,45));
        lst.add(new Course("CMSC", 1273, 45));

        Collections.sort(lst);
        System.out.println(lst);


        CGCourse course1 = new CGCourse("Biology", 142, 2, " Indianola, Iowa");
        CGCourse math = new CGCourse("Discrete Math", 1424, 21, " West Des Moines, Iowa ");
        CGCourse psych = new CGCourse("Psychology", 4213, 41, "Indianola, Iowa");
        System.out.println(course1);
        System.out.println(math);
        System.out.println(psych);

    }
}


