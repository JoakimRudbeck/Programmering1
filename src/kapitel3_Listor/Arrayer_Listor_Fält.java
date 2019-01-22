package kapitel3_Listor;

import java.util.Scanner;

public class Arrayer_Listor_Fält {

    public static void main(String[] args) {
        frukter();
        bytaPlatsPåTvåElementILista();
        antalOrdIMening();
        permutationer();
        listorIListor();
        vilkenMeningÄrStörst();
    }

    private static void frukter() {
        // Skapar en lista med 3 element.
        String[] minaFrukter = new String[3];
        minaFrukter[0] = "Banan";
        minaFrukter[1] = "Äpple";
        minaFrukter[2] = "Apelsin";
        String[] minFruktKorg = {"Banan", "Äpple", "Apelsin"};
        System.out.println("Första frukten är " + minFruktKorg[0]);
        System.out.println("Andra frukten är " + minFruktKorg[1]);
        System.out.println("Tredje frukten är " + minFruktKorg[2]);
    }

    private static void bytaPlatsPåTvåElementILista() {
        int[] lista = {3,5};
        System.out.println("Värdena innan = " + lista[0] + "," + lista[1]);
        int temp = lista[0];        // Sparar undan det första värdet i en variabel.
        lista[0] = lista[1];        // Lägger in det andra värdet på platsen för det första värdet.
        lista[1] = temp;            // Lägger in undansparade värdet på det andra värdets plats.
        System.out.println("Värdena efter = " + lista[0] + "," + lista[1]);
    }

    // Räknar ut hur många ord det finns i en mening.
    static void antalOrdIMening(){
        Scanner minScanner = new Scanner(System.in);
        System.out.println("Skriv in en mening, tack.");
        String mening = minScanner.nextLine();
        // Delar upp meningen genom att splitta på mellanslag
        String[] ordIMening = mening.split(" ");
        System.out.println("'" + mening + "' har " + ordIMening.length + " ord i sig.");
    }

    static void listorIListor(){
        int[] lista1 = {1,2,3};
        int[] lista2 = {4,5,6};
        int[] lista3 = {7,8,9};
        int[][] tvåDimLista = {lista1, lista2, lista3};
        System.out.println(tvåDimLista[2][1]);
    }

    // Detta är uppgiften om permutationer
    static void permutationer(){
        // Skapar en lista med 3 platser
        String[] lista = new String[3];
        System.out.println("Skriv in 3 ord, tack:");
        Scanner minScanner = new Scanner(System.in);
        String a = minScanner.nextLine();
        System.out.println("a = " + a);
        String b = minScanner.nextLine();
        System.out.println("b = " + b);
        String c = minScanner.nextLine();
        System.out.println("c = " + c);
        String[] minaOrd1 = {a, b, c};
        String[] minaOrd2 ={a,c,b};
        String[] minaOrd3 ={b,a,c};
        String[] minaOrd4 ={b,c,a};
        String[] minaOrd5 ={c,a,b};
        String[] minaOrd6 ={c,b,a};
    }

    static void vilkenMeningÄrStörst(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv in mening 1, tack:");
        String mening1 = scanner.nextLine();
        System.out.println("Skriv in mening 2, tack:");
        String mening2 = scanner.nextLine();
        int längdMening1 = mening1.length();
        int längdMening2 = mening2.length();
        if(längdMening1 > längdMening2){
            System.out.println(mening1 + " har fler ord än " + mening2);
        }
        else{
            System.out.println(mening2 + " har fler ord än " + mening1);
        }
    }

}
