package kapitel4_Operatorer;

import java.util.Scanner;

public class Operatorer {
    static Scanner scanner = new Scanner(System.in);

    // Övning 4.1 + 4.2 + 4.3

    public static void main(String[] args) {
        //moduloExempel();
        //tilldelandeOperator();
        ÖkaMedEttExempel();


    }




    private static void ÖkaMedEttExempel() {
        int b = 5;
        System.out.println(b);
        System.out.println(++b);
        System.out.println(b);
        int a = 5;
        a = a + 1;
        a+=1;
        a++;  // Postfix
        ++a;  // Prefix

    }

    private static void tilldelandeOperator() {
        int a = 5;
        System.out.println("Vad vill du plussa med?");
        int plussa = scanner.nextInt();
        a += plussa; // Samma sak som a = a + plussa;
        System.out.println(a);
    }

    static void moduloExempel() {

        System.out.println("Skriv in antal minuter");
        int antalMinuter = scanner.nextInt();
        int minuter = antalMinuter % 60;
        int antalTimmar = antalMinuter / 60;
        System.out.println(
                "Timmar = " + antalTimmar +
                        ", minuter = " + minuter);

        System.out.println(12 % 5);
    }


}
