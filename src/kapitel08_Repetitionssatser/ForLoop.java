package kapitel08_Repetitionssatser;

public class ForLoop {

    public static void main(String[] args) {
        forLoopExempel();
        whileLoopExempel();
        nestladForLoopExempel();

    }

    private static void nestladForLoopExempel() {

    }

    private static void whileLoopExempel() {

    }

    private static void forLoopExempel() {
        // En for-loop gör saker om och om igen.
        // For-loopen har en iterationsvariabel, ofta kallad i
        // For-loopen ändrar värdet på i varje varv i loopen
        // For-loopen måste veta hur länge den ska hålla på.

        // i är iterationsvariabeln
        // Loopen håller på så länge i är mindre än 5 (dvs 5 varv)
        // I slutet av varje varv ökar iterationsvariabeln i med 1.
        for(int i = 0; i < 5; i++){
            System.out.println("Värdet på iterationsvariabeln i är " + i);
        }
    }
}
