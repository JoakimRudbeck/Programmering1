package MatteSpelAktivitet;

import java.util.Scanner;

public class Klass {
        static Scanner s = new Scanner(System.in);


    public static void main(String[] args) {
        int a = Integer.valueOf(s.nextLine());

        String[] p = new String[a];
        int[] f = new int[a];
        for(int i = 0; i < p.length; i++){
            p[i] = s.nextLine();
            f[i] = 0;
        }

        while(true){
            for(int s = 0; s < p.length; s++) {
                int r = (int) (1.5 + Math.random());
                    switch (r) {
                        case 1:
                            f[s] += mf();
                            break;
                        case 2:
                            f[s] += af();
                            break;
                    }
            }
            ps(p, f);
            
        }

    }

    private static void ps(String[] s, int[] p) {
        System.out.println();
        System.out.println("##### POÄNGSTÄLLNING #####");
        for(int i = 0; i < s.length; i++){
            System.out.println("     " + s[i] + ", " + p[i] + " poäng.");
        }
        System.out.println("##########################");
        System.out.println();
    }

    private static int af() {
        int a = (int) (Math.random()*10);
        int b = (int) (Math.random()*10);
        System.out.printf("Vad blir %d + %d ? ", a,b);
        int q = s.nextInt();
        if(q == a+b){
            System.out.println("RÄTT!");
            return 1;
        }
        else{
            System.out.println("FEL");
            return 0;
        }
    }

    private static int mf() {
        int a = (int) (Math.random()*10);
        int b = (int) (Math.random()*10);
        System.out.printf("Vad blir %d * %d ? ", a,b);
        int q = s.nextInt();
        if(q == a*b){
            System.out.println("RÄTT!");
            return 1;
        }
        else{
            System.out.println("FEL");
            return 0;
        }
    }

}
