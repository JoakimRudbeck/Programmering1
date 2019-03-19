package KapitelY_Felsökning;

import java.util.Scanner;

public class FelSökning {

    public static void main(String[] args) {
        felsökningExempel();
    }

    private static void felsökningExempel() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Namn: ");
        String namn = scan.nextLine();
        System.out.println("Ålder: ");
        try {
            int ålder = Integer.valueOf(scan.nextLine());
        }

        catch(NumberFormatException nfe){
            System.out.println("Något blev fel: " + nfe.getMessage());
    }




    }
}
