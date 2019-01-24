package kapitel7_if_satser;

import java.util.Scanner;

public class IfSatser {

    public static void main(String[] args) {
        //ifSats();
        //ifElseSats();
        //ifElseIfElseSats();
        //equalsExempel();
    }


    static void ifSats() {
        int a = 13;
        if(a < 10){
            System.out.printf("%d är mindre än 10.",a);
        }
        System.out.println("Denna kod körs oavsett, den ligger efter if-satsen.");
    }

    static void ifElseSats() {
        int a = 5;
        int b = 3;
        if(a == b){
            System.out.printf("%d är lika med %d",a,b);
        }
        else{
            System.out.printf("%d är inte lika med %d",a,b);
        }
        // Nu är hela if-else-satsen slut. All kod nedan kommer köras.
        System.out.println("Denna körs alltid.");
    }

    static void ifElseIfElseSats() {
        int ålder = 15;
        // Koden kommer bara gå in i en av dessa kodblock.
        // Om ålder är 15 så kommer den gå in i första blocket men inte nästa trots att 15 < 65.
        if(ålder < 18){
            System.out.println("Du är ett barn.");
        }
        else if(ålder < 65){
            System.out.println("Du är vuxen.");
        }
        else{
            System.out.println("Du är i pensionsålder.");
        }

        // Här är hela if-satsen slut. All kod nedan kommer alltid att köras
        // förutsatt att vi inte får ett exekveringsfel innan :)
    }
    private static void equalsExempel() {
        Scanner scanner = new Scanner(System.in);
        String hej = scanner.nextLine();
        if(hej.equals("hej")){
            System.out.println("Inuti if-satsen.");
        }
        else{
            System.out.println("Gick inte in i if-satsen");
        }
    }
}
