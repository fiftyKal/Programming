package classes;


 class WorkStudy_Student extends Student{
     private double hours_worked;

     private double wage = 7.25;
     private double pay = hours_worked * wage;
     public WorkStudy_Student(String studentName, double hours_worked, Major major) {
         super(studentName, major);
         this.hours_worked = hours_worked;
     }

     public String toString() {
         String out = super.toString() + " is a work study student with "  + hours_worked;
         out += " hours worked, earning " + pay;
         return out;
     }

}
