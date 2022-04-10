package A4_TR_For_While;

import java.util.Scanner;

public class C01_A {
    public static void main(String[] args) {

        /*
         Kullanıcıdan bir isim ve bir karakter girmesini isteyin,
         ardından döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.
         char ch1= 'a' ;
	     String name =“John came late"
	     Expected Output:
         Number of a = 2
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


        // Scanner scan = new Scanner(System.in);
       // String isim = scan.next();
       // char karakter= scan.next().charAt(0);
       // int toplam= 0;
       // for (int i =0; i<isim.length(); i++){
       //    if (isim.charAt(i)==karakter){
       //        toplam++;
       //    }
       // }
       // System.out.println(toplam);
    }
}
