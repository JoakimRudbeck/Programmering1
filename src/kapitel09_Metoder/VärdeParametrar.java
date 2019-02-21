package kapitel09_Metoder;


public class VärdeParametrar {

    public static void main(String[] args) {
        System.out.println(hypotenusan(3,4));
        System.out.println(multipliceraTal(new double[]{3,5,7,8,23,34,5}));
        bytaPlatsPåFörstaOchSista(new String[]{"Hej", "Hello", "Guten Tag"});
    }

    static double hypotenusan(double k1, double k2){
        return Math.sqrt(Math.pow(k1,2) + Math.pow(k2,2));
    }

    private static void bytaPlatsPåFörstaOchSista(String[] minSträng) {
        String temp = minSträng[0];
        minSträng[0] = minSträng[2];
        minSträng[2] = temp;
    }

    static double multipliceraTal(double[] talen){
        double produkt = 1;
        // Går igenom listan var och en för sig
        for(int i = 0; i<talen.length; i++){
            produkt*=talen[i]; // multiplicerar på med tal till produkt
        }
        // skicka iväg svaret.
        return produkt;
    }

    static void swapPlaces(int[] lista){
        int temp = lista[0];
        lista[0] = lista[1];
        lista[1] = temp;
    }

}
