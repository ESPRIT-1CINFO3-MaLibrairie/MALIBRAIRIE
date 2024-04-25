public class Book {
    private String title;
    private String author;
    private int id;
    private boolean available;
    // Constructor
    public Book(String title, String author, int id) {
        this.title = title;
        this.author = author;
        this.id = id;
        this.available = true; // Initially, book is available
    }
    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ID: " + id);
        System.out.println("Available: " + available);
    }












}
