package kapitel08_Repetitionssatser;

public class While {

    public static void main(String[] args) {
        //whileLoopExempel();
        doWhileExempel();
    }

    private static void doWhileExempel() {
        long start = System.currentTimeMillis();
        do{
            System.out.println("Gör detta så länge det inte gått mer än 10 sek sedan start.");
            System.out.println("Antal millisekunder sedan 1 jan 1970: " + System.currentTimeMillis());
        }
        while(System.currentTimeMillis() - start < 10*1000 );
        System.out.println("Nu har vi kommit ut ur do-while-loopen");
    }

    static void whileLoopExempel() {
        int räknare = 0;
        while(räknare < 10){    // Gör följande så länge räknare är mindre än 10
            System.out.println("Räknarens värde är mindre än 10.");
            räknare ++;
        }

        System.out.println("Nu avlsutades tydligen while-loopen och denna rad kan äntligen köras!");
    }
}
