// title (Tages fra input scanneren)
// type (Scanner)
// Tilføje loandays og fee per day
// Author (PRIVATE)
// currentLoanDays (Scanner) - skal være en double eller int
// book class (Opret book class med extends fra items)


// Tjek at items har:
/*
getTitle()

getCurrentLoanDays()

calculateLateFee()
 */

public class book extends items {
    private String author;

    // De er enkelte private da de kun er tilknyttet book og ikke de andre klasser
    private static final double maxLoanDays = 7;
    private static final double feePerDay = 1.5;

    // Class Constructor
    public book(String title, String author, double currentLoanDays) {
        super(title, "book", true, maxLoanDays, currentLoanDays, feePerDay);
        this.author = author;
    }

    // Henter author fordi den er privat
    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Title: " + getTitle()
                + " Loan Days: " + getCurrentLoanDays() // Inde i items er getteren tilføjet:
                + " Author: " + author
                + " Fee Total: " + calculateLateFee();

    }
}