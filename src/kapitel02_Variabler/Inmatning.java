package kapitel02_Variabler;
import java.util.Scanner;

public class Inmatning {

    public static void main(String[] args) {
        scanner();
        merScanner();
    }

    private static void scanner() {
        Scanner minSkanner = new Scanner(System.in);
        System.out.println("Skriv in ett ord, tack: ");
        String indata = minSkanner.nextLine();
        System.out.println("Du skrev " + indata);
        System.out.println("Skriv in ett heltal, tack: ");
        int tal = minSkanner.nextInt();
        System.out.println("Du skrev talet " + tal);
    }

    private static void merScanner() {
        System.out.println("Vad heter du?");
        Scanner minSkanner = new Scanner(System.in);            // Skapar ett Scanner-objekt
        String namn = minSkanner.nextLine();                    // Läser in en rad skriven från tangentbordet
        System.out.println("Hur gammal är du?");
        String ålderAsString = minSkanner.nextLine();           // Läser in en till rad från tangentbordet.
        int ålder = Integer.valueOf(ålderAsString);             // Typomvandling från String till int med hjälpklassen Integer.
        System.out.println("Du heter " + namn + " och är " + ålder + " år gammal.");
    }
}
