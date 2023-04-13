package classes;

import java.util.ArrayList;

public class Math implements Major {
    public boolean qualifyMajor(ArrayList<Course> lst) {
        int count = 0;
        for (Course item : lst) {
            if (item.getDepartment().equals("Math") && item.getCourseNum() >= 300) {
                count += 1;
            }
            if (count >= 3) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public String toString() {
        return "Math";
    }
}

