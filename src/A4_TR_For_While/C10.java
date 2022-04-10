package A4_TR_For_While;

public class C10 {
    public static void main(String[] args) {
        /*
        1'den 100'e kadar olan doğal sayıların toplamını bulan programı yazınız.
        OutPut:
        Sayilarin Toplami : 5050
         */
        int sayi1=100;
        int depo =0;
        for (int i =1; i<=sayi1; i++) {
            depo +=i;
        }
        System.out.println(depo);

    }
}
