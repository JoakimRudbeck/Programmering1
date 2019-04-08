package kapitel14_Samlingar;

import java.util.ArrayList;

public class Samlingar_ArrayList {

    public static void main(String[] args) {
        arrayListExempel();
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
