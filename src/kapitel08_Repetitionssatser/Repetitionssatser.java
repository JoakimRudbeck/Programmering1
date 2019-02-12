package kapitel08_Repetitionssatser;

public class Repetitionssatser {

    public static void main(String[] args) {

        // Loopar igenom alla tal i mellan 6 och 20 (inklusive)
        for(int i = 6; i< 20; i++){
            if(i % 3 == 0 || i % 7 == 0){ // Om talet i jämnt delbar med 3 eller jämnt delbar med 7.
                System.out.println(i);
            }
        }

    }
}
