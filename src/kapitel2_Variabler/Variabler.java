package kapitel2_Variabler;

public class Variabler {
    public static void main(String[] args) {
        // Deklarering:
        // Skapar variabeln och reserverar så mycket plats
        // i minnet som behövs för den datatypen
        int mittHeltal; // Skapar 4 byte (32 bitar) i minnet.
        // Tilldelning = ger en deklarerad variabel ett värde.
        mittHeltal = 150234;
        mittHeltal = -23188;
        // En variabel kan ändras
        // hela tiden (om de inte är deklarerade final)
        // Deklarering och tilldelning på sammma gång:
        short mittLillaHeltal = 14010;
        double minDouble = 3.14;
        float minFloat = 3.14f;  // Måste lägga till ett f.
        char minChar = '!';
        char minAndraChar = 'J';
        boolean minBool = 20 == 13;
        String minString = "HEJ HEJ HEJ";
    }
}
