package kapitel14_Samlingar;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class Samlingar {


    public static void main(String[] args) {
        arrayListExempel();
        stackExempel();
        hashSetExempel();
    }

    private static void stackExempel() {
        System.out.println("STACK EXEMPEL");
        Stack<String> minStack = new Stack();
        minStack.push("Vaknade"); // push lägger till ett värde på stacken
        System.out.println("Nuvarande översta värde i stacken: " + minStack.peek());
        // peek kollar på översta värdet i stacken
        minStack.push("Gick till skolan");
        System.out.println("Nuvarande översta värde i stacken: " + minStack.peek());
        minStack.push("Är i skolan");
        System.out.println("Nuvarande översta värde i stacken: " + minStack.peek());
        minStack.pop(); // pop tar bort översta värden från stacken
        System.out.println("Nuvarande översta värde i stacken: " + minStack.peek());
        minStack.pop();
        System.out.println("Nuvarande översta värde i stacken: " + minStack.peek());

    }

    private static void hashSetExempel() {
        System.out.println("HASHMAP EXEMPEL");
        // En hashmap kan spara massa parvis kopplade värden i en lista.
        // Tänk er en matematisk funktion, f(x) = x+2 och dess värdetabell:
        // x    y
        // 1    3       1 är ihopkopplat med 3
        // 2    4       2 är ihopkopplat med 4
        // 3    5       ...
        // 4    7       ...

        HashMap<String, Character> minaBetyg = new HashMap();
        // En hashmap som kopplar samman strängar med tecken
        // Strängarna motsvarar kurser och tecknen motsvarar betyget
        // strängarna är nyckeln och tecknen är värdena

        minaBetyg.put("Svenska", 'E'); // put används för att lägga in ett 'key-value'-par i hash-mappen.
        minaBetyg.put("Matte 5", 'C'); // "Matte 5" kopplas till 'C'
        minaBetyg.put("Programmering <3", 'A');

        System.out.println("Följande finns i hashmappen:");
        for(String s : minaBetyg.keySet()){
            System.out.println(s + " : " + minaBetyg.get(s));
        }





    }

    private static void arrayListExempel() {
        System.out.println("ARRAYLIST EXEMPEL");
        // En arrayList är en dynamisk lista som kan ändra storlek.
        // Du kan enkelt lägga till och ta bort element från en arrayList med add(element) och remove(index)
        // Du kan även infoga ett element på ett visst index med add(index, element)
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(9);
        System.out.println(arrayList);
        arrayList.remove(0);
        System.out.println(arrayList);
        arrayList.add(11);
        System.out.println(arrayList);
        arrayList.add(1,100);
        System.out.println(arrayList);

        for(int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
        // Annan typ av syntax för att loopa över en samling.
        for(int i : arrayList) {
            System.out.println(i);
        }
        // Skriver ut varje tecken i strängen "joakim"
        for (char c : "joakim".toCharArray()){
            System.out.println(c);
        }
    }
}
