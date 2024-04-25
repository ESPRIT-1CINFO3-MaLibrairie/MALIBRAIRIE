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
    // Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }



    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ID: " + id);
        System.out.println("Available: " + available);
    }












}
