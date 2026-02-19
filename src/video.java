public class video extends items {

        private int days;
        private String title;

//Constructor
public video(String title, String type, boolean isLoaned, double maxLoanDays, double currentLoanDays, double feePerDay) {
    super(title, type, isLoaned, maxLoanDays, currentLoanDays, feePerDay);
}


// Getter
public String getName() { return title; }

public int getInt() { return days ; }

 // Setter

public void setName(String name) {this.title = name; }

public void setDays(int days)  { this.days= days;}


   //Polymorphic method
@Override
    public String toString() {
                return "Product: " + title + " | Days: " + days + " ";
            }
    }

