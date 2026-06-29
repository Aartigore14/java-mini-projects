public class StudInfo {
        String name = "";
        int marks ;
        int totalMarks;

        StudInfo(String name, int marks, int totalMarks){
            this.name = name;
            this.marks = marks;
            this.totalMarks = totalMarks;
        }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public int getTotalMarks() {
        return totalMarks;
    }
}

