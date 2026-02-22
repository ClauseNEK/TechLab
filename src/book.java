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

import java.util.Scanner;

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
//    @Override
//    public String toString() {
//        return "Title: " + getTitle()
//                + " Loan Days: " + getCurrentLoanDays() // Inde i items er getteren tilføjet:
//                + " Author: " + author
//                + " Fee Total: " + calculateLateFee(maxLoanDays, currentLoanDays, feePerDay);
//
//    }
}