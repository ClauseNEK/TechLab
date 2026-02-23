import java.util.Scanner;
import java.util.Arrays; //Importerer arrays util - vi bruger Arrays.sort til at sortere vores array alfabetisk

public class Main {

    public static void main (String[] args) {
        //initialiser scanner
        Scanner input = new Scanner(System.in);

        //første besked til bruger
        System.out.println("Velkommen til TechLabs lånesystem!");
        System.out.println("----------------------------------");
        System.out.println("Hvor mange ting ville du låne?: ");
        int count = 0;

        //While loop til hvis hasNextInt ikke er true så printer den en fejl.
        while (!input.hasNextInt()) {
            System.out.println("\nFejl! Indtast venligst et helt tal for at fortsætte. \n");
            System.out.println("Hvor mange ting ville du låne?: ");
            input.nextLine(); //ryder det invalide input fra bufferen
        } //Går til toppen af while loopet igen

        count = input.nextInt(); //Hvis input.hasNextInt er true så kører programmet videre og gemmer den læste int i count.
        input.nextLine(); // vigtig: spis newline

        //Opretter vores Array og kalder det library
        items[] library = loanItems(count, input);

        //Sorterer vores array alfabetisk ved at sammenligne item1 og item2's titler. (Algoritme)
        Arrays.sort(library, (item1,item2) -> item1.getTitle().compareTo(item2.getTitle()));

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

            //Teknisk set samme while loop som på linje 14, dog bruger vi type og dotOperateren equals,
            //som gør at hvis type ikke er lig med bog, video, kit eller computer, så printer den en fejl.
            while (!type.equals("bog") && !type.equals("video") && !type.equals("kit") && !type.equals("computer")){
                System.out.println("\nFejl! Indtast venligst en af følgende: bog, video, kit eller computer");
                System.out.println("\nType (bog/video/kit/computer): ");
            type = input.nextLine();
            }

            System.out.print("\nTitle: ");
            String title = input.nextLine();

            System.out.println("\nDage udlånt: ");
            double currentLoanDays = input.nextDouble();
            

            //baseValue skal bruges i to forskellige cases (kit og computer) men må kun defineres en gang
            //derfor defineres den inden switch'en
            int baseValue;

            //switch hvor case kommer an på hvilke type brugeren har skrevet ind på linje 30.
            input.nextLine();

            //Bruger dot operater til at lave om til små bogstaver, så den ikke længere er case sensitive.
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
