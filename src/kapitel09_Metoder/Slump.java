package kapitel09_Metoder;

public class Slump {

    public static void main(String[] args) {
        slumpaTal();
        //slumpa4ever();
        simuleraYatzy();
    }

    static void slumpaTal(){
        // Slumpa tal mellan 0 och 1 (1 exkl.)
        double slump1 = Math.random();
        System.out.println(slump1);

        // Slumpa tal mellan 1 och 6
        int slump2 = (int) (1 + Math.random()*6);
        System.out.println(slump2);

        // Math.random() ger värden mellan 0 och 1
        // Math.random()*k ger värden mellan 0 och k (dock lite mer spritt).

    }

    static void slumpa4ever(){
        while(true){
            System.out.println(Math.random());
        }
    }


    static void simuleraYatzy(){
        int antalSimuleringar = 1000000;
        int antalYatzy = 0;
        for(int i = 0; i < antalSimuleringar; i++){
            int tärning1 = (int) (1 + Math.random()*6);
            int tärning2 = (int) (1 + Math.random()*6);
            int tärning3 = (int) (1 + Math.random()*6);
            int tärning4 = (int) (1 + Math.random()*6);
            int tärning5 = (int) (1 + Math.random()*6);
            if(tärning1 == tärning2 && tärning2 == tärning3 && tärning3 == tärning4 && tärning4 == tärning5){
                antalYatzy++;
            }
        }
        System.out.printf("Av %d kast blev det %d YATZY (%.2f procent)", antalSimuleringar, antalYatzy, 100*(float)antalYatzy/antalSimuleringar);
    }

}
