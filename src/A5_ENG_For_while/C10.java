package A5_ENG_For_while;

public class C10 {
    public static void main(String[] args) {
        /*
            Write a Program to find the sum of natural numbers from 1 to 100.
            OUTPUT : Sum of Natural Numbers 5050
            #########
            1'den 100'e kadar olan doğal sayıların toplamını bulan programı yazınız.
        OutPut:
        Sayilarin Toplami : 5050

         */
        int sayi1 = 100;
        int depo = 0;
        for (int i =1; i<=100;i++){
            depo +=i;
        }
        System.out.println("Sum of Natural Numbers "+depo);


    }
}
