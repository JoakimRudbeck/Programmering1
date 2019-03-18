package kapitel13_Sortering_och_Sökning;

public class SorteringOchSökning {

    // Metod som söker efter ett värde i en lista
    // returnerar indexet för det sökta värdet
    // returnerar -1 om det sökta värdet inte finns i listan
    static int sekventiellSökning(int[] lista, int sökVärde){
        for(int i = 0; i < lista.length; i++){
            if(lista[i] == sökVärde){
                return i;
            }
        }
        return -1;
    }

    static int binärSökning(int[] lista, int sökVärde){
        // TODO
        return -1;
    }
}
