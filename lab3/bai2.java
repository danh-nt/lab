public class bai2 {
    class Student {
        private String stID;
        private String stName;
        private String stClass;

        public Student() {

        }

        public Student(String stID, String stName, String stClass) {
            this.stID = stID;
            this.stName = stName;
            this.stClass = stClass;
        }

        st Student = new Student();

        public String getStID() {
            return stID;
        }

        public String getStName() {
            return stName;
        }

        public String StClass() {
            return stClass;
        }

        public void setStID(String id) {
            this.stID = id;
        }

        public void setStName(String name) {
            this.stName = name;
        }

        public void setStClass(String Class) {
            this.stClass = Class;
        }

        @Override
        public String toString() {
            return this.stID + "," + this.stName + "," + this.stClass;
        }
    }
}
