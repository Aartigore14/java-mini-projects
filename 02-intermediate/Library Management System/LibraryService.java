import java.util.HashMap;

public class LibraryService {

    private HashMap<String, Book> library = new HashMap<>();

    public void addBook(Book book){
        library.put(book.getBookID(),book);
        System.out.println("Book added successfully.");
    }
    public void displayAllBooks(){
        if (library.isEmpty()){
            System.out.println("No books available.");
            return;
        }
        for (Book book : library.values()){
            System.out.println("----------------------------");
            System.out.println("Book ID : " + book.getBookID());
            System.out.println("Title   : " + book.getTitle());
            System.out.println("Author  : " + book.getAuthor());

            if (book.getIsIssued()){
                System.out.println("Status : Issued");
                System.out.println("Issued To: "+book.getIsIssued());
            }else {
                System.out.println("Status : Available");
            }
        }
    }

    public void searchBook(String bookID){
        Book book = library.get(bookID);
        if (book == null){
            System.out.println("Book not found.");
        } else {
            System.out.println("Book Found.");
            System.out.println("Book ID : " + book.getBookID());
            System.out.println("Title   : " + book.getTitle());
            System.out.println("Author  : " + book.getAuthor());

            if (book.getIsIssued()){
                System.out.println("Status : Issued");
                System.out.println("Issued To : " + book.getIssuedTo());
            } else {
                System.out.println("Status : Available");
            }
        }
    }
    public void issueBook(String bookID , String personName){
        Book book = library.get(bookID);
        if (book.getIsIssued()) {
            System.out.println("Book is already issued to " + book.getIssuedTo());
        } else {
            book.setIsIssued(true);
            book.setIssuedTo(personName);
            System.out.println("Book issued successfully to " + personName);
        }
    }
    public void returnBook(String bookID) {

        Book book = library.get(bookID);

        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        if (!book.getIsIssued()) {
            System.out.println("Book is already available.");
        } else {
            book.setIsIssued(false);
            book.setIssuedTo("");
            System.out.println("Book returned successfully.");
        }
    }
}
