package TR_Scan;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir sayı alın ve sayının küpünün yarısını konsola yazdıran bir program yazın.
         */
        Scanner scan=new Scanner(System.in);
        double a = scan.nextDouble();
        System.out.println((a*a*a)/2);
    }
}
