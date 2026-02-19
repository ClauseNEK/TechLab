import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        //initialiser scanner
        Scanner input = new Scanner(System.in);

        //første besked til bruger
        System.out.println("Hvor mange ting ville du låne?: ");

    }
    public int getCount(){
        Scanner input = new Scanner(System.in);
        int count = 0;
        count = input.nextInt();
        return count;
    }

    public void loanItems(int count) {
        for (int i = 0; i < count; i++) {
            Scanner input = new Scanner(System.in);

            System.out.println("\nUdlån #" + (i + 1));

            System.out.print("\nType (bog/video/kit/computer): ");
            String type = input.nextLine();

            System.out.print("\nTitle: ");
            String title = input.nextLine();

            System.out.println("\nDage udlånt: ");
            double currentLoanDays = input.nextDouble();

            // kopieret metode i PetAdoptionCenter
            if (type.equalsIgnoreCase("bog")) {
                books[i] = new book(title);
            } else if (anden type)

        }
    }


}
