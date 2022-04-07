package TR_Scan;

import java.util.Scanner;

public class C07 {
    public static void main(String[] args) {
        /*
        Kullanıcı tarafından girilen DOUBLE sayıyı tam sayıya çeviren bir program yazınız.
         */
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        int b = (int) a;
        System.out.println(b);
    }
}
