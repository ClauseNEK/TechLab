public class book {

    private String author;

    public book(int maxLoanDays, int currentLoanDays){
        super(maxLoanDays, currentLoanDays);
        this.author = author;

    }

    @Override
    public String getAuthor() {
        return "Book's Author: " + author;
    }
}

// BOOK