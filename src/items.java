import java.util.Scanner;

public abstract class items {
    //attributes
    private String title;
    private String type;
    private boolean isLoaned;
    private final double maxLoanDays;
    private double currentLoanDays;
    private double feePerDay;

    //constructor
    public items (String title, String type, boolean isLoaned, double maxLoanDays, double currentLoanDays, double feePerDay){
        this.title = title;
        this.type = type;
        this.isLoaned = isLoaned;
        this.maxLoanDays = maxLoanDays;
        this.currentLoanDays = currentLoanDays;
        this.feePerDay = feePerDay;
    }

    //metode der udregner late fee. returnere 0 hvis låne perioden ikke er overskredet
    public double calculateLateFee(double maxLoanDays, double currentLoanDays, double feePerDay){
        if (currentLoanDays > maxLoanDays){
        return currentLoanDays -= maxLoanDays * feePerDay;
        } else {
            return 0;
        }
    }

    @Override
    public String toString(){
        return "Product: " + title + " | Type: " + type + " | Late fee per day: " + feePerDay;
    }
}
