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
        items.loanItems(count, input);
    }

    //tager imod antal udlån
    public static int getCount(Scanner input){
        int count = 0;
        count = input.nextInt();
        return count;
    }




}
