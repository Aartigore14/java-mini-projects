import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        StudResult obj = new StudResult();


        while(true){
            System.out.println("===== Student Grade Tracker =====");
            System.out.println("1.Add Student");
            System.out.println("2.Display all students");
            System.out.println("3.Find Topper");
            System.out.println("4.Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 4) {
                System.out.println("Exiting...");
                break;
            }
            switch (choice){
                case 1 :System.out.print("Enter Name of Student:");
                    String name = sc.nextLine();
                    System.out.print("Enter Marks of Student:");
                    int marks = sc.nextInt();
                    System.out.print("Enter Total Marks of Student:");
                    int totalMarks = sc.nextInt();
                    sc.nextLine();
                    StudInfo student = new StudInfo(name, marks, totalMarks);
                    obj.addStudent(student);
                    System.out.println("Student added successfully!");
                    break;
                case 2:
                    obj.displayAll();
                    break;
                case 3:
                    obj.findTopper();
                    break;
                default:
                    System.out.println("Invalid choice!");


            }


            }

        }
    }
