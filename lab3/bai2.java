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

        Student st = new Student();

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

    class Book {
        private String boCode;
        private String boTitle;
        private String boAuthor;

        public Book() {

        }

        public Book(String boCode, String boTitle, String boAuthor) {
            this.boCode = boCode;
            this.boTitle = boTitle;
            this.boAuthor = boAuthor;
        }

        Book bo = new Book();

        public String getBoCode() {
            return boCode;
        }

        public String getBoTitle() {
            return boTitle;
        }

        public String getBoAuthor() {
            return boAuthor;
        }

        public void setBoCode(String code) {
            this.boCode = code;
        }

        public void setBoTitle(String title) {
            this.boTitle = title;
        }

        public void setBoAuthor(String author) {
            this.boAuthor = author;
        }

        @Override
        public String toString() {
            return this.boCode + "," + this.boTitle + "," + this.boAuthor;
        }
    }

    class LibaryCard {
        private Long lbCode;
        private String Owner;
        private Integer borrowCount;

        public LibaryCard() {

        }

        public LibaryCard(Long lbCode, String Owner, Integer borrowCount) {
            this.lbCode = lbCode;
            this.Owner = Owner;
            this.borrowCount = borrowCount;
        }

        public Long getLbCode() {
            return lbCode;
        }

        public String getOwner() {
            return Owner;
        }

        public Integer getBorrowCount() {
            return borrowCount;
        }

        public void setLbCode(Long code) {
            this.lbCode = code;
        }

        public void setOwner(String owner) {
            this.Owner = owner;
        }
    }
}
