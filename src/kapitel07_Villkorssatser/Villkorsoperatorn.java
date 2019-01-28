package kapitel07_Villkorssatser;

import java.util.Scanner;

public class Villkorsoperatorn {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        villkorsOperatornExempel();
    }

    private static void villkorsOperatornExempel() {
        // Fråga om ett tal.

        // Om talet är jämnt och större än 10, skriv ut "jämnt och tvåsiffrigt"
        // Om talet är udda och större än 10, skriv ut "udda och tvåsiffrigt"

        // Om talet är jämnt och mindre än 10, skriv ut "jämnt och ensiffrigt"
        // Om talet är udda och mindre än 10, skriv ut "udda och ensiffrigt"

        // Gamla vanliga sättet:
        String meddelande = "";

        int tal = scanner.nextInt();

        if(tal % 2 == 0){
            if(tal >= 10){
                meddelande = "jämnt och tvåsiffrigt";
            }
            else{
                meddelande = "jämnt och ensiffrigt";
            }
        }
        else{
            if(tal >= 10) {
                meddelande = "udda och tvåsiffrigt";
            }
            else{
                meddelande = "udda och ensiffrigt";
            }
        }
        System.out.println(meddelande);
    }
}
