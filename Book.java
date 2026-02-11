
public class Book {

    // Private variables 
    private String bookTitle;
    private String bookAuthor;
    private String bookISBN;
    private boolean isAvailable;


    // Constructor
    public Book(String title, String author, String isbn) {
        bookTitle = title;
        bookAuthor = author;
        bookISBN = isbn;
        isAvailable = true; // book is available by default
    }

    // Getter methods
    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String getBookISBN() {
        return bookISBN;
    }
    public boolean getIsAvailable() {
        return isAvailable;
    }
     public void displayInfo() {
        System.out.println("Title  : " + bookTitle);
        System.out.println("Author : " + bookAuthor);
        System.out.println("ISBN   : " + bookISBN);
        System.out.println("Status : " + (isAvailable ? "Available" : "Not Available"));
        System.out.println("------------------------");
    }
}
