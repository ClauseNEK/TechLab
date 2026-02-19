import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        //initialiser scanner
        Scanner input = new Scanner(System.in);

        //første besked til bruger
        System.out.println("Hvor mange ting ville du låne?: ");

        //tager imod input om antal udlån og gemmer det i count
        int count = getCount(input);

        //laver en items[] array ved at kører loanItems
        loanItems(count, input);
    }

    //tager imod antal udlån
    public static int getCount(Scanner input){
        int count = 0;
        count = input.nextInt();
        return count;
    }

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

            // reference: PetAdoptionCenter
            if (type.equalsIgnoreCase("bog")) {
                library[i] = new book(title);
            } else if (type.equalsIgnoreCase("video")) {
                library[i] = new video(title);
            } else if (type.equalsIgnoreCase("kit")) {
                library[i] = new kit(title);
            } else if (type.equalsIgnoreCase("computer")) {
                library[i] = new computers(title);
            } else {
                System.out.println("Ukendt type.");
                break;
            }

        }
    }


}
