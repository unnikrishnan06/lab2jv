import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManager {

    public static void main(String[] args) {

        // Scanner for user input
        Scanner input = new Scanner(System.in);

        // ArrayList to store Book objects
        ArrayList<Book> bookList = new ArrayList<>();

        int choice = 0;

        // Menu loop
        while (choice != 5) {

            System.out.println("\n----- Library Menu -----");
            System.out.println("1. Add a new book");
            System.out.println("2. Display all books");
            System.out.println("3. Display available books");
            System.out.println("4. Search books by author");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = input.nextInt();
            input.nextLine(); 
            if (choice == 1) {
                // Add a new book
                System.out.print("Enter title: ");
                String title = input.nextLine();

                System.out.print("Enter author: ");
                String author = input.nextLine();

                System.out.print("Enter ISBN: ");
                String isbn = input.nextLine();

                Book newBook = new Book(title, author, isbn);
                bookList.add(newBook);

                System.out.println("Book added successfully!");
            }
            else if (choice == 2) {
                // Display all books
                if (bookList.size() == 0) {
                    System.out.println("No books available.");
                } else {
                    for (Book b : bookList) {
                        b.displayInfo();
                    }
                }

            } else if (choice == 3) {
         boolean found = false;

        for (Book b : bookList) {
        if (b.getIsAvailable()) {
            b.displayInfo();
            found = true;
        }
    }

        if (!found) {
        System.out.println("No available books.");
    }

}
 else if (choice == 4) {
    System.out.print("Enter author name: ");
    String searchAuthor = input.nextLine();

    boolean found = false;

    for (Book b : bookList) {
        if (b.getBookAuthor().equalsIgnoreCase(searchAuthor)) {
            b.displayInfo();
            found = true;
        }
    }

    if (!found) {
        System.out.println("No books found for that author.");
    }
}
        }
        input.close();
    }
}
