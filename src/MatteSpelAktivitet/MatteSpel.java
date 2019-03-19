package MatteSpelAktivitet;

import java.util.Scanner;

public class MatteSpel {
        static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Välkommen till matematikens underbara värld. Hur många spelare är ni?");
        int antalSpelare = Integer.valueOf(scanner.nextLine());
        String[] spelare = new String[antalSpelare];
        int[] poäng = new int[antalSpelare];
        for(int i = 0; i < spelare.length; i++){
            System.out.println("Vad heter spelare nummer " + (i+1) + "?");
            spelare[i] = scanner.nextLine();
            poäng[i] = 0;
        }
        while(true){
            for(int s = 0; s < spelare.length; s++) {
                System.out.println("Dags för spelare " + spelare[s]);

                int fråga = (int) (1.5 + Math.random());
                    switch (fråga) {
                        case 1:
                            poäng[s] += multiplikationsfråga();
                            break;
                        case 2:
                            poäng[s] += additionFråga();
                            break;
                    }
                System.out.printf("Spelare %s, %d poäng.", spelare[s], poäng[s]);
                System.out.println();
            }
            printStatus(spelare, poäng);   
        }
    }
    private static void printStatus(String[] spelare, int[] poäng) {
        System.out.println();
        System.out.println("##### POÄNGSTÄLLNING #####");
        for(int i = 0; i < spelare.length; i++){
            System.out.println("     " + spelare[i] + ", " + poäng[i] + " poäng.");
        }
        System.out.println("##########################");
        System.out.println();
    }
    private static int additionFråga() {
        int a = (int) (Math.random()*10);
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
    private static int multiplikationsfråga() {
        int a = (int) (Math.random()*10);
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