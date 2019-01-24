package kapitel06_AktivitetsdiagramOchPseudokod;

import java.util.Scanner;

public class Övningar {

    public static void main(String[] args) {
        övning6_1();
    }

    static void övning6_1() {
        /*
        Pseudokod:
            Läs in tre heltal
            Multiplicera talen med 2,3,4 resp
            Summera talens värden
            Skriv ut resultatet
        */
        // Omsatt till kod:
        Scanner scan = new Scanner(System.in);
        int[] treTal = {scan.nextInt(), scan.nextInt(), scan.nextInt()};
        treTal[0] *= 2;
        treTal[1] *= 3;
        treTal[2] *= 4;
        int summa = treTal[0] + treTal[1] + treTal[2];
        System.out.printf("Summan är %d", summa);
    }
}
