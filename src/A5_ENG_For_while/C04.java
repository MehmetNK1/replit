package A5_ENG_For_while;

import java.util.Scanner;

public class C04 {
    public static void main(String[] args) {
        /*
        Write a return method that accepts an integer as input and calculates factorial and prints like output.
        Input : 6
        Output: 6!=65432*1=720
         */

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int faktoriyel=1;
        String fakAcikYazim ="";
        for (int i = a; i>=1; i--) {
            faktoriyel*=i;
            if (i == a){
                fakAcikYazim = fakAcikYazim +i;
            }else
                fakAcikYazim =fakAcikYazim + "*" + i;
            }
            System.out.println(a + "!="+fakAcikYazim+"="+faktoriyel);
    }
}
