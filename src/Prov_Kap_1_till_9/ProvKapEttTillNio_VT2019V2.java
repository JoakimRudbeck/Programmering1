package Prov_Kap_1_till_9;

public class ProvKapEttTillNio_VT2019V2 {

    public static void main(String[] args) {
        uppgift1_4poäng();
        uppgift2_4poäng();
        uppgift3_4poäng();
        uppgift4_4poäng();
        uppgift5_6poäng();
        uppgift6_6poäng();
        uppgift7_8poäng();
    }


    private static void uppgift1_4poäng() {
    /*
        UPPGIFT 1: Är talet delbart med?                                            4 POÄNG

        Fråga användaren efter två tal, t1 och t2. t1 står för tal och t2 står för delare.
        Skapa en metod static boolean ärTalDelbartMed(int tal, int delare) som givet ett tal och en delare
        returnerar true om tal är jämnt delbart med delare och false om tal inte är jämnt delbart med delare.
        Anropa din nyligen skapade metod och skriv en informerande text som anger om talet som användaren skrev in
        är delbart med eller inte delbart med den delare som användaren skrev in.

        Körexempel:
        Skriv in ett tal, tack:
        125
        Skriv in en delare, tack:
        5
        125 är jämnt delbart med 5.

     */
    }

    private static void uppgift2_4poäng() {
    /*
        UPPGIFT 2: Skriva ut en given sekvens                                       4 POÄNG

        Använd någon typ av loop för att skriva ut följande:
        88 86 84.007 82 X 78 76 74.007 72 X 68 66 64.007 62 X 58 56 54.007 52

     */
    }

    private static void uppgift3_4poäng() {
    /*
        UPPGIFT 3: Beräkning av summan och medelvärdet i en lista                   4 POÄNG

        Fråga användaren hur många tal som ska skapas.
        Skapa en lista med anbefallt antal heltal.
        Skapa en metod static int summaAvTal(int[] lista) som beräknar summan av alla tal i en lista.
        Anropa metoden summaAvTal(int[] lista) med din lista som parameter och skriv ut summan.
        Skapa en metod static double medelvärde(int[] lista) som beräknar medelvärdet av alla tal i en lista.
        Anropa metoden medelvärde(int[] lista) med din lista som parameter och skriv ut medelvärdet.

     */
    }

    private static void uppgift4_4poäng() {
    /*
        UPPGIFT 4: Beräkna tecken i sträng                                          4 POÄNG

        Skapa en metod med lämpligt metodnamn som tar två parametrar; en sträng text och ett tecken tecken.
        Metoden ska returnera produkten av antal gånger som tecken förekommer i text och
        det totala antalet tecken som finns i text.

        Exempel:
        Parametrarna text = “stina sopar skorpsmulor” och tecken = ‘p’ ska returnera 92 eftersom det finns 4 st ‘p’ och 23 tecken totalt (23*4 = 92).

     */
    }

    private static void uppgift5_6poäng() {
    /*
        UPPGIFT 5: Simulering med tärning                                           6 POÄNG

        Beräkna, med hjälp av att simulera minst 10.000 försök,
        sannolikheten att få exakt 2 femmor när du kastar 4 st tiosidiga tärningar.

     */
    }

    private static void uppgift6_6poäng() {
    /*
        UPPGIFT 6:  Rövarspråket                                                    6 POÄNG

        Skapa en metod static String rövarSpråk(String text) som tar en sträng som parameter och
        som returnerar strängen skriven i rövarspråket.
        Regeln för rövarspråket är att man efter varje konsonant lägger ett ‘o’ och därefter samma konsonant igen.
        Till exempel byts b ut mot "bob" och f mot "fof". Vokalerna är oförändrade.
        "Jag talar rövarspråket" blir alltså "JOJagog totalolaror rorövovarorsospoproråkoketot".

        Bokstäverna a, e, i, o, u, y, å, ä, ö är vokaler.
        Konsonanter är alla bokstäver som inte är vokaler.

     */
    }

    private static void uppgift7_8poäng() {
    /*
        UPPGIFT 7: Skriv ut Java-klass                                              8 POÄNG

        Skriv en metod med signaturen static void skrivUtKlass(String paketNamn, String klassNamn, String[] metodNamn, String[] variabler)
        som ska skriva ut källkoden till en Java-klass.

        Följande kod med anrop bör ge utskriften nedan:

        String[] metoder = new String[] {“kvadrera”, “derivera”};
        String[] variabler = new String[]{“variabel1”, “variabel2”};
        skrivUtKlass(“mattehörnan”, “Matte”, metoder, variabler);

        UTSKRIFT:

        package mattehörnan;

        public class Matte{

            static int variabel1 = 4;  // Det här är en variabel av typen int.
            static int variabel2 = 8; // Det här är en variabel av typen in.

        public static void main(String[] argZ){}

            // Den här metoden har returtypen void
            static void kvadrera(){}


            // Den här metoden har returtypen void
            static void derivera(){}
        }

        OBSERVERA:
        * Samtliga metoder i klassfilen ska vara void och inte ha några parametrar.
        * Samtliga variabler är av typen int och har slumpvisa värden mellan 1 och 10.
        * Klassen ska ha en main-metod.

     */
    }
}
