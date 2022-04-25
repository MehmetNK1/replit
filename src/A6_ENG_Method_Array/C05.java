package A6_ENG_Method_Array;

public class C05 {
    /*
    Write a java program that calculates the average value of array elements
    input[]= {1,2,3,4,5,6,7}
    Output : 4
    +++
    Dizi elemanlarının ortalama değerini hesaplayan bir java programı yazınız.
    girdi[]= {1,2,3,4,5,6,7}
    Çıkış : 4
     */

    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7};
        int toplam=0;
        int ortalama=0;
        for(int i=0; i<arr.length; i++) {
            toplam+=arr[i];
            ortalama=toplam/arr.length;
        }
        System.out.println(ortalama);
    }
}
