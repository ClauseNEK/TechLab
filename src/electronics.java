public abstract class electronics extends items {

    private int baseValue;

    // Constructor
    public electronics(int baseValue, String title, String type, boolean isLoaned, double maxLoanDays, double currentLoanDays, double feePerDay) {
        super(title,
                type,
                isLoaned,
                maxLoanDays,
                currentLoanDays,
                feePerDay);
        this.baseValue = baseValue;
    }

    // Getter
    public int getBaseValue() {
        return baseValue;
    }

    // Setter
    public void setBaseValue(int baseValue) {
        this.baseValue = baseValue;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
