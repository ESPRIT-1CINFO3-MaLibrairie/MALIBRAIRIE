package classes;

public class Librarian {
    private String name;
    // Constructor
    public Librarian(String name) {
        this.name = name;
    }
    // Getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    // Method to display librarian details
    public void displayDetails() {
        System.out.println("Librarian: " + name);
    }
}

