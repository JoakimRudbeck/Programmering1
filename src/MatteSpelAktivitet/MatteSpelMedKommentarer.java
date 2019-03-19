package MatteSpelAktivitet;

import java.util.Scanner;

public class MatteSpelMedKommentarer {
        static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Välkommen till matematikens underbara värld");
        System.out.println("Hur många spelare är ni?");
        int antalSpelare = Integer.valueOf(scanner.nextLine());                         // Frågar användaren hur många spelare som ska spela spelet.
        String[] spelare = new String[antalSpelare];                                    // Skapar en lista som ska spara namnet på varje spelare
        int[] poäng = new int[antalSpelare];                                            // Skapar en lika stor lista som ska spara poängen för varje spelare
        for(int i = 0; i < spelare.length; i++){                                        // En loop som gör så många varv som antal spelare.
            System.out.println("Vad heter spelare nummer " + (i+1) + "?");              // Frågar om namnet på spelare i
            spelare[i] = scanner.nextLine();                                            // Lagrar värdet på namnet i listan med spelare
            poäng[i] = 0;                                                               // Ger denna spelare startpoängen 0 poäng.
        }
        while(true){                                                                    // Gör detta för alltid:
            for(int s = 0; s < spelare.length; s++) {                                   // Loopar igenom varje spelare i listan med spelare.
                System.out.println("Dags för spelare " + spelare[s]);

                int fråga = (int) (1.5 + Math.random());                                // Beräknar ett slumptal 1 eller 2 som ska avgöra vilken fråga som ställs.
                    switch (fråga) {                                                    // Baserat på vad frågan blev.
                        case 1:
                            poäng[s] += multiplikationsfråga();                         // Ena fallet:
                            break;                                                      // Anropar multiplikationsfrågan och sparar poängen i listan med poäng.
                        case 2:
                            poäng[s] += additionFråga();                                // Andra fallet:
                            break;                                                      // Anropar additionsfrågan och sparar pängen i listan med poäng.
                    }
                System.out.printf("Spelare %s, %d poäng.", spelare[s], poäng[s]);       // Skriver ut spelarens namn och poäng.
                System.out.println();
            }
            printStatus(spelare, poäng);                                                // Anropar printStatus-metoden.          
        }
    }


    // Metod som presenterar den aktuella poängställningen
    private static void printStatus(String[] spelare, int[] poäng) {                    // Tar in 2 parametrar, en listan med spelare och en lista med motsv poäng.
        System.out.println();
        System.out.println("##### POÄNGSTÄLLNING #####");
        for(int i = 0; i < spelare.length; i++){                                        // För varje spelare i den inskickade spelare-listan
            System.out.println("     " + spelare[i] + ", " + poäng[i] + " poäng.");     // Skriver ut spelarens namn och poäng.
        }
        System.out.println("##########################");
        System.out.println();
    }



    // Metod som skapar en fråga på formen a+b och returnerar 1 om användaren har rätt och 0 om fel.
    private static int additionFråga() {
        int a = (int) (Math.random()*10);                   // Skapar 2 slumptal mellan 0 och 10.
        int b = (int) (Math.random()*10);
        System.out.printf("Vad blir %d + %d ? ", a,b);
        int svar = scanner.nextInt();
        if(svar == a+b){
            System.out.println("RÄTT!");
            return 1;
        }
        else{
            System.out.println("FEL");
            return 0;
        }
    }
    // Metod som skapar en fråga på formen a*b och returnerar 1 om användaren har rätt och 0 om fel.
    private static int multiplikationsfråga() {
        int a = (int) (Math.random()*10);                   // Skapar 2 slumptal mellan 0 och 10.
        int b = (int) (Math.random()*10);
        System.out.printf("Vad blir %d * %d ? ", a,b);
        int svar = scanner.nextInt();
        if(svar == a*b){
            System.out.println("RÄTT!");
            return 1;
        }
        else{
            System.out.println("FEL");
            return 0;
        }
    }
}