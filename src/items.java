import java.util.Scanner;

public abstract class items {
    //attributes
    private String title;
    private String type;
    private final double maxLoanDays = 14;
    private double currentLoanDays;
    private double feePerDay;

    //constructor
    public items (String title, String type, double currentLoanDays, double feePerDay){
        this.title = title;
        this.type = type;
        this.currentLoanDays = currentLoanDays;
        this.feePerDay = feePerDay;
    }

    // Getters til vores Subclasses:
    public String getTitle() {
        return title;
    }
    public String getType() {
        return type;
    }
    public double getMaxLoanDays() {
        return maxLoanDays;
    }
    public double getCurrentLoanDays() {
        return currentLoanDays;
    }
    public double getFeePerDay() {
        return feePerDay;
    }

    //metode der udregner late fee. returnere 0 hvis låne perioden ikke er overskredet
    public double calculateLateFee(double maxLoanDays, double currentLoanDays, double feePerDay){
        if (currentLoanDays > maxLoanDays){
        return (currentLoanDays - maxLoanDays) * feePerDay;
        } else {
            return 0;
        }
    }

    @Override
    public String toString(){
        return "Product: " + type + "\n| Title: " + title + " | Maximum Loan Days: " + maxLoanDays + "\n| Late fee per day: "
                + feePerDay + " | Late fee for " + currentLoanDays + " days: " + calculateLateFee(maxLoanDays, currentLoanDays, feePerDay) + " kr.";
    }
}