package Övrigt;

import java.util.Scanner;

public class Meny {

    // Ett program som körs om och om igen tills användaren skriver in ordet "SLUTA"
    public static void main(String[] args) {
        int[] a = {1,2,3};
        System.out.println(a[3]);
        Scanner scan = new Scanner(System.in);
        String input = "";
        while(!input.equals("SLUTA")){
            skrivUtMeny();
            input = scan.nextLine();
            switch(input){
                case "AREA":
                    beräknaArea(scan);
                    break;
                case "VOLYM":
                    beräknaVolym(scan);
                    break;
                case "SLUTA":
                    break;
                default:

                    System.out.println("Skriv in antingen AREA, VOLYM eller SLUTA.");
            }
        }
    }

    private static void skrivUtMeny() {
        System.out.println();
        System.out.println("Vad vill du göra?");
        System.out.println("\t[AREA]\t Beräkna area av rektangel");
        System.out.println("\t[VOLYM]\t Beräkna volym av rätblock");
        System.out.println("\t[SLUTA]\t Avsluta programmet");
    }

    static void beräknaArea(Scanner scan) {
        try{
            System.out.println("Rektangelns bas?");
            double bas = Double.valueOf(scan.nextLine());
            System.out.println("Rektangelns höjd?");
            double höjd = Double.valueOf(scan.nextLine());
            double area = bas * höjd;
            System.out.printf("Rektangelns area är %.1f area-enheter.\n",  area);
        }
        catch(NumberFormatException error){
            System.out.println("Du angav inte ett decimaltal med punkt som kommatecken.");
            System.out.println();
        }
    }

    static void beräknaVolym(Scanner scan) {
        try{
            System.out.println("Rätblockets bredd?");
            double bredd = Double.valueOf(scan.nextLine());
            System.out.println("Rätblockets djup?");
            double djup = Double.valueOf(scan.nextLine());
            System.out.println("Rätblockets höjd?");
            double höjd = Double.valueOf(scan.nextLine());
            double volym = bredd * djup * höjd;
            System.out.printf("Rätblockets volym är %.1f volym-enheter.\n", volym);
        }
        catch(NumberFormatException error){
            System.out.println("Du angav inte ett decimaltal med punkt som kommatecken.");
            System.out.println();
        }
    }
}
