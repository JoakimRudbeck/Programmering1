public class Bitar {

    public static void main(String[] args) throws InterruptedException {

        loopaGenomLista();


    }

    private static void loopaGenomLista() {
        String[] lista = {"mango", "äpple", "banan"};
        for(int i = 0; i < lista.length; i++){
            System.out.print("Inne i loopen, varv " + (i+1));
            System.out.println("Värde i listan:" + lista[i]);
        }
        System.out.println("Nu är vi utanför loopen");
    }


    private static void countDown() throws InterruptedException {
        for(int i = 60*50; i >=0; i--){
            System.out.println(Integer.toBinaryString(i));
            Thread.sleep(1000);
        }
    }
}
