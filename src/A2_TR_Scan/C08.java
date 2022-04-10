package A2_TR_Scan;

import java.util.Scanner;

public class C08 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan üç basamaklı bir sayı girmesini ve bu sayının basamaklarının toplamını bulmasını isteyin.
        Örnek Çıktı:
        Verilen tamsayının rakamları toplamı 10'dur.
         */
        Scanner scan =new Scanner(System.in);
        System.out.println("uc basamakli bir sayi giriniz : ");
        int sayi = scan.nextInt();
        int basamak= 0, toplami =0;
        //1.adim
        basamak = sayi%10;
        toplami += basamak;
        sayi/=10;
        //2.adim
        basamak = sayi%10;
        toplami += basamak;
        sayi/=10;
        //3.adim
        basamak = sayi%10;
        toplami += basamak;
        sayi/=10;
        System.out.println("Verilen tamsayinin rakamlari toplami : "+toplami);

    }
}
