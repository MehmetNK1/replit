package A4_TR_For_While;

import java.util.Scanner;

public class C09 {
    public static void main(String[] args) {
        /*
        Kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız. (Mulakat Sorusu)
        Input :1238
        Output :Girilen Numananin Tersi: 8321
         */
        //Scanner scan = new Scanner(System.in);

        int sayi = 1238, tersi = 0;
        int yedek=sayi;

        for(;sayi != 0; sayi /= 10) {
            int basamak = sayi % 10;
            tersi = tersi * 10 + basamak;
        }
        //System.out.println("Sayının      : " + yedek);
        System.out.println("Girilen Numananin Tersi: " + tersi);
    }
}
