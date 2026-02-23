public abstract class electronics extends items {

    private int baseValue;

    // Constructor
    public electronics(String title, String type, double currentLoanDays, double feePerDay, int baseValue) {
        super(title,
                type,
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
