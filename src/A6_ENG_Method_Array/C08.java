package A6_ENG_Method_Array;

import java.util.Arrays;

public class C08 {
    /*
    Write a return method that accepts 2 integer Arrays as parameters
    And adds 2 array into a new Array and prints it.
    Input1={1,2,3,4}
    Input2={5,6}
    Output={1,2,3,4,5,6}
    ++++++
    2 tamsayı Dizisini parametre olarak kabul eden bir dönüş yöntemi yazın
     Ve yeni bir Diziye 2 dizi ekler ve yazdırır.
     Girdi1={1,2,3,4}
     Giriş2={5,6}
     Çıktı={1,2,3,4,5,6}

     */
    public static void main(String[] args) {
        int [] arr1={1,2,3,4};
        int [] arr2={5,6};
        int [] arr3=new int[arr1.length + arr2.length];
        System.out.println(Arrays.toString(arr3));
    }
}
