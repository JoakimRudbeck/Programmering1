package kapitel08_Repetitionssatser;

public class DoWhileLoop {

    public static void main(String[] args) {
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
}
