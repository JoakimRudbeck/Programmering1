package UtanförGit.Prov_Kap_1_till_9;

import java.util.Scanner;

public class ProvKapEttTillNio_V2_LÖSNING {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        ProvKapEttTillNio_V1_LÖSNING.uppgift1_4poäng();
        scan.nextLine();
        uppgift2_4poäng();
        scan.nextLine();
        ProvKapEttTillNio_V1_LÖSNING.uppgift3_4poäng();
        scan.nextLine();
        uppgift4_4poäng();
        scan.nextLine();
        uppgift5_6poäng();
        scan.nextLine();
        ProvKapEttTillNio_V1_LÖSNING.uppgift6_6poäng();
        scan.nextLine();
        ProvKapEttTillNio_V1_LÖSNING.uppgift7_8poäng();
        scan.nextLine();
    }


    private static void uppgift2_4poäng() {
    /*
        UPPGIFT 2: Skriva ut en given sekvens                                       4 POÄNG

        Använd någon typ av loop för att skriva ut följande:
        88 86 84.007 82 X 78 76 74.007 72 SJUTTIO 68 66 64.007 62 X 58 56 54.007 52

     */

        System.out.println("UPPGIFT 2: Skriv ut en given sekvens");
        scan.nextLine();
        for(int i = 88; i >= 52; i-=2){
            if(i%10 == 0){
                if(i == 70){
                    System.out.print("SJUTTIO ");
                }
                else{
                    System.out.print("X ");
                }
            }
            else if(i % 10 == 4){
                System.out.print(i + ".007 ");
            }
            else{
                System.out.print(i + " ");
            }
        }
        System.out.println();


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
        System.out.println("UPPGIFT4: Beräkna tecken i sträng");
        scan.nextLine();
        System.out.println("Skriv in en text, tack: ");
        String text = scan.nextLine();
        System.out.println("Skriv in ett tecken, tack: ");
        char tecken = scan.nextLine().charAt(0);
        int produkt = produktenAvFörekomstenAvTeckenOchTotalaAntalTecken(text, tecken);
        System.out.printf("Produkten av antal '%c' i '%s' och totala antal tecken i '%s' är %d.", tecken, text, text, produkt);
        System.out.println();

    }

    private static int produktenAvFörekomstenAvTeckenOchTotalaAntalTecken(String text, char tecken) {
        int totalaAntalTeckenIText = text.length();
        int antalTecken = 0;
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == tecken){
                antalTecken++;
            }
        }
        return totalaAntalTeckenIText * antalTecken;
    }

    private static void uppgift5_6poäng() {
    /*
        UPPGIFT 5: Simulering med tärning                                           6 POÄNG

        Beräkna, med hjälp av att simulera minst 10.000 försök,
        sannolikheten att få exakt 2 femmor när du kastar 4 st tiosidiga tärningar.

     */

        System.out.println("UPPGIFT5: Simulering med tärning");
        scan.nextLine();
        int antalSimuleringar = 10000;
        int antalGångerPrecisTvåFemmor = 0;
        System.out.println("Nu ska här kastas 4 st tiosidiga tärningar. Detta ska upprepas " + antalSimuleringar + " gånger.");
        for(int i = 0 ; i < antalSimuleringar; i++){
            int[] tärningskast = new int[4];
            int antalFemmor = 0;
            for(int j = 0; j < tärningskast.length; j++){
                tärningskast[j] = (int)(1 + Math.random()*10);
                if(tärningskast[j] == 5){
                    antalFemmor++;
                }
            }
            if(antalFemmor == 2){
                antalGångerPrecisTvåFemmor++;
            }

        }
        double procent = 100.0 * antalGångerPrecisTvåFemmor / antalSimuleringar;
        System.out.println("Det blev totalt " + antalGångerPrecisTvåFemmor + " gånger som vi fick exakt 2 femmor.");
        System.out.println("Det motsvarar " + procent + " procent");
        System.out.println();
    }

}
