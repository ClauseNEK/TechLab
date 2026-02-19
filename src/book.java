// title (Tages fra input scanneren)
// type (Scanner)
// Author (PRIVATE)
// currentLoanDays (Scanner) - skal være en double eller int
// book class (Opret book class med extends fra items)
public abstract class book extends items {

    private String author;


// Class Constructor
public Book(int maxLoanDays, int currentLoanDays, String author){
    super(maxLoanDays, currentLoanDays);
    this.author = author;
}


    @Override
    public double currentLoanDays() {
        return super.currentLoanDays();
    }


    @Override
    public String title() {
        return "Title: " + author;
    }


    // toString metode
/*    @Override
    public String toString() {
        return "Product: " + name + " | Type: " + type + " ";
    }
*/





}



// BOOK