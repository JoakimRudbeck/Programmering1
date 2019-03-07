package kapitel09_Metoder;

public class Slump {

    public static void main(String[] args) {
    }

    static void slumpaTal(){
        // Slumpa tal mellan 0 och 1 (1 exkl.)
        double slump1 = Math.random();

        // Slumpa tal mellan 1 och 6
        double slump2 = (int) (1 + Math.random()*6);

        // Math.random() ger värden mellan 0 och 1
        // Math.random()*k ger värden mellan 0 och k (dock lite mer spritt).

    }
}
