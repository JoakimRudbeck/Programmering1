package kapitel08_Repetitionssatser;

import java.util.Scanner;

public class ForLoop {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        forLoopExempel();
        forLoopExempelFrågaAnvändaren();
        loopaIgenomEnLista();
        fyllaEnListaMedVärden();
        nestladForLoopExempel();
        besökaKöpCentret();

    }

    private static void forLoopExempel() {
        // En for-loop gör saker om och om igen.
        // For-loopen har en iterationsvariabel, ofta kallad i
        // For-loopen ändrar värdet på i efter varje varv i loopen
        // For-loopen måste veta hur länge den ska hålla på.

        // i är iterationsvariabeln
        // Loopen håller på så länge i är mindre än 5 (dvs 5 varv)
        // I slutet av varje varv ökar iterationsvariabeln i med 1.
        for(int i = 0; i < 5; i++){
            System.out.println("Värdet på iterationsvariabeln i är " + i);
        }
    }

    private static void forLoopExempelFrågaAnvändaren() {
        System.out.println("Startvärde?");
        int startVärde = Integer.valueOf(scan.nextLine());
        System.out.println("Slutvärde (inklusive)?");
        int slutVärdeInklusive = Integer.valueOf(scan.nextLine());
        System.out.println("Steg?");
        int steg = Integer.valueOf(scan.nextLine());

        for(int i = startVärde; i <= slutVärdeInklusive; i+=steg){
            System.out.println("Iterationsvaribeln i har värdet " + i + " i detta varvet av loopen.");
        }
        System.out.println("Nu är vi utanför loopen och denna rad körs nu :)");
    }

    private static void loopaIgenomEnLista() {
        String[] lista = {"mango", "äpple", "banan"};
        for(int i = 0; i < lista.length; i++){
            System.out.print("Inne i loopen, varv " + (i+1));
            System.out.println("Värde i listan:" + lista[i]);
        }
        System.out.println("Nu är vi utanför loopen");
    }

    private static void fyllaEnListaMedVärden() {
        // Skapar en lista av strängar med 5 platser:
        String[] listaAvSträngar = new String[5];

        // Skapar en loop som gör lika många varv som antal platser i listan av strängar:
        for(int i = 0; i < listaAvSträngar.length; i++){    // i börjar på 0 och kommer anta värdena 0,1,2,3,4.
            System.out.println("Skriv in ett ord som du vill lägga in på index " + i + " i listan:");
            listaAvSträngar[i] = scan.nextLine(); // Lägger in värdet som användaren skriver in i listan på den plats vars index är i.
        }

        // For loopen ovan gör precis följande fast på bara 3 rader kod.
        /*
        listaAvSträngar[0] = scan.nextLine();
        listaAvSträngar[1] = scan.nextLine();
        listaAvSträngar[2] = scan.nextLine();
        listaAvSträngar[3] = scan.nextLine();
        listaAvSträngar[4] = scan.nextLine();
        */

        // Loopar igenom hela listan och skriver ut resp värde i listan:
        for(int i = 0; i < listaAvSträngar.length; i++){  // i kommer även i denna loop anta värdena 0,1,2,3,4
            System.out.println("Ordet på index " + i + " i listan är: " + listaAvSträngar[i]);
        }
    }

    private static void nestladForLoopExempel() {
        // Skriver ut alla koordinater i första kvadranten från origo till punkten (9,9)
        for(int y = 9; y >= 0; y--){
            for(int x = 0; x <= 9; x++){
                System.out.printf("(%d,%d)\t", x,y);
            }
            System.out.println();
        }

    }

    private static void besökaKöpCentret() {
        // Besöker varje våning v:
        for(int v = 1; v <= 6; v++){
            // Besöker varje affär a
            for(int a = 1; a <= 4; a++){
                System.out.println("Är på våning " + v + ", vid affär " + a);
            }
        }
    }


}
