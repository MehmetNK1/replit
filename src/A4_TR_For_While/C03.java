package A4_TR_For_While;

import java.util.Arrays;
import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {
        /*
        Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)
        Input :
        String str=“Javaisalsoeasy”
        Output: a s
         */

        String str = "Javaisalsoeasy";
        String tekrar = "";
        String tekrar2 = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i + 1).contains(str.substring(i, i + 1))) {
                tekrar += str.substring(i, i + 1);
            }
        }
        System.out.println(tekrar); //aasas
        for (int i = 0; i < tekrar.length(); i++) {
            if (!tekrar2.contains(tekrar.substring(i, i + 1))) {
                tekrar2 += tekrar.substring(i, i + 1);
            }
        }
        System.out.println(tekrar2); //as
        String[] arr = new String[tekrar2.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = tekrar2.substring(i,i+1);
        }
        System.out.println(Arrays.toString(arr)); //[a, s]
    }
}
