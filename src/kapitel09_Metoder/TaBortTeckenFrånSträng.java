package kapitel09_Metoder;

import java.util.Scanner;

public class TaBortTeckenFrånSträng {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String s = scan.nextLine();
        char[] t = new char[3];
        t[0] = scan.nextLine().charAt(0);
        t[1] = scan.nextLine().charAt(0);
        t[2] = scan.nextLine().charAt(0);
        String resultat = taBortTeckenFrånSträng(s,t);
        System.out.println(resultat);
    }

    static String taBortTeckenFrånSträng(String s, char[] t){
        String resultat = ""; // Skapar ett tomt resultat från början.
        for(int i = 0; i < s.length(); i++){ // För varje tecken i s
            boolean skaJagLäggaTillTecknet = true;
            for(int j = 0; j < t.length; j++){  // För varje tecken i t.
                if(s.charAt(i) == t[j]){        // Om det är ett tecken som ska bort
                    skaJagLäggaTillTecknet = false;
                    break;
                }
            }
            if(skaJagLäggaTillTecknet){
                resultat += s.charAt(i);
            }
        }
        return resultat;

    }
}
