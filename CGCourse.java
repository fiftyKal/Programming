package classes;


    class CGCourse extends Course {
        private String location;

        public CGCourse(String department, int courseNum, int creditHours, String location) {

            super(department, courseNum, creditHours);
            this.location = location;
        }
        public String toString() {
            return super.toString() + " " + location;

            }


}
