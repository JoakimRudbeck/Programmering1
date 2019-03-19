package kapitel13_Sortering_och_Sökning;

public class Bubbelsortering {

    public static void main(String[] args) {
        bubbelSortering();
    }

    private static void bubbelSortering() {
        int[] osorterad = new int[]{3,7,2,1,0,-34,128,-4,7};    // Osorterad lista
        String utdata = "";
        for(int i = 0; i < osorterad.length; i++){
            utdata +="," + osorterad[i];
        }
        System.out.println("Listan innan: " + utdata.substring(1));

        int[] sorterad = bubbelSortera(osorterad);              // Sorterad lista
        utdata = "";
        for(int i = 0; i < sorterad.length; i++){
            utdata +="," + sorterad[i];
        }
        System.out.println("Listan efter: " + utdata.substring(1));
    }

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
}

