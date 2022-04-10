package A4_TR_For_While;

import java.util.Scanner;

public class C04 {
    public static void main(String[] args) {
        /*
        Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi yazıniz.
        Input : 6
        Output: 6!=65432*1=720
         */

        Scanner scan = new Scanner(System.in);
        int sayi = scan.nextInt();
        int faktoriyel = 1;
        String faktoriyelAcikYazim = "";

        for (int i = sayi; i >= 1; i--) {

            faktoriyel *= i;

            if (i == sayi) {
                faktoriyelAcikYazim = faktoriyelAcikYazim + i;
            } else
                faktoriyelAcikYazim = faktoriyelAcikYazim + "*" + i;
        }

        System.out.println(sayi + "!=" + faktoriyelAcikYazim + "=" + faktoriyel);


    }
}
