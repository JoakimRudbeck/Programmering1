package kapitel09_Metoder;

import java.util.Scanner;

public class Slump {

    public static void main(String[] args) {
        while(true){
            System.out.println((int) (1 + Math.random()*6));
        }
    }

    static void slumpaTal(){
        // Slumpa tal mellan 0 och 1 (1 exkl.)
        double slump1 = Math.random();

        // Slumpa tal mellan 1 och 6
        double slump2 = (int) (1 + Math.random()*6);

        // Math.random() ger värden mellan 0 och 1
        // Math.random()*k ger värden mellan 0 och k (dock lite mer spritt).

    }
    static void simuleraTärningskast() {
        System.out.println("Hur många gånger ska vi kasta tärningarna?");
        Scanner input = new Scanner(System.in);
        int antalKast = input.nextInt();
        int summa10 = 0;
        for(int i = 0; i < antalKast; i++){
            int summa = ((int)(1 + Math.random()*6)) + ((int)(1 + Math.random()*6)) + ((int)(1 + Math.random()*6));
            if(summa == 10){
                summa10++;
            }
        }
        double svar = (double)summa10/antalKast;
        System.out.println("Sannolikheten: " + svar);
    }
}
