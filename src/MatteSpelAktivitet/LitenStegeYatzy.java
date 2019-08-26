package MatteSpelAktivitet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LitenStegeYatzy {

    public static void main(String[] args) {
        int antalKörningar = 10000;
        int antalSmåStege = 0;
        for(int i = 1; i <= antalKörningar; i++){
            ArrayList<Integer> tärningarnasVärden = new ArrayList<>();
            for(int j = 0; j < 5; j++){
                tärningarnasVärden.add((int)(1 + Math.random()*6));
            }
            Collections.sort(tärningarnasVärden);
            //if(tärningarnasVärden.toArray().equals()){
                
            //}

        }
    }
}
