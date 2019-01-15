package kapitel2_Variabler;

import java.util.Scanner;

public class Typomvandling {

    public static void main(String[] args){
        Scanner minSkanner = new Scanner(System.in);
        System.out.println("Hur gammal är du?");
        String ålderAsString = minSkanner.nextLine();
        int ålder = Integer.valueOf("14");
        System.out.println("Du är " + ålder + " år gammal.");
        int a = (int) 5.9;
        double d = 6d / 4;
        System.out.println("d = " + d);
        String minSträng = "Kalle Anka";
        System.out.println(minSträng.length());
        System.out.println(minSträng.indexOf('s'));
        System.out.println(minSträng.substring(0, 11));
        String born = Integer.toString(2001);
        System.out.println("a = " + a);
    }
}
