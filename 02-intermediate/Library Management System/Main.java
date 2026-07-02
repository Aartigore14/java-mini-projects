import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        LibraryService library = new LibraryService();

        while (true){
            System.out.println("===== Library Management System =====");
            System.out.println("1. Add New Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Search Book by ID");
            System.out.println("4. Issue a Book");
            System.out.println("5. Return a Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    System.out.print("Enter Book ID: ");
                    String bookID = sc.nextLine();

                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();

                    Book book = new Book(bookID, title, author);
                    library.addBook(book);
                    break;

                case 2:
                    library.displayAllBooks();
                    break;

                case 3:
                    System.out.print("Enter a Book ID: ");
                    bookID = sc.nextLine();
                    library.searchBook(bookID);
                    break;

                case 4:
                    System.out.print("Enter a Book ID: ");
                    bookID = sc.nextLine();

                    System.out.print("Enter Person Name: ");
                    String personName = sc.nextLine();

                    library.issueBook(bookID, personName);
                    break;

                case 5:
                    System.out.print("Enter Book ID");
                    bookID = sc.nextLine();
                    library.returnBook(bookID);
                    break;

                    case 6:
                        System.out.println("Thank you for using Library Management System.");
                        sc.close();
                        return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
