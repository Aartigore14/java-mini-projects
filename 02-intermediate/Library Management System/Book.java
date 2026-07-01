public class Book {
    String bookID = "";
    String title;
    String author;
    boolean isIssued = false ;
    String issuedTo="";

    public Book(String bookID, String title, String author) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.isIssued = false;
        this.issuedTo = "";
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

    public boolean getIsIssued() {
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

    public void setIsIssued(boolean isIssued) {
        this.isIssued = isIssued;
    }

    public void setIssuedTo(String issuedTo) {
        this.issuedTo = issuedTo;
    }
}

