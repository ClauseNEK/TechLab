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
    Scanner input = new Scanner(System.in);


    // De er enkelte private da de kun er tilknyttet book og ikke de andre klasser
    private static final double maxLoanDays = 7;
    private static final double feePerDay = 1.5;

    // Class Constructor
    public book(String title, String type, double currentLoanDays, String author) {
        super(title, type, currentLoanDays);
        this.author = author;
    }

    // Henter author fordi den er privat
    public String getAuthor() {
        return author;
    }

//    public items[] loanBook(Scanner input, int count){
//        items[] library = new items[count];
//        System.out.println("\nAuthor:");
//        String author = input.nextLine();
//        library[1] = new book(title, type, currentLoanDays, author);
//        return library;
//    }

//    @Override
//    public String toString() {
//        return "Title: " + getTitle()
//                + " Loan Days: " + getCurrentLoanDays() // Inde i items er getteren tilføjet:
//                + " Author: " + author
//                + " Fee Total: " + calculateLateFee(maxLoanDays, currentLoanDays, feePerDay);
//
//    }
}