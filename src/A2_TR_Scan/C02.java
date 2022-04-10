package A2_TR_Scan;

import java.util.Scanner;

public class C02 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan karenin kenar uzunluğunu alın ve karenin alanını ve çevresini konsola yazdıran bir program yazın.
        Ornek Cikti :
        Alan: 9
        Cevre: 12
         */
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("Alan: "+(a*a)+"\n"+"Cevre: "+(a+a+a+a));
    }
}
