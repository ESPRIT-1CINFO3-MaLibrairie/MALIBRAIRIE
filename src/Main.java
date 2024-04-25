import java.io.PrintStream;
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        // Create a library
        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        // Create some books
        Book book1 = new Book("Alice in borderland", "Bahe", 101);
        Book book2 = new Book("Lupin", "Jihen", 102);
    }
}