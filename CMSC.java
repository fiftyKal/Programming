package classes;

import java.util.ArrayList;
public class CMSC implements Major {
    public boolean qualifyMajor(ArrayList<Course> lst) {
        int count = 0;
        for (Course course : lst) {
            if (course.getDepartment().equals("CMSC") && course.getCourseNum() >= 300) {
                count++;
            }

        }
        if (count >= 3) {
            return true;
        }
        else {
            return false;
        }
    }
    public String toString() {
        return "CMSC" ;
    }
}


