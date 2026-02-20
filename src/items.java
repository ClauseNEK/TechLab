import java.util.Scanner;

public abstract class items {
    //attributes
    private String title;
    private String type;
    private boolean isLoaned;
    private final double maxLoanDays = 14;
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


    // Getters til vores Subclasses:
    public String getTitle() {
        return title;
    }
    public String getType() {
        return type;
    }
    public boolean isLoaned() {
        return isLoaned;
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


    //metode til at lave array, der skal overrides i hver subclass baseret på hvilke attributes de hver især har
    // Fjernet og rykket over i Main da det vel er der den køres?

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