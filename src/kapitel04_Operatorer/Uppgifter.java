package kapitel04_Operatorer;
import java.util.Scanner;

public class Uppgifter {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        uppgift4_2();
        uppgift4_4();
    }

    private static void uppgift4_2() {
        System.out.println("Uppgift 4.2");
        System.out.println("Skriv in ett heltal");
        int tal = scanner.nextInt();
        int ursprungliga = tal;
        tal++;
        tal*=2;
        tal-=6;
        tal/=2;
        tal+=3;
        tal-= ursprungliga;
        System.out.println(tal);
        if(tal == 1){ // Överkurs men vi kommer gå igenom if-satser senare...
            System.out.println("Det stämde att det blev ett till slut :)");
        }
    }


    static void uppgift4_4() {
        System.out.println("Skriv in ett fyrsiffrigt tal, tack.");
        int mittTal = scanner.nextInt();
        int mittTalJusterat = mittTal + 500;
        // lägger på 500 för att avrundningen ska bli rätt.
        int mittTalDelatPåTusen = (mittTalJusterat / 1000);
        // kom ihåg, int dividerat med int blir int, decimalerna försvinner.
        int mittTalAvrundat = mittTalDelatPåTusen * 1000; // Lägger på tre nollor
        System.out.printf("Talet %d avrundat blir %d", mittTal, mittTalAvrundat);
    }




}
