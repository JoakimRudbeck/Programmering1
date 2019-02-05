package kapitel08_Repetitionssatser;

public class While {

    public static void main(String[] args) {
        whileLoopExempel();
    }


    static void whileLoopExempel() {
        // En while loop gör saker om och om igen så länge ett villkor är sant.
        int räknare = 0; // En räknare vars värde kommer vara avgörande för när while-loopen ska ta slut.
        while(räknare < 10){    // Gör följande så länge räknarena värde är mindre än 10:
            System.out.println("Räknarens värde är " + räknare + " vilket är mindre än 10.");
            räknare ++; // Uppdatera räknaren så att den så småningom kommer göra att villkoret blir falskt.
        }

        System.out.println("Nu avlsutades while-loopen eftersom villkoret inte längre är sant.");
    }
}
