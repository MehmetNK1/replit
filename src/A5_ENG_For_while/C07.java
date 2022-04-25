package A5_ENG_For_while;

import java.util.Scanner;

public class C07 {
    public static void main(String[] args) {
        /*
        Write java code checking the number is Perfect number or not.
        Any number can be a Java Perfect Number if the sum of its
        positive divisors excluding the number itself is equal to that number.
        Input :6 Output:6 is Perfect Number Input :7 Output:7 is not Perfect Number
        #########
        Sayinin Mükemmel sayı olup olmadığını kontrol eden Java kodunu yazın.
        Sayının kendisi hariç pozitif bölenlerinin toplamı o sayıya eşitse,
         herhangi bir sayı Mükemmel Sayı olarak bilinir.
        Input :6
        Output:
        6 Mukemmel Sayidir.
        ======================
        Input: 7
        Output:
        7 Mukemmel Sayidir degildir.
         */
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b=0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                b += i;
            }
        }if (a==b) {
                System.out.println(a+" is Perfect Number");
            }else{
                System.out.println(a+" is not Perfect Number");
            }
    }
}
