package A5_ENG_For_while;

import java.util.Scanner;

public class C09 {
    public static void main(String[] args) {
        /*
        Write a java program to reverse the number which user entered.
        Input :1238
        Output :Reverse Of The Number: 8321
        ########
        Kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız. (Mulakat Sorusu)
        Input :1238
        Output :Girilen Numananin Tersi: 8321
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int sayi = scan.nextInt();
        int ters = 0;
        int kalan = 0;
        while (sayi != 0) {
            kalan = sayi % 10;
            ters = ters * 10 + kalan;
            sayi /= 10;
        }
        System.out.println("Reverse Of The Number:"+ters);
    }
}
