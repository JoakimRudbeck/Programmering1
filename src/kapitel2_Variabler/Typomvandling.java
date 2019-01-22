package kapitel2_Variabler;

import java.util.Scanner;

public class Typomvandling {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Hur gammal är du?");
        String ålderAsString = scan.nextLine();
        int ålder = Integer.valueOf("14");                          // Från string till int
        System.out.println("Du är " + ålder + " år gammal.");
        int a = (int) 5.9;                                          // Från double till int
        double d = 6d / 4;                                          // 6d är talet 6 som double
        System.out.println("d = " + d);
        String minSträng = "Kalle Anka";
        System.out.println(minSträng.length());                     // En sträng har en längd
        System.out.println(minSträng.indexOf('s'));                 // indexOf() ger indexet (positionen) där tecknet finns i strängen.
        System.out.println(minSträng.substring(0, 11));             // substring ger en delsträng av strängen
        String born = Integer.toString(2001);                    // Från int till String med hjälpklassen Integer
        System.out.println("a = " + a);
    }
}
