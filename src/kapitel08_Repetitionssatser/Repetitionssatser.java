package kapitel08_Repetitionssatser;

public class Repetitionssatser {

    public static void main(String[] args) {

        for(int i = 6; i< 20; i++){
            if(i % 3 == 0 || i % 7 == 0){
                System.out.println(i);
            }
        }

    }
}
