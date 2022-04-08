package TR_T_If_Switch__Ternary_StringMethods;

import java.util.Scanner;

public class C05 {
    public static void main(String[] args) {
        /*
        Bir aydaki gün sayısını hesaplayan bir Java programı yazınız.
        INPUT:
        Ay Numarasi:
        2
        Yil :
        2016
        OUTPUT :
        Subat 2016 29 Gundur.
         */

        Scanner scan = new Scanner(System.in);
        //System.out.println("hangi ay i gormek istedin..");
        int ay = scan.nextInt();
        switch(ay) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(" 31 Gundur.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(" 30 Gundur.");
                break;
            case 2:
                //System.out.println("yil giriniz .. :");
                int yil = scan.nextInt();
                if (yil % 4 == 0){
                    //System.out.println("girdiniz yilda 29 gun vardir..");
                    System.out.println("Subat "+yil+" 29 Gundur.");
                }else{
                    //System.out.println("girdinigiz yilda 28 gun vardir.. ");
                    System.out.println("Subat "+yil+" 28 Gundur.");
                }
                break;
                default:
                    System.out.println("12 ay dan birini giriniz..");
        }
    }
}
