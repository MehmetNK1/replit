package TR_T_If_Switch__Ternary_StringMethods;

import java.util.Scanner;

public class C04 {
    public static void main(String[] args) {
        /*
        Char değişken yanıtının değerini test eden ve aşağıdaki işlemleri gerçekleştiren bir switch ifadesi yazın:
        yanıt a ise,
        "Talebiniz işleniyor" mesajı yazdırılır
        yanıt b ise,
        "yine de ilgilendiğiniz için teşekkür ederiz" mesajı yazdırılır
        yanıt c ise,
        "Üzgünüz, şu anda herhangi bir yardım yok" mesajı yazdırılır
        başka herhangi bir yanıt değeri için,
        "Geçersiz giriş, lütfen tekrar deneyin!" yazdırılır
         */

        Scanner scan = new Scanner(System.in);
        // System.out.println("Lutfen a,b veya c ifadelerinden birini giriniz : ");
        char harf= scan.next().charAt(0);
        switch(harf){
            case 'a':
                System.out.println("Talebiniz isleniyor");
                break;
            case 'b':
                System.out.println("yine de ilgilendiginiz için tesekkur ederiz");
                break;
            case 'c':
                System.out.println("Uzgunuz, su anda herhangi bir yardim yok");
                break;
            default:
                System.out.println("Gecersiz giris, lütfen tekrar deneyin!");
        }
    }
}
