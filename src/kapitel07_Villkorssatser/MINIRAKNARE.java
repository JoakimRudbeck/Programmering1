package kapitel07_Villkorssatser;

import java.util.Scanner;

public class MINIRAKNARE {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        miniräknareVersion1();
        miniräknareVersion2();

    }

    static void miniräknareVersion1() {
        //Läs in strängen "A operator B"
        System.out.println("Skriv in A operator B");
        String indata = scan.nextLine();

        //Sug ut talet A ur strängen
        String[] splittad = indata.split(" "); // {"A", "OP", "B"}
        int a = Integer.valueOf(splittad[0]);

        //Sug ut talet B ur strängen
        int b = Integer.valueOf(splittad[2]);

        //Sug ut operatorn ur strängen
        String operator = splittad[1];

        //Beräkna värdet av A operator B (baserat på operatorn)

        if(operator.equals("+")){
            System.out.println(a+b);
        }
        else if(operator.equals("-")){
            System.out.println(a-b);
        }
        else if(operator.equals("*")){
            System.out.println(a*b);
        }
        else if(operator.equals("%")){
            System.out.println(a%b);
        }
        else{
            System.out.println("Jag uppfattade inte din operator.");
        }
    }

    static void miniräknareVersion2() {
        //Läs in strängen "A operator B"
        System.out.println("Skriv in A operator B");
        String indata = scan.nextLine();

        //Sug ut talet A ur strängen
        String[] splittad = indata.split(" "); // {"A", "OP", "B"}
        int a = Integer.valueOf(splittad[0]);

        //Sug ut talet B ur strängen
        int b = Integer.valueOf(splittad[2]);

        //Sug ut operatorn ur strängen
        String operator = splittad[1];

        //Beräkna värdet av A operator B (baserat på operatorn)

        switch(operator){
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "%":
                System.out.println(a%b);
            default:
                System.out.println("Jag uppfattade inte din operator.");
        }
    }
}
