package A5_ENG_For_while;

import java.util.Scanner;

public class C02 {
    public static void main(String[] args) {
        /*
        Ask user to enter 2 integer then find GCD (Greatest Common Divisor) and LCM (Least Common Multiple)
        Input :
        30 and 40
        Expected OutPut:
        GCD for 30 and 40 = 10
        LCM for 30 and 40 = 120

        ######################

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
        int GCD = 0;
        int LCM ;
        for (int i = 1; i <= a && i<=b ; i++){
            if (a%i==0 && b%i==0){
                GCD =i;
            }
        }
        LCM=(a*b)/GCD;
        System.out.println(a +" for "+ b+" and GCD = "+GCD );
        System.out.println("GCD for "+a+" and "+b+"="+GCD );
        System.out.println("LCM for "+a+" and "+b+"="+LCM );
        System.out.println(a +" for "+ b+" and LCM = "+LCM );
    }
}
