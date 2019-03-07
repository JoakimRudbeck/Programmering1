import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UtanförGit {

    static long hittaStörstaPrimtalsfaktor(long tal){
        List<Long> listaAvPrimtalsfaktorer = new ArrayList<Long>();
        long talet = tal;
        while(true){
            boolean fortsätta = false;
            for(long i = 2; i <=talet; i++){

                if(talet % i == 0){ // hittat en faktor
                    listaAvPrimtalsfaktorer.add(i);
                    talet = talet / i;
                    fortsätta = true;
                    break;
                }
            }
            if(!fortsätta){
                break;
            }
        }
        Collections.sort(listaAvPrimtalsfaktorer);
        return listaAvPrimtalsfaktorer.get(listaAvPrimtalsfaktorer.size()-1);

    }
}
