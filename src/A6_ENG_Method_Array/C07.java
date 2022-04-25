package A6_ENG_Method_Array;

public class C07 {
    /*
    Write a method that accepts an array as parameter and returns sum
    off all elements in the array Then print the result in the main method.
    Eg : input : {1,2,3,4,5,6,7,8};
    output: 36
    ++++
    Bir diziyi parametre olarak kabul eden ve toplamı döndüren bir yöntem yazın
     dizideki tüm öğeleri kapat Ardından sonucu ana yöntemde yazdırın.
     Örn: giriş : {1,2,3,4,5,6,7,8};
     çıktı: 36
     */
    public static void main(String[] args) {

        int []sayi = {1,2,3,4,5,6,7,8};
        int top=0;
        for (int i:sayi) {
            top+=i;
        }
        System.out.println(top);
    }
}
