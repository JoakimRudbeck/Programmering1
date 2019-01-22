package kapitel4_Operatorer;
import java.util.Scanner;

public class Uppgifter {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        printFExempel();
        övning4_1();
        övning4_4();
    }

    static void övning4_4() {
        System.out.println("Skriv in ett tal, tack.");
        int mittTal = scanner.nextInt();
        int mittTalJusterat = mittTal + 500;
        // lägger på 500 för att avrundningen ska bli rätt.
        int mittTalDelatPåTusen = (mittTalJusterat / 1000);
        // kom ihåg, int dividerat med int blir int, decimalerna försvinner.
        int mittTalAvrundat = mittTalDelatPåTusen * 1000; // Lägger på tre nollor
        System.out.printf("Talet %d avrundat blir %d", mittTal, mittTalAvrundat);
    }

    static void printFExempel() {
        float a = 3.1415927f;
        int b = 5;
        int c = 7;
        // "vanliga sättet":
        System.out.println("a är "+a+" och b är "+b+" och c är "+c+".");
        // Samma sak men med print format:
        System.out.printf("a är %.2f och b är %d och c är %d.", a,b,c);
    }

    static void övning4_1() {
        System.out.println("Mata in antal månader");
        int totMånader = scanner.nextInt();
        int år = totMånader / 12;
        int månader = totMånader % 12;
        System.out.printf("År:%d, månader:%d", år, månader);
    }
}
