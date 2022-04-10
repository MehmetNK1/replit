package A3_TR_T_If_Switch__Ternary_StringMethods;

import java.util.Scanner;

public class C06_A {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir isim yazmasını isteyin, adın uzunluğu 3 olmalıdır.
        Ardından, adın aynı karakterlere sahip olup olmadığını kontrol edin.
        Eger aynı karakterlere sahipse
        "isim ayni karakterlere sahiptir." yazdirin.
        Eger ayni kaakterlere sahip degilse
        "Dizenin benzersiz karakterleri var" yazdirin.
        Ternary kullanin.
         */

        Scanner scan = new Scanner(System.in);
        String isim = scan.next();

        System.out.println(isim);

    }
}
