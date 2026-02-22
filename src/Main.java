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

        //for loop kører baseret på værdien af count, som bliver sat på linje 11
        for (int i = 0; i < count; i++) {
            System.out.println("\nUdlån #" + (i + 1));

            System.out.print("\nType (bog/video/kit/computer): ");
            String type = input.nextLine();

            System.out.print("\nTitle: ");
            String title = input.nextLine();

            System.out.println("\nDage udlånt: ");
            double currentLoanDays = input.nextDouble();

            //baseValue skal bruges i to forskellige cases (kit og computer) men må kun defineres en gang
            //derfor defineres den inden switch'en
            int baseValue;

            //switch hvor case kommer an på hvilke type brugeren har skrevet ind på linje 30.
            input.nextLine();
            switch (type.toLowerCase()) {
                case "bog":
                    System.out.println("\nAuthor: ");
                    String author = input.nextLine();
                    library[i] = new book(title, type, currentLoanDays, author);
                    break;
                case "kit":
                    System.out.println("\nValue: ");
                    baseValue = input.nextInt();
                    input.nextLine();
                    System.out.println("\nKit Level:");
                    String kitLevel = input.nextLine();
                    library[i] = new kit (title, type, currentLoanDays, baseValue, kitLevel);
                    break;
                case "computer":
                    System.out.println("\nValue: ");
                    baseValue = input.nextInt();
                    input.nextLine();
                    System.out.println("\nModel: ");
                    String model = input.nextLine();
                    library[i] = new computers (title, type, currentLoanDays, baseValue, model);
                    break;
                case "video":
                    System.out.println("\nDuration: ");
                    int duration = input.nextInt();
                    library[i] = new video (title, type, currentLoanDays, duration);
                    break;
            }
        }
        return library;
    }

    //tager imod antal udlån
    public static int getCount(Scanner input){
        int count = 0;
        count = input.nextInt();
        return count;
    }
}
