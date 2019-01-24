package kapitel7_if_satser;

import java.util.Scanner;

public class SwitchCase {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        switchCaseExempel();
    }

    private static void switchCaseExempel() {
        System.out.println("Hur mår du idag?");
        String humör = scanner.nextLine();
        switch(humör){
            case "Bra":
                System.out.println(":)");
                break;
            case "Super":
                System.out.println(":D");
                break;
            case "Dåligt":
                System.out.println(":(");
                break;
            default:
                System.out.println("Jag kan inte tyda ditt humör");
                break;

        }
        System.out.println("Denna rad körs efter switch-case");
    }
}
