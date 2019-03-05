package kapitel09_Metoder;

public class MerExempel {

    public static void main(String[] args) {
        System.out.println(namnBaklänges("RUDBECK"));
    }

    static double geMigArean(double radie){
        return 3.14*radie*radie;
    }

    static double geMigVolymen(double radie, double höjd){
        return geMigArean(radie)*höjd;
    }

    // "JOAKIM" ska bli "MIKAOJ"
    static String namnBaklänges(String namnet){
        // vänd namnet
        String deomvändanamnet = "";
        for(int i = namnet.length() - 1; i >= 0; i--){
            deomvändanamnet += namnet.charAt(i);
        }
        // skicka tillbaka de vända namnet.
        return deomvändanamnet;
    }







}