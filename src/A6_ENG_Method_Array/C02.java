package A6_ENG_Method_Array;

import java.util.Arrays;

public class C02 {
    /*
    Write a Java program that reverse a sentence by using Array
    (with all spaces and special characters).
    Input : Coding is greate.
    Output : .etaerg si gnidoC

    Array (tüm boşluklar ve özel karakterlerle) kullanarak
    bir cümleyi tersine çeviren bir Java programı yazın.
    Girdi : Kodlama harika.
    Çıktı: .etaerg si gnidoC
     */
    public static void main(String[] args) {
        String str = "Coding is greate.";
        String[] arr = str.split("");
        //System.out.println(Arrays.toString(arr));
        for (int i =  arr.length - 1; i >=0; i--) {
            System.out.print(arr[i]);
        }
    }
}
