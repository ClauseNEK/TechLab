public class computers extends electronics {

    private String model;

    // Constructor
    public computers(String title, String type, double currentLoanDays, int baseValue, String model) {
        super(title,
                type,
                currentLoanDays,
                15,
                baseValue);
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
        return super.toString() + "\nBaseValue: " + getBaseValue() + " kr." + "\nModel: " + getModel() + "\n";
    }
}
