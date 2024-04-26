import java.io.PrintStream;
public class Main {
    public static void main(String[] args) {
// Create a member
        Member member1 = new Member("Bahe", 1);

        // Display member details
        System.out.println("\n MEMBER DETAILS :\n");
        member1.displayDetails();
        System.out.println("Hello world!");
        // Create a library
        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        // Create some books
        Book book1 = new Book("Alice in borderland", "Bahe", 101);
        Book book2 = new Book("Lupin", "Jihen", 102);
        // Create a librarian
        Librarian librarian = new Librarian("Alex");

        // Display librarian details
        System.out.println("\n LIBRARIAN DETAILS :\n");
        librarian.displayDetails();
    }
}