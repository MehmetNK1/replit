package A6_ENG_Method_Array;

import java.util.Arrays;

public class C03 {
    /*
    Write a method which accepts a String as parameter and
    prints the sum of the digits, present in the given string.
    input : ade1r4d3
    output : 8

    Hint :
     Use Character.isDigit()
     Integer.valueOf()
     ********************++++++++++
     Bir String'i parametre olarak kabul eden ve verilen string'de
     bulunan rakamların toplamını yazdıran bir metot yazın.
     girdi: ade1r4d3
     çıktı : 8

     İpucu :
      Karakter.isDigit() kullanın
      Tamsayı.değerOf()
     */
    public static void main(String[] args) {
        String str = "ade1r4d3";
        String []arr = str.split("");
        System.out.println(Arrays.toString(arr));
        int toplam=0;
        for (int i=0; i<arr.length; i++) {
            if (Character.isDigit(arr[i].charAt(0))){
                toplam+=Integer.valueOf(arr[i]);
            }
        }
        System.out.println("rakam toplami : "+toplam);
    }
}
