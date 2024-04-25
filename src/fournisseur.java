public class fournisseur {

    private String nom;
    private String prenom;
    private String email;

    private int id;
    private int cin;



    // Constructor
    public fournisseur(String nom, String prenom, String email, int id, int cin) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.id = id;
        this.cin = cin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    // Method to display fournisseur details
    public void displayFournisseurDetails() {
        System.out.println("Nom: " + nom);
        System.out.println("Prenom: " + prenom);
        System.out.println("Email: " + email);
        System.out.println("Cin: " + cin);

        System.out.println("ID: " + id);
    }
}
