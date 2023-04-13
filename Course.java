package classes;



public  class Course implements Comparable<Course> {
    // Instance Variables
    public static String department;
    private int courseNum;
    private int creditHours;

    public Course(String department, int courseNum, int creditHours) {
        this.department = department;
        this.courseNum = courseNum;
        this.creditHours = creditHours;
    }

    // Other Methods
    public int getCourseNum() {
        return this.courseNum;
    }
    public String getDepartment() {
        return this.department;
    }
    public int getCreditHours() {
        return this.creditHours;
    }


    // Object Equality
    public boolean equals(Object obj) {
        if (obj instanceof Course) {
            Course otherCourse = (Course) obj;
            return department.equals(otherCourse.department) &&
                    courseNum == otherCourse.courseNum &&
                    creditHours == otherCourse.creditHours;
        } else return false;
    }

    @Override
    public int compareTo(final Course o) {
        if(this.courseNum == o.courseNum) {
            return 0;
        }
        else if(this.courseNum < o.courseNum) {
            return 1;
        }
        else{
            return -1;
        }
    }

    // toString() method
    public String toString() {
        return " Department " + department + " Course Number: " + courseNum + " Credit Hours: " + creditHours;
    }


}







//
//public class Course {
//
//    private String department;
//    private int courseNumber;
//    private int credits;
//
//    public Course(String dept, int courseNumber, int credits) {
//        this.department = dept;
//        this.courseNumber = courseNumber;
//        this.credits = credits;
//    }
//
//    public String toString() {
//        return this.department + courseNumber + " is " + credits + " credits.";
//    }
//}
