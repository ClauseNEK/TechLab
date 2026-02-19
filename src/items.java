public abstract class items {
    //attributes
    private String name;
    private String type;
    private boolean isLoaned;
    private int maxLoanDays;
    private int currentLoanDays;
    private double feePerDay;

    //constructor
    public items (String name, String type, boolean isLoaned, int maxLoanDays, int currentLoanDays, double feePerDay){
        this.name = name;
        this.type = type;
        this.isLoaned = isLoaned;
        this.maxLoanDays = maxLoanDays;
        this.currentLoanDays = currentLoanDays;
        this.feePerDay = feePerDay;
    }
}
