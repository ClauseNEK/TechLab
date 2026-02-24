public class book extends items {
    private String author;

    // Class Constructor
    public book(String title, String type, double currentLoanDays, String author) {
        super(title, type, currentLoanDays, 1.5);
        this.author = author;
    }

    // Henter author fordi den er privat
    public String getAuthor() {
        return author;
    }

    //commented ud indtil vi finder ud af hvordan den skal fungere
    @Override
    public String toString() {
        return super.toString();
    }
}