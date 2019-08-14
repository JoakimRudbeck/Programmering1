package UtanförGit.Prov_Kap_1_till_9;

import java.util.Scanner;

public class ProvKapEttTillNio_V1_LÖSNING {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        /*uppgift1_4poäng();
        scan.nextLine();
        uppgift2_4poäng();
        scan.nextLine();
        uppgift3_4poäng();
        scan.nextLine();
        uppgift4_4poäng();
        scan.nextLine();
        uppgift5_6poäng();
        scan.nextLine();
        uppgift6_6poäng();
        scan.nextLine();*/
        uppgift7_8poäng();
        scan.nextLine();
    }


    public static void uppgift1_4poäng() {
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

        System.out.println("UPPGIFT1: Är talet delbart med");
        scan.nextLine();
        System.out.println("Skriv in ett tal, tack:");
        int t1 = Integer.valueOf(scan.nextLine());
        System.out.println("Skriv in en delare, tack:");
        int t2 = scan.nextInt();
        scan.nextLine();

        if(ärTalDelbartMed(t1,t2)){
            System.out.printf("%d är delbart med %d.", t1, t2);
        }
        else{
            System.out.printf("%d är inte delbart med %d.", t1, t2);
        }
        System.out.println();
        System.out.println();
    }

    static boolean ärTalDelbartMed(int t1, int t2) {
        int rest = t1 % t2;
        return rest == 0;
    }

    private static void uppgift2_4poäng() {
    /*
        UPPGIFT 2: Skriva ut en given sekvens                                       4 POÄNG

        Använd någon typ av loop för att skriva ut följande:
        22 24 26 28.0 32 34 36 38.0 42 44 46 48.0 FEMTIO 52 54 56 58.0 62

     */

        System.out.println("UPPGIFT 2: Skriv ut en given sekvens");
        scan.nextLine();
        for(int i = 22; i <= 62; i+=2){
            if(i == 50){
                System.out.print("FEMTIO ");
            }
            else if(i % 10 == 0){
                continue;
            }
            else if(i % 10 == 8){
                System.out.print((double) i + " ");
            }
            else{
                System.out.print(i + " ");
            }
        }
        System.out.println();


    }

    public static void uppgift3_4poäng() {
    /*
        UPPGIFT 3: Beräkning av summan och medelvärdet i en lista                   4 POÄNG

        Fråga användaren hur många tal som ska skapas.
        Skapa en lista med anbefallt antal heltal (som användaren får mata in).
        Skapa en metod static int summaAvTal(int[] lista) som beräknar summan av alla tal i en lista.
        Anropa metoden summaAvTal(int[] lista) med din lista som parameter och skriv ut summan.
        Skapa en metod static int medelvärde(int[] lista) som beräknar medelvärdet av alla tal i en lista.
        Anropa metoden medelvärde(int[] lista) med din lista som parameter och skriv ut medelvärdet.

     */
        System.out.println("UPPGIFT 3: Summan och medelvärdet av en lista");
        scan.nextLine();
        System.out.println("Hur många tal vill du spara?");
        int antalTal = Integer.valueOf(scan.nextLine());
        int[] listaMedTal = new int[antalTal];
        for(int i = 0; i < listaMedTal.length; i++){
            System.out.print("Tal" + (i+1) + ": ");
            listaMedTal[i] = Integer.valueOf(scan.nextLine());
        }
        System.out.print("Det här är dina tal: ");
        for(int i = 0; i < listaMedTal.length; i++){
            System.out.print(listaMedTal[i] + " ");
        }
        System.out.println();
        int summaAvTal = summaAvTal(listaMedTal);
        double medelVärde = medelVärde(listaMedTal);
        System.out.println("Summan är " + summaAvTal);
        System.out.println("Medelvärdet är " + medelVärde);
        System.out.println();
    }

    static int summaAvTal(int[] lista){
        int summa = 0;
        for(int i = 0; i < lista.length; i++){
            summa += lista[i];
        }
        return summa;
    }

    static double medelVärde(int[] listaMedTal) {
        return (double) summaAvTal(listaMedTal) / listaMedTal.length;
    }

    private static void uppgift4_4poäng() {
    /*
        UPPGIFT 4: Beräkna tecken i sträng                                          4 POÄNG

        Skapa en metod med lämpligt metodnamn som tar två parametrar; en sträng text och ett tecken tecken.
        Metoden ska returnera produkten av antal gånger som tecken förekommer i text och
        antal gånger som tecknet ‘s’ finns i text.

        Exempel:
        Parametrarna text = “stina sopar skorpsmulor” och tecken = ‘p’ ska returnera 8 eftersom det finns 4 st ‘p’ och 2 st ‘s’. 4*2 = 8.

     */
        System.out.println("UPPGIFT4: Beräkna tecken i sträng");
        scan.nextLine();
        System.out.println("Skriv in en text, tack: ");
        String text = scan.nextLine();
        System.out.println("Skriv in ett tecken, tack: ");
        char tecken = scan.nextLine().charAt(0);
        int produkt = produktenAvFörekomstenAvSOchTecken(text, tecken);
        System.out.printf("Produkten av antal '%c' i '%s' och antal 's' i '%s' är %d.", tecken, text, text, produkt);
        System.out.println();

    }

    private static int produktenAvFörekomstenAvSOchTecken(String text, char tecken) {
        int antalS = 0;
        int antalTecken = 0;
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == 's'){
                antalS++;
            }
            else if(text.charAt(i) == tecken){
                antalTecken++;
            }
        }
        return antalS * antalTecken;
    }

    private static void uppgift5_6poäng() {
    /*
        UPPGIFT 5: Simulering med tärning                                           6 POÄNG

        Beräkna, med hjälp av att simulera minst 10.000 försök,
        sannolikheten att få exakt 3 sexor när du kastar 5 st åttasidiga tärningar.

     */

        System.out.println("UPPGIFT5: Simulering med tärning");
        scan.nextLine();
        int antalSimuleringar = 10000;
        int antalGångerPrecisTreSexor = 0;
        System.out.println("Nu ska här kastas 5 st åttasidiga tärningar. Detta ska upprepas " + antalSimuleringar + " gånger.");
        for(int i = 0 ; i < antalSimuleringar; i++){
            int[] tärningskast = new int[5];
            int antalSexor = 0;
            for(int j = 0; j < tärningskast.length; j++){
                tärningskast[j] = (int)(1 + Math.random()*8);
                if(tärningskast[j] == 6){
                    antalSexor++;
                }
            }
            if(antalSexor == 3){
                antalGångerPrecisTreSexor++;
            }

        }
        double procent = 100.0 * antalGångerPrecisTreSexor / antalSimuleringar;
        System.out.println("Det blev totalt " + antalGångerPrecisTreSexor + " gånger som vi fick exakt 3 sexor.");
        System.out.println("Det motsvarar " + procent + " procent");
        System.out.println();

    }

    public static void uppgift6_6poäng() {
    /*
        UPPGIFT 6:  Rövarspråket                                                    6 POÄNG

        Skapa en metod static String rövarSpråk(String text) som tar en sträng som parameter och
        som returnerar strängen skriven i rövarspråket.
        Regeln för rövarspråket är att man efter varje konsonant lägger ett ‘o’ och därefter samma konsonant igen.
        Till exempel byts b ut mot "bob" och f mot "fof". Vokalerna är oförändrade.
        "Jag talar rövarspråket" blir alltså "jojagog totalolaror rorövovarorsospoproråkoketot".

        Bokstäverna a, e, i, o, u, y, å, ä, ö är vokaler.
        Konsonanter är alla bokstäver som inte är vokaler.

     */

        System.out.println("UPPGIFT6: Rövarspråket");
        scan.nextLine();
        System.out.println("Skriv in en text");
        String text = scan.nextLine();
        String textRövarspråk = rövarSpråk(text);
        System.out.printf("Texten '%s' blir '%s' på rövarspråket.", text, textRövarspråk);
        System.out.println();
    }

    private static String rövarSpråk(String text) {
        String resultat = "";
        char[] konsonanterSmå = new char[]{'b','c','d', 'f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','z'};
        char[] konsonanterStora = new char[]{'B','C','D','F','G','H','J','K','L','M','N','P','Q','R','S','T','V','W','X','Z'};
        for(int i = 0; i < text.length(); i++){
            char tecken = text.charAt(i);
            resultat += "" + tecken;
            for(int j = 0; j < konsonanterSmå.length; j++) {
                if (tecken == konsonanterSmå[j]) {
                    resultat += "o" + tecken;
                    break;
                }
                else if(tecken == konsonanterStora[j]){
                    resultat+= "O" + tecken;
                    break;
                }
            }
        }
        return resultat;

    }

    public static void uppgift7_8poäng() {
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
        * Samtliga variabler är av typen int och har slumpvisa värden mellan 1 och 10.
        * Klassen ska ha en main-metod.
        * Samtliga metoder i klassfilen ska vara void och inte ha några parametrar.

     */

        System.out.println("UPPGIFT7: Generera källkoden till en Java-klass");
        scan.nextLine();
        System.out.println("I vilket paket ligger Java-klassen?");
        String paketnamn = scan.nextLine();
        System.out.println("Vad heter Java-klassen?");
        String klassNamn = scan.nextLine();
        System.out.println("Hur många klass-variabler har " + klassNamn + "?");
        int antalVariabler = Integer.valueOf(scan.nextLine());
        String[] variabler = new String[antalVariabler];
        for(int i = 0; i < variabler.length; i++){
            System.out.println("Vad heter variabel " + (i+1) + "?");
            variabler[i] = scan.nextLine();
        }
        System.out.println("Hur många metoder finns i " + klassNamn + "?");
        int antalMetoder = Integer.valueOf(scan.nextLine());
        String[] metoder = new String[antalMetoder];
        for(int i = 0; i < metoder.length; i++){
            System.out.println("Vad heter metod " + (i+1) + "?");
            metoder[i] = scan.nextLine();
        }
        System.out.println("UTSKRIFT AV KLASSEN " + klassNamn + ":");
        System.out.println("#################################");

        skrivUtKlass(paketnamn, klassNamn, variabler, metoder);



    }

    private static void skrivUtKlass(String paketnamn, String klassNamn, String[] variabler, String[] metoder) {
        System.out.println();
        System.out.println("package " + paketnamn + ";");
        System.out.println();
        System.out.println("public class " + klassNamn + "{");

        skrivUtVariabler(variabler);
        skrivUtMainMetoden();

        skrivUtÖvrigaMetoder(metoder);




        System.out.println("}");
    }

    private static void skrivUtVariabler(String[] variabler) {
        System.out.println();
        String tab = "     ";
        for(int i = 0; i < variabler.length; i++){
            System.out.println(tab + "static int " + variabler[i] + " = " + (int)(1+Math.random()*10) + ";");
        }
        System.out.println();
    }

    private static void skrivUtMainMetoden() {
        String tab = "     ";
        System.out.println(tab + "public static void main(String[] args){");
        System.out.println(tab + "}");
    }

    private static void skrivUtÖvrigaMetoder(String[] metoder) {
        String tab = "     ";
        for(int i = 0; i < metoder.length; i++){
            System.out.println();
            System.out.println(tab + "// Den här metoden är av typen void och har inga parametrar.");
            System.out.println(tab + "static void " + metoder[i] + "(){");
            System.out.println(tab + "}");
            System.out.println();

        }
    }
}
