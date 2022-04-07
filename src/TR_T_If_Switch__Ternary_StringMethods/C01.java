package TR_T_If_Switch__Ternary_StringMethods;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {

        /*
        Kullanıcıya kilosunu ve boyunu sorun ve kitle indeksini hesaplayan bir program yazın (BMI)
        IPUCU : BMI = Agirlik(kg) / Boy*Boy (m)
        BMI 18,5'in altındaysa zayıfsınız
        BMI 18,5 ile 25 arasında ise kilonuz idealdir
        BMI 25-30 arasındaysa şişmansınız
        BMI 30'dan büyük veya eşitse, obez
        Input:
        Output:
        Agirlik : 71
        Boy : 1,72
        BMI : 23.99945916711736
        Zayifsiniz.
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Kilonuzu giriniz : ");
        double kilo = scan.nextDouble();
        System.out.print("Boyunuzu girniz : ");
        double boy = scan.nextDouble();
        double BMI = kilo / ((boy) * (boy));
        System.out.println("BMI : "+BMI);
        if (BMI<18){
            System.out.println("zayıfsınız");
        }else if (18<=BMI || BMI<25){
            System.out.println("kilonuz idealdir");
        }else if (25<=BMI || BMI<30){
            System.out.println("şişmansınız");
        }else if (30<=BMI){
            System.out.println("obez");
        }else {
            System.out.println("boy veya kilonuzu yanlis girdiniz..");
        }




    }
}
