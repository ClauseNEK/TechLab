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
    public items (String title, String type, double currentLoanDays){
        this.title = title;
        this.type = type;
        //this.isLoaned = isLoaned;
        //this.maxLoanDays = maxLoanDays;
        this.currentLoanDays = currentLoanDays;
        //this.feePerDay = feePerDay;
    }

    //metode til at lave array, der skal overrides i hver subclass baseret på hvilke attributes de hver især har
    public static items[] loanItems(int count, Scanner input) {
        for (int i = 0; i < count; i++) {
            items[] library = new items[count];

            System.out.println("\nUdlån #" + (i + 1));

            System.out.print("\nType (bog/video/kit/computer): ");
            String type = input.nextLine();

            System.out.print("\nTitle: ");
            String title = input.nextLine();

            System.out.println("\nDage udlånt: ");
            double currentLoanDays = input.nextDouble();

            //library[] = new items(title, type, currentLoanDays);

            // reference: PetAdoptionCenter
//            if (type.equalsIgnoreCase("bog")) {
//                library[i] = new book(title, author, currentLoanDays);
//            } else if (type.equalsIgnoreCase("video")) {
//                library[i] = new video(title);
//            } else if (type.equalsIgnoreCase("kit")) {
//                library[i] = new kit(title);
//            } else if (type.equalsIgnoreCase("computer")) {
//                library[i] = new computers(title);
//            } else {
//                System.out.println("Ukendt type.");
//                break;
//            }

        }
    }
// getter til currentLoanDays - til book ihvertfald
    public double getCurrentLoanDays() {
        return currentLoanDays;
    }


    //metode der udregner late fee. returnere 0 hvis låne perioden ikke er overskredet
    public double calculateLateFee(double maxLoanDays, double currentLoanDays, double feePerDay){
        if (currentLoanDays > maxLoanDays){
        return currentLoanDays -= maxLoanDays * feePerDay;
        } else {
            return 0;
        }
    }

    @Override
    public String toString(){
        return "Product: " + title + " | Type: " + type + " | Late fee per day: " + feePerDay;
    }
}