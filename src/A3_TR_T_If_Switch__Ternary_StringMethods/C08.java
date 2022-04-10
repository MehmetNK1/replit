package A3_TR_T_If_Switch__Ternary_StringMethods;

import java.util.Scanner;

public class C08 {
    public static void main(String[] args) {


    /*
    Kullanıcıdan bir isim girmesini isteyin ve son 2 harfinin 3 kopyasından oluşan yeni bir String yazdırın
    Kullanicidan alinan isim uzunluğu en az 2 olacaktır.
    INPUT : Mustafa
    OUTPUT : fafafa
     */
        Scanner scan = new Scanner(System.in);
        String isim = scan.next();
        if (isim.length()>=2){
            System.out.println(isim.substring(isim.length()-2)
                    +isim.substring(isim.length()-2)
                    +isim.substring(isim.length()-2));
        }else{
            System.out.println(isim);
        }
    }
}
