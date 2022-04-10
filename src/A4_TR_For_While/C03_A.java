package A4_TR_For_While;

import java.util.Scanner;

public class C03_A {
    public static void main(String[] args) {
        /*
        Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)
        Input :
        String str=“Javaisalsoeasy”
        Output: a s
         */

        Scanner scan = new Scanner(System.in);
        String isim = scan.next();
        String toplam="";
        for (int i = 0; i <= isim.length()-1; i++){
            if (isim.substring(i,i+1).equals(isim)){
                toplam+=isim;
            }
        }
        System.out.println(toplam);
    }
}
