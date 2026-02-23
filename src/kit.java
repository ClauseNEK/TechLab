public class kit extends electronics {

    private String kitLevel;

    // Constructor
    public kit (String title, String type, double currentLoanDays, int baseValue, String kitLevel) {
        super(title,
                type,
                currentLoanDays,
                3,
                baseValue);
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
