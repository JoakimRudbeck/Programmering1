package kapitel2_Variabler;
import java.util.Scanner;

public class Inmatning {

    public static void main(String[] args) {
        scanner();

        merScanner();

    }

    private static void merScanner() {
        System.out.println("Vad heter du?");
        Scanner minSkanner = new Scanner(System.in);
        String namn = minSkanner.nextLine();
        System.out.println("Hur gammal är du?");
        String ålderAsString = minSkanner.nextLine();
        int ålder = Integer.valueOf(ålderAsString);
        System.out.println("Du är " + ålder + " år gammal.");
    }

    private static void scanner() {
        String s = "hej";
        Scanner minSkanner = new Scanner(System.in);
        System.out.println("Skriv in ett ord, tack:");
        String indata = minSkanner.nextLine();
        System.out.println("Du skrev " + indata);
        System.out.println("Skriv in ett tal, tack:");
        int tal = minSkanner.nextInt();
        System.out.println("Du skrev talet " + tal);
    }
}
