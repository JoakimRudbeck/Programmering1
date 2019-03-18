package kapitel01_Grunder;

public class Program {
    public static void main(String[] args) {
        // Alla program startar i main-metoden.
        // Härifrån kan anrop göras till andra kodblock, så kallade metoder.

        // Metodanrop till metoden uppgiftABC().
        uppgiftABC();

        // Metodanrop till metoden enAnnanUppgift().
        enAnnanUppgift();
    }

    static void uppgiftABC(){
        System.out.println("Detta är kod inuti metoden uppgiftABC()");
    }

    // Att skriva variabelnamn eller metodnamn såhär: detHärEttVariabelNamn kallas att skriva i camelCase.
    static void enAnnanUppgift(){
        System.out.println("Detta är kod inuti metoden enAnnanUppgift()");
    }
}
