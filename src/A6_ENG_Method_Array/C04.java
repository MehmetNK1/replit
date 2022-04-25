package A6_ENG_Method_Array;

import java.util.Arrays;

public class C04 {
    /*
    Create a custom return type method accepts a name
    as parameter and prints the name as a char array.
    (do not use toCharArray() method)
    Input : John
    Output :[J, o, h, n]
    +++++
    Özel bir dönüş türü yöntemi oluşturun, bir ad kabul eder
     parametre olarak ve adı bir karakter dizisi olarak yazdırır.
     (toCharArray() yöntemini kullanmayın)
     Girdi: John
     Çıktı :[J, o, h, n]
     */
    public static void main(String[] args) {

        String str = "John";
        String[] arr = str.split("");
        System.out.println(Arrays.toString(arr));
    }
}
