package classes;

import java.util.ArrayList;
import java.util.Collections;

public class Student {
    // Static Attributes
    private static int nextID = 100;
    // Attributes
    private String studentName;
    private int id;
    private Major major;
    private ArrayList<Course> lst;
    private boolean isSorted = true;

    // Constructor
    public Student(String name, int id, Major major) {
        studentName = name;
        this.id = id;
        this.id = nextID;
        this.major = major;
        this.lst = new ArrayList<>();

    }

    // Second Version
    public Student(String name, Major major) {
        studentName = name;
        this.id = nextID++;
        this.major = major;
        this.lst = new ArrayList<>();
    }
    // Other Methods


    public boolean addCourse(Course course) {
        if (course == null || lst.contains(course)) {
            return false;
        }
        lst.add(course);
        isSorted = false;
        return true;
    }

    public void changeStudent(String studentName) {
        this.studentName = studentName;
        this.id = nextID++;
    }

    public void printCourses() {
        for (Course s : lst)
            System.out.println("Department: " + s.getDepartment() + " Course Number: " + s.getCourseNum() + " Credit Hours: " + s.getCreditHours());
    }
    public boolean precedesById(Student otherStudent) {
        if (id < otherStudent.id)
            return true;
        else
            return false;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student otherStudent = (Student) obj;
            return studentName.equals(otherStudent.studentName) &&
                    id == otherStudent.id;
        } else return false;
    }

    public void removeCourse(String Math) {
        lst.removeIf(course -> course.getDepartment().equals("Math"));
    }

    // toString() Method
    public String toString() {
        if (isSorted == false) {
            Collections.sort(lst);
        }

        String out = studentName + " Student Identification Number: " + id + "\n";
        out += "Attends the following courses: " + "\n" + lst;
        out = out + " is currently majoring in: " + major + major.qualifyMajor(lst);
        return out;
    }
}







