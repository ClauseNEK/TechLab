public class computers extends electronics {

    private String model;

    // Constructor
    public computers(String model, int baseValue, String title, String type, boolean isLoaned, double maxLoanDays, double currentLoanDays, double feePerDay) {
        super(title,
                baseValue,
                type,
                isLoaned,
                maxLoanDays,
                currentLoanDays,
                feePerDay);
        this.model = model;
    }

    // Getter
    public String getModel() {
        return model;
    }

    // Setter
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
