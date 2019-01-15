package Kapitel5_Debugging;

import java.util.Scanner;

public class Debugging {

    public static void main(String[] args) {
        debuggingExempel();
        //scanner();
    }

    static void deriveraPolynom(){
        Scanner scanner = new Scanner(System.in);

    }



    static void scanner(){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s);
    }


    static void debuggingExempel(){
        String[] minLista;
        System.out.println("Välkommen till mig!");
        minLista = new String[4];
        System.out.println("Nu ska här läggas in värden i en lista");
        minLista[1] ="hej";
        minLista[2] ="tjena";
        minLista[2] ="hello";
        minLista[3] ="tjenixen";
        System.out.println(minLista[0]);
        System.out.println(minLista[1]);
        System.out.println(minLista[2]);
        System.out.println(minLista[3]);
    }




















    private static void debugging0() {
        int a = 12;
        int b = 45;
        int c = 13;
        a = b*a - c;
        b = -(a+b);
        c = a*b;
        System.out.printf("a = %d",a);
        System.out.printf("b = %d",b);
        System.out.printf("c = %d",c);
    }


}
