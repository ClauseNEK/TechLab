public class computers extends electronics {

    private String model;

    // Constructor
    public electronics(String model) {
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
