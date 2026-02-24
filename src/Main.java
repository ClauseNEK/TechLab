import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        //initialiser scanner
        Scanner input = new Scanner(System.in);

        //første besked til bruger
        System.out.println("Velkommen til TechLabs lånesystem!");
        System.out.println("----------------------------------");
        System.out.println("Hvor mange ting ville du låne?: ");
        int count = 0;
        boolean validInput = false;

        while (!validInput) {
            if (!input.hasNextInt()) {
                System.out.println("Fejl: Indtast venligst et helt tal!");
                input.nextLine();
            } else {
                count = input.nextInt();
                if (count <= 0) {
                    System.out.println("Fejl: Tallet skal være større end 0!");
                    input.nextLine();
                } else {
                    validInput = true;
                }
            }
        }
        input.nextLine();

        //Opretter vores Array og kalder det library
        items[] library = loanItems(count, input);

        // Bubblesort alfabetisk efter titel
        for (int i = 0; i < library.length - 1; i++) {
            for (int j = 0; j < library.length - 1 - i; j++) {
                if (library[j].getTitle().compareTo(library[j + 1].getTitle()) > 0) {
                    items temp = library[j];
                    library[j] = library[j + 1];
                    library[j + 1] = temp;
                }
            }
        }

        // Her printer den vores Udlån
        for (items it : library) {
            System.out.println(it);
        }
        System.out.println("Summary: \n" + "You borrowed " + library.length + " item(s) today");
    }

    // Nu begynder vi på output delen:
    public static items[] loanItems(int count, Scanner input) {
        items[] library = new items[count];

        //for loop kører baseret på værdien af count, som bliver sat på linje 11
        for (int i = 0; i < count; i++) {
            System.out.println("\nUdlån #" + (i + 1));

            System.out.print("\nType (bog/video/kit/computer): ");
            String type = input.nextLine().toLowerCase();

            //Teknisk set samme while loop som på linje 14, dog bruger vi type og dotOperateren equals,
            //som gør at hvis type ikke er lig med bog, video, kit eller computer, så printer den en fejl.
            while (!type.equals("bog") && !type.equals("video")
                    && !type.equals("kit") && !type.equals("computer"))
            {
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
                    System.out.println("\nKit Level (Beginner/Advanced):");
                    String kitLevel = input.nextLine().toLowerCase();

                    while (!kitLevel.equals("beginner") && !kitLevel.equals("advanced")) {
                        System.out.println("Fejl: Indtast venligst beginner eller advanced!");
                        kitLevel = input.nextLine().toLowerCase();
                    }
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
                    input.nextLine();
                    //Tilføjer input.nextline(); for at cleare bufferen så
                    // vi ikke modtager fejlbeskeden fra ovenstående while loop
                    library[i] = new video (title, type, currentLoanDays, duration);
                    break;
            }
        }
        System.out.println("Sorted Loan Items: \n" + "--------------------\n");
        return library;
    }
    }