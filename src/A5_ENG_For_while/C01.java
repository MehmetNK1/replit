package A5_ENG_For_while;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {
        /*
        Ask user to enter a name and a character,
        then check how many times the character is repeated in the name using loops in the name
        e.g:
        char ch1= 'a' ;
        String name =“John came late"
        Expected Output: Number of a = 2

        ###############

        Kullanıcıdan bir isim ve karakter girmesini isteyin,
         sonra isimde döngüler kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin
         Örneğin:
         char ch1= 'a' ;
         String name="John geç geldi"
         Beklenen Çıktı: a sayısı = 2
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz : ");
        String cumle = scan.nextLine().toLowerCase();

        System.out.println("Lutfen bir harf giriniz : ");
        char harf=scan.next().toLowerCase(). charAt(0);

        int count = 0;

        for (int i = 0; i < cumle.length(); i++) {

            if (cumle.charAt(i)==harf) {

                count++;
            }

        }
        System.out.println("Girdiginiz cumlede " + harf +" karakteri "+ count+ " kere kullanilmistir");
        System.out.println("number of "+harf +" = "+count);
    }
}
