package kapitel02_Variabler;

public class Variabler_Deklarering_Tilldelning {
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
        long mittStoraHeltal = 999999999;
        byte minByte = 120;     // Byte består av 8 bitar. Möjliga värden på byte är -128 till +127.
        double minDouble = 3.14; // Decimaltal tolkas som double by default
        float minFloat = 3.14f;  // Måste lägga till ett f för att skilja på double 3.14 och float 3.14.
        char minChar = '!';
        char minAndraChar = 'J';
        boolean minBool = 20 == 13;
        String minString = "HEJ HEJ HEJ";
    }
}
