package kapitel4_Operatorer;

import java.util.Scanner;

public class Operatorer {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        moduloExempel();
        tilldelandeOperator();
        ökaMedEttExempel();
    }

    static void moduloExempel() {
        System.out.println("Skriv in antal minuter");
        int antalMinuter = scanner.nextInt();
        int minuter = antalMinuter % 60;
        int antalTimmar = antalMinuter / 60; // int dividerat med int ger en int, decimalerna försvinner
        System.out.println("Timmar = " + antalTimmar +", minuter = " + minuter);
        System.out.println(17 % 5); // 17 % 5 ger TVÅ eftersom 17 / 5 = 3 hela och TVÅ femtedelar.
    }

    static void tilldelandeOperator() {
        int a = 5;
        System.out.println("Vad vill du plussa med?");
        int plussa = scanner.nextInt();
        a += plussa; // Samma sak som a = a + plussa;
        System.out.println(a);
        // fungerar även med -= /= och *=
    }

    static void ökaMedEttExempel() {
        int b = 5;
        System.out.println(b);
        System.out.println(++b); // pre-fix, ökar på en gång.
        System.out.println(b);
        System.out.println(b++); // post-fix, ökar efteråt.

        // 4 sätt att öka en variabels värde med 1:
        int a = 5;
        a = a + 1;
        a += 1;
        a++;  // Postfix
        ++a;  // Prefix
    }

}
