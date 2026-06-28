import java.util.ArrayList;

public class StudResult {
    ArrayList<StudInfo> stud = new ArrayList<>();

    public void addStudent(StudInfo student){
        stud.add(student);
    }
    public Double calculatePercentage(StudInfo student) {
        double percentage = (double) student.getMarks() / student.getTotalMarks() * 100;
        return percentage;
    }

    public String calculateGrade(double percentage) {
        if (percentage >= 75) {
            return "Distinction";
        } else if (percentage >= 60) {
            return "First class";
        } else if (percentage >= 50) {
            return "second class";
        } else if (percentage >= 35) {
            return "Pass";
        } else
            return "Fail" ;
    }
    public void displayAll() {
        for (StudInfo student : stud) {
            double percentage = calculatePercentage(student);
            String grade = calculateGrade(percentage);
            System.out.println("Name: " + student.getName() +
                    " | Marks: " + student.getMarks() +
                    " | Percentage: " + percentage +
                    "% | Grade: " + grade);
        }
    }

    public void findTopper() {
        if (stud.size() == 0) {
            System.out.println("No students added yet!");
            return;
        }

        StudInfo topper = stud.get(0);

        for (StudInfo student : stud) {
            if (calculatePercentage(student) > calculatePercentage(topper)) {
                topper = student;
            }
        }

        System.out.println("Topper: " + topper.getName() +
                " | Percentage: " + String.format("%.2f", calculatePercentage(topper)) + "%");
    }

    }

