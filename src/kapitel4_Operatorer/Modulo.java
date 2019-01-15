package kapitel4_Operatorer;

import java.util.Scanner;

public class Modulo {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        vadÄrKlockan();
    }

    private static void vadÄrKlockan() {
        System.out.println("Hur mycket är klockan?");
        String klockslag = scanner.nextLine();
        String[] klockslagUppdelat = klockslag.split(":");
        System.out.println("Längden av min lista är " + klockslagUppdelat.length);
        System.out.println("Timmar = " + klockslagUppdelat[0]);
        System.out.println("Minuter = " + klockslagUppdelat[1]);
    }
}
