public class Bitar {

    public static void main(String[] args) throws InterruptedException {
        countDown();
    }

    private static void countDown() throws InterruptedException {
        for(int i = 60*30; i >=0; i--){
            System.out.println("Sekunder kvar till lektionsslut:" + Integer.toBinaryString(i));
            Thread.sleep(1000);
        }
    }
}
