package Övrigt;

import java.util.Random;

public class Memory {
    private static final int MB = 32;
    private static final int MEMORY_SIZE = MB*1000000;

    public static void main(String[] args) {
        printMemory();
    }

    // En metod som visuellt skriver ut ungefär hur datorns minne är uppbyggt.
    static void printMemory() {
        Random r = new Random();
        int adress = 0;
        double probabilityOne = 0.5;

        for(int i = 0; i <MEMORY_SIZE/4; i++){
            String s = "" + Integer.toHexString(adress) + ": ";
            adress += 4;
            for (int j = 0; j <32; j++){
                if(j%8==0)
                    s+=" ";
                s += r.nextDouble() < probabilityOne ? "1" : "0";
            }
            System.out.println(s);
        }
    }
}
