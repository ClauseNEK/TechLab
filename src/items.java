import java.util.Scanner;

public abstract class items {
    //attributes
    private String title;
    private String type;
    private boolean isLoaned;
    private final double maxLoanDays;
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

    //metode der udregner late fee. returnere 0 hvis låne perioden ikke er overskredet
    public double calculateLateFee(double maxLoanDays, double currentLoanDays, double feePerDay){
        if (currentLoanDays > maxLoanDays){
        return currentLoanDays -= maxLoanDays * feePerDay;
        } else {
            return 0;
        }
    }

    //metode der printer og tager imod input. bør overrides i subclasses
    public void loanItem(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Title");
        String title = sc.nextLine();
        System.out.println("Type");
        String type = sc.nextLine();
        System.out.println("Loan days");
        double currentLoanDays = sc.nextDouble();
    }
}
