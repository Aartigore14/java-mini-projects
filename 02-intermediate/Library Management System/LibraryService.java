import java.util.HashMap;

public class LibraryService {

    // Store books using bookId as the key
    private HashMap<String, Book> library = new HashMap<>();

    // Add a new book
    public void addBook(Book book) {
        library.put(book.getBookID(), book);
        System.out.println("Book added successfully.");
    }

    // Display all books
    public void displayAllBooks() {
        if (library.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        for (Book book : library.values()) {
            System.out.println(book);
        }
    }

    // Search a book by ID
    public void searchBook(String bookID) {
        Book book = library.get(bookID);

        if (book != null) {
            System.out.println(book);
        } else {
            System.out.println("Book not found.");
        }
    }

    // Issue a book
    public void issueBook(String bookID String personName) {
        Book book = library.get(bookID);

        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        if (book.isIssued()) {
            System.out.println("Book is already issued.");
        } else {
            book.setIssued(true);
            book.setIssuedTo(personName);
            System.out.println("Book issued successfully to " + personName);
        }
    }

    // Return a book
    public void returnBook(String bookId) {
        Book book = library.get(bookId);

        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        if (!book.isIssued()) {
            System.out.println("Book is already available.");
        } else {
            book.setIssued(false);
            book.setIssuedTo(null);
            System.out.println("Book returned successfully.");
        }
    }
}
