public class kit extends electronics {

    private String kitLevel;

    // Constructor
    public kit (String kitLevel, String title, String type, boolean isLoaned, double maxLoanDays, double currentLoanDays, double feePerDay) {
        super(title,
                type,
                isLoaned,
                maxLoanDays,
                currentLoanDays,
                feePerDay);
        this.kitLevel = kitLevel;
    }

    // Getter
    public String getKitLevel() {
        return kitLevel;
    }

    // Setter
    public void setKitLevel(String kitLevel) {
        this.kitLevel = kitLevel;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
