package kapitel2_Variabler;

import java.util.Random;

public class IntegersAndBytes {
    private static final int MEMORY_SIZE = 100;

    public static void main(String[] args) {
        printMemory();
    }

    private static void printMemory() {
        Random r = new Random();
        int adress = 1024451;

        for(int i = 0; i <MEMORY_SIZE; i++){
            String s = "" + Integer.toHexString(adress) + ": ";
            adress += 4;
            for (int j = 0; j <32; j++){
                if(j%8==0)
                    s+=" ";
                s += r.nextDouble() < 0.5 ? "0" : "1";
            }
            System.out.println(s);
        }
    }
}
