package kapitel04_Operatorer;

import java.util.Scanner;

public class Övningar {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        övning4_2();
        övning4_4();
    }

    private static void övning4_2() {
        System.out.println("Övning 4.2");
        // Fråga användaren efter ett tal i månader
        System.out.println("Skriv in antal månader:");
        // Spara svaret som en int med namnet x
        int x = scanner.nextInt();
        // Beräkna resten genom att ta x % 12
        int rest = x % 12;
        // Beräkna hela år genom att ta x / 12
        int helaÅr = x / 12;
        // Skriv ut svaret.
        System.out.print(x + " månader är " + helaÅr + " år");
        System.out.println(" och " + rest + " månader.");
    }

    private static void övning4_4() {
        System.out.println("Övning 4.4");
        int tal = 5;
        System.out.print(tal--);  // denna rad skriver först ut 5 och sedan minskar den värdet på tal till 4.
        System.out.print(tal);    // denna rad skriver ut 4 eftersom tal nu har värdet 4.
        System.out.print(--tal);  // denna rad minskar först tal till 3 (från 4) och sedan skriver ut tal som är 3.
        System.out.println(tal);  // denna rad skriver ut 3 eftersom tal nu är 3.
        // D.v.s. skriver ut 5433
    }
}
