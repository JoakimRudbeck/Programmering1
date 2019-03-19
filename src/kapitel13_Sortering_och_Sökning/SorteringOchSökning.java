package kapitel13_Sortering_och_Sökning;

public class SorteringOchSökning {

    static int[] bubbelSortera(int[] lista){
        for(int i = lista.length - 1; i >= 0; i--){
            for(int j = 0; j < i; j++){         // Loopar igenom paren i listan.
                if(lista[j] > lista[j+1]){      // Om de vänstra värdet i paret är större än de högra.
                    int temp = lista[j+1];      // Sparar undan de högra (mindre) värdet.
                    lista[j+1] = lista[j];      // Lägger in de vänstra (större) värdet på den högra platsen i paret.
                    lista[j] = temp;            // Lägger in de undansparade högra (mindre) värdet på den vänstra platsen i paret.
                }
            }
        }
        return lista;

    }

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
        int min = 0;
        int max = lista.length -1;
        int index = -1;

        while(min <= max && index == -1){
            int mitten = (min+max)/2;
            if(sökVärde > lista[mitten]){
                min = mitten + 1;
            }
            else if(sökVärde > lista[mitten]){
                max = mitten - 1;
            }
            else{
                index = mitten;
            }
        }
        return index;
    }
}
