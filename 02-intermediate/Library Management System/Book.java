public class Book {
    String bookID = "";
    String title;
    String author;
    boolean isIssued = false ;
    String issuedTo="";

    public Book(String bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isIssued = false;    // default — not passed as parameter
        this.issuedTo = "";       // default — not passed as parameter
    }

    public String getBookID() {
        return bookID;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }

    public String getIsIssued() {
        return isIssued;
    }

    public String getIssuedTo() {
        return issuedTo;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsIssued(String isIssued) {
        this.isIssued = isIssued;
    }

    public void setIssuedTo(String issuedTo) {
        this.issuedTo = issuedTo;
    }
}

