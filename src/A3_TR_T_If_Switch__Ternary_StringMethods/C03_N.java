package A3_TR_T_If_Switch__Ternary_StringMethods;

import java.util.Scanner;

public class C03_N {
    public static void main(String[] args) {
        /*
        Verilen iki sayının (sıfırdan büyük veya sıfıra eşit) toplamını hesaplayan
        ve yazdıran bir Java programı yazın. Verilen tamsayılar veya
        toplam 10'dan fazla basamakli olursa, "OverFlow" yazdırın.
        Ornek:
        INPUT :
        25
        46
        OUTPUT :
        Numaralarin Toplami:
        71
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("iki sayi giriniz");
        int sayi1=scan.nextInt();
        System.out.println("ikinci sayi");
        int sayi2=scan.nextInt();;
        int toplam=sayi1+sayi2;
        if(sayi1>999999999 || sayi2>999999999 || toplam>999999999){
            System.out.println("overflow");
        } else System.out.println(toplam);
    }
}
