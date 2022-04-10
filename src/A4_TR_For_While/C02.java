package A4_TR_For_While;

import java.util.Scanner;

public class C02 {
    public static void main(String[] args) {

        /*
        Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen) ve
        LCM'yi (En Küçük Ortak Kat) bulmasını isteyin.
        Input :
        30
        40
        Beklenen Cikti:
        30 ve 40 icin GCD = 10
        30 ve 40 icin LCM = 120
         */

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int GCD =0;
        int LCM ;
        for (int i = 1; i <=a && i<=b; i++) {
            if (a%i==0 && b%i==0){
                GCD=i;
            }
        }
        LCM=(a*b)/GCD;
        System.out.println(a +" ve  "+ b+" icin GCD = "+GCD );
        System.out.println(a +" ve  "+ b+" icin LCM = "+LCM );
    }
}
