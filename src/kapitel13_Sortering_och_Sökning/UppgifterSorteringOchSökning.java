package kapitel13_Sortering_och_Sökning;

import java.util.Scanner;

public class UppgifterSorteringOchSökning {

    public static void main(String[] args) {
        ovning1();
    }

    static void ovning1(){
        // Skapa scanner
        Scanner scan = new Scanner(System.in);
        int antalTal = 11;
        int[] osorteradLista = new int[antalTal];
        // Läs in 11 tal i en lista:
        for(int i = 0; i < osorteradLista.length; i++){
            osorteradLista[i] = scan.nextInt();
        }
        // sortera listan:
        int[] sorteradLista = SorteringOchSökning.bubbelSortera(osorteradLista);
        // Skriv ut varje värde i den sorterade listan.
        for(int i = 0; i < osorteradLista.length; i++){
            System.out.println(osorteradLista[i]);
        }
    }
}
