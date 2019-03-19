package kapitel13_Sortering_och_Sökning;

public class Bubbelsortering {

    public static void main(String[] args) {
        bubbelSortering();
    }

    static void bubbelSortering() {
        int[] osorterad = new int[]{3,7,2,1,0,-34,128,-4,7};    // Osorterad lista
        System.out.println("Listan innan: " + snyggUtskriftAvElementILista(osorterad));
        int[] sorterad = SorteringOchSökning.bubbelSortera(osorterad);              // Sorterad lista
        System.out.println("Listan efter: " + snyggUtskriftAvElementILista(sorterad));
    }

    private static String snyggUtskriftAvElementILista(int[] sorterad) {
        String utdata = "";
        for (int i = 0; i < sorterad.length; i++) {
            utdata += "," + sorterad[i];
        }
        return utdata.substring(1);
    }

}