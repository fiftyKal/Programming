package classes;

import java.util.HashMap;
import java.util.Map;

public class StudentTester {
    public static void main(String[] args) {
        String mathString = "Math";
        String computerScienceString = "CMSC";
        Math math = new Math();
        CMSC cmsc = new CMSC();

        Course fundamentalsI = new Course(computerScienceString, 150, 4);
        Course algorithms = new Course(computerScienceString, 250, 3);
        Course math200 = new Course(mathString, 200, 4);
        Course religion101 = new Course("Religion", 101, 4);

        Student roseBush = new Student("Rose Bush", 123, math);
        Student helenHeaven = new Student("Helen Heaven", 987, cmsc);
        Student jerryAttrick = new Student("Jerry Attrick", 444, cmsc);
        Student tommyGunn = new Student("Tommy Gunn", 515, cmsc);
        Map<Course, Double> jerryScores = new HashMap<>();
        jerryScores.put(fundamentalsI, 92.3);
        jerryScores.put(algorithms, 87.6);
        jerryScores.put(math200, 88.8);


        //jane
        Student jane = new Student("Jane Doe", 1234, new CMSC() );
        jane.addCourse(new Course("CMSC", 330, 23));
        jane.addCourse(new Course("CMSC", 301, 22));
        jane.addCourse(new Course("CMSC", 323, 45));
        jane.addCourse(new Course("Programming", 324, 21));
            System.out.println(jane);
        jane.changeStudent("Jane Buck");
            System.out.println(jane);

        //Brionna
        Student brionna = new Student("brionna dorn", 1234, new CMSC() );
        brionna.addCourse(new Course("CMSC", 200, 23));
        brionna.addCourse(new Course("CMSC", 350, 22));
        brionna.addCourse(new Course("CMSC", 350, 45));
        brionna.addCourse(new Course("Art", 112, 45));
        brionna.addCourse(new Course("art", 122, 45));
        brionna.addCourse(new Course("Math",223, 45));
        brionna.addCourse(new Course("Math", 323, 45));
        brionna.addCourse(new Course("Math", 211, 21));
        System.out.println(brionna);
        brionna.changeStudent("brionna lee");
        System.out.println(brionna);

        //Chris
        Student chris = new Student("Chris dorn", 1234, new CMSC() );
        chris.addCourse(new Course("CMSC", 120, 23));
        chris.addCourse(new Course("CMSC", 450, 22));
        chris.addCourse(new Course("CMSC", 323, 45));
        chris.addCourse(new Course("Art", 323, 45));
        chris.addCourse(new Course("Art", 323, 45));
        chris.addCourse(new Course("Psychology", 323, 45));
        chris.addCourse(new Course("Math", 113, 45));
        chris.addCourse(new Course("Math", 114, 21));
        chris.addCourse(new Course("Math", 323, 45));
        chris.addCourse(new Course("Math", 323, 45));
        System.out.println(chris);

        System.out.println(jane.precedesById(chris));
        System.out.println(chris.precedesById(jane));


        //thomas
        Student thomas = new Student("Thomas Thumb", 1234, new CMSC() );
        thomas.addCourse(new Course("Math", 300, 23));
        thomas.addCourse(new Course("Math", 401, 22));
        thomas.addCourse(new Course("Math", 302, 45));
        thomas.addCourse(new Course("Programming", 224, 21));
        System.out.println(thomas);

        System.out.println(jane.precedesById(thomas));
        System.out.println(thomas.precedesById(jane));

        //oliver
        Student oliver = new Student("Oliver Juice", 1234, new CMSC() );
        oliver.addCourse(new Course("CMSC", 323, 23));
        oliver.addCourse(new Course("CMSC", 345, 22));
        oliver.addCourse(new Course("CMSC", 423, 45));
        oliver.addCourse(new Course("Math", 324, 21));
        oliver.addCourse(new Course("CMSC", 240, 234));
        oliver.removeCourse("Math");
        System.out.println(oliver);
        WorkStudy_Student oliverJuice = new WorkStudy_Student("Oliver Juice",14252, new CMSC());
        System.out.println(oliverJuice);

        // Kalli
        Student kalli = new Student("Kalli Day", 1566, new CMSC());
        kalli.addCourse(new Course("CMSC", 220, 55));
        kalli.addCourse(new Course("CMSC", 230, 23));
        kalli.addCourse(new Course("CMSC", 210, 45));
        kalli.addCourse(new Course("CMSC", 220, 24));
        kalli.addCourse(new Course("Math", 205, 22));
        kalli.addCourse(new Course("Math", 215, 24));
        System.out.println(kalli);


        // Curtis
        Student curtis = new Student("Curtis James", 1254, new Math() );
        curtis.addCourse(new Course("Math", 405, 22));
        curtis.addCourse(new Course("Math", 405, 22));
        curtis.addCourse(new Course("Math", 05, 22));
        curtis.addCourse(new Course("CMSC", 604, 22));
        curtis.addCourse(new Course("Math", 40, 22));
        curtis.addCourse(new Course("CMSC", 49, 22));

        System.out.println(curtis);

    }
    }


