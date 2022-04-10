package A3_TR_T_If_Switch__Ternary_StringMethods;

import java.util.Scanner;

public class C02 {
    public static void main(String[] args) {

        /*
        Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata ceviren java kodunu yaziniz.
        Input :
        John White
        1234234534561478
        Output : Name :
        J*** W****
        CCN : **** **** **** 1478
        Ilk Harfler Buyuk harf ile baslamalidir.
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Adinizi giriniz : ");
        String isim =scan.next();
        System.out.print("Soyadinizi giriniz : ");
        String soyAd=scan.next();
        System.out.print("Kart numarasi : ");
        String kart=scan.next();

        if (kart.length() ==16){
            isim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
            soyAd=soyAd.substring(0,1).toUpperCase()+soyAd.substring(1).replaceAll("\\w","*");
            kart="**** **** **** "+kart.substring(kart.length()-4);
        }else{
            System.out.println("16 haneli kart no giriniz ..");
        }
        System.out.println(isim+" "+soyAd+" "+"\nCCN : "+kart);
    }
}
