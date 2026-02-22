import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        //initialiser scanner
        Scanner input = new Scanner(System.in);

        //første besked til bruger
        System.out.println("Hvor mange ting ville du låne?: ");
        int count = input.nextInt();
        input.nextLine(); // vigtig: spis newline

        items[] library = loanItems(count, input);

        // Her printer den vores Udlån
        for (items it : library) {
            System.out.println(it);
        }
    }

    // Nu begynder vi på output delen:

    public static items[] loanItems(int count, Scanner input) {
        items[] library = new items[count];

        for (int i = 0; i < count; i++) {
            System.out.println("\nUdlån #" + (i + 1));

            System.out.print("\nType (bog/video/kit/computer): ");
            String type = input.nextLine();

            System.out.print("\nTitle: ");
            String title = input.nextLine();

            System.out.println("\nDage udlånt: ");
            double currentLoanDays = input.nextDouble();

            switch (type.toLowerCase()) {
                case "bog":
                    System.out.println("\nAuthor:");
                    String author = input.nextLine();
                    library[i] = new book(title, type, currentLoanDays, author);
                    break;
                case "kit":
                    System.out.println("\nValue:");
                    int baseValue = input.nextInt();
                    System.out.println("\nKit Level:");
                    String kitLevel = input.nextLine();
                    library[i] = new kit (title, type, currentLoanDays, baseValue, kitLevel);
                    break;
            }
        }
        return library;
    }
            // If statements her - Det vel med hvis man vælger bog, video, computer eller kit

    //tager imod antal udlån
    public static int getCount(Scanner input){
        int count = 0;
        count = input.nextInt();
        return count;
    }
}
