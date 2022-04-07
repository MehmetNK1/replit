package TR_Scan;

import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan dikdörtgenin kenar uzunluklarını alın ve dikdörtgenin alanını ve çevresini konsola yazdıran bir program yazın.
        Örnek Çıktı:
        Alan: 32
        Çevre: 24
         */
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("Alan:"+(a*b)+"\n"+"Cevre:"+(a+b)*2);
    }
}
