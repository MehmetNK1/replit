package TR_Scan;

import java.util.Scanner;

public class C06 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir Float değer girmesini isteyin, bu sayıyı short değişken tipine dönüştürün ve konsolda yazdırın.
         */
        Scanner scan= new Scanner(System.in);
        //System.out.println("sayi giriniz : ");
        float a = scan.nextFloat();
        short b =(short)a;
        short max =Short.MAX_VALUE;
        short min =Short.MIN_VALUE;
        System.out.print(max+" "+min);

    }
}
