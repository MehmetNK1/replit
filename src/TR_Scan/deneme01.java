package TR_Scan;
import java.util.Scanner;

public class deneme01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir dakika bilgisi giriniz : "); // 3456789
        int dakika = scan.nextInt();
        yilvegunsayisiniBul (dakika);
    }
    private static void yilvegunsayisiniBul(int dakika) {
        int gun = dakika / (24*60);
        System.out.println(gun);
        int yil = gun / 365;
        gun = gun % 365;
        System.out.println(yil + " yil " + gun + " gundur. ");


    }
}
