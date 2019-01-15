package kapitel4_Operatorer;
import java.util.Scanner;

public class Uppgifter {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        printFExempel();
        övning4_1();
    }

    private static void printFExempel() {
        float a = 3.1415926f;
        int b = 5;
        int c = 7;
        // "vanliga sättet":
        System.out.println("a är "+a+" och b är "+b+" och c är "+c+".");
        // Samma sak men med print format.
        System.out.printf("a är %.2f och b är %d och c är %d.", a,b,c);
    }

    private static void övning4_1() {
        System.out.println("Mata in antal månader");
        int totMånader = scanner.nextInt();
        int år = totMånader / 12;
        int månader = totMånader % 12;
        System.out.printf("År:%d, månader:%d", år, månader);
    }
}
