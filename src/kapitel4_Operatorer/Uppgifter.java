package kapitel4_Operatorer;
import java.util.Scanner;

public class Uppgifter {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        float a = 3.1415926f;
        int b = 5;
        int c = 7;
        System.out.println("a är "+a+" och b är "+b+" och c är "+c+".");
        System.out.printf("a är %.2f och b är %d och c är %d.", a,b,c);

        System.out.println("c är " + c++);
        System.out.println(c);



    }

    private static void Övning4_1() {
        System.out.println("Mata in antal månader");
        int totMånader = scanner.nextInt();
        int år = totMånader / 12;
        int månader = totMånader % 12;
        System.out.printf("År:%d, månader:%d", år, månader);
        //System.out.println("År:" + år +", månader:" + månader);
    }
}
