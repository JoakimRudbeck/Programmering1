package kapitel03_Listor;

import java.util.Scanner;

public class Övningar {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //övning3_1();
        övning3_2();
    }

    private static void övning3_2() {
        int[] treTal = new int[3];
        System.out.println("Skriv in tal 1:");
        treTal[0] = scanner.nextInt();
        System.out.println("Skriv in tal 2:");
        treTal[1] = scanner.nextInt();
        System.out.println("Skriv in tal 3:");
        treTal[2] = scanner.nextInt();

        // byter plats på första och sista:
        int temp = treTal[0];
        treTal[0] = treTal[2];
        treTal[2] = temp;
        System.out.println("Talen i omvänd ordning:");
        System.out.println(treTal[0]);
        System.out.println(treTal[1]);
        System.out.println(treTal[2]);
    }

    private static void övning3_1() {
        int[] minaTal = new int[4];
        minaTal[0] = scanner.nextInt();
        minaTal[1] = scanner.nextInt();
        minaTal[2] = scanner.nextInt();
        minaTal[3] = scanner.nextInt();
        System.out.println("Talen i listan är:");
        System.out.print(minaTal[0] + ",");
        System.out.print(minaTal[1]+ ",");
        System.out.print(minaTal[2]+ ",");
        System.out.print(minaTal[3]+ ".");
    }
}
