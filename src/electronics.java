public abstract class electronics extends items {

    private String baseValue;

    // Constructor
    public electronics(int baseValue) {
        this.baseValue = baseValue;
    }

    // Getter
    public String getBaseValue() {
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
