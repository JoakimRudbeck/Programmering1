import java.util.Scanner;

import static java.lang.Integer.toBinaryString;
import static java.lang.Thread.sleep;

public class CountDown {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        countDown(16, 8, 1000);
    }

    private static void countDown(long minuterKvar, int bas, int millis) throws InterruptedException {
        for(long i = 60*minuterKvar; i >= 0; i--){
            switch(bas){
                case 2:
                    System.out.println(Long.toBinaryString(i));
                    break;
                case 8:
                    System.out.println(Long.toOctalString(i));
                    break;
                case 10:
                    System.out.println(i);
                    break;
                case 16:
                    System.out.println(Long.toHexString(i));
                    break;
                default:
                    System.out.println(i);

            }
            sleep(millis);
        }
        System.out.println("### YOU HAVE REACHED THE FINAL COUNTDOWN ###");
    }
}