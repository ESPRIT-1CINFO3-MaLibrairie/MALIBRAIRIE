package classes;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    // Constructor
    public Library() {
        this.books = new ArrayList<>();
    }
    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to display all books in the library
    public void displayAllBooks() {
        for (Book book : books) {
            book.displayDetails();
            System.out.println();
        }
    }

}
