package A6_ENG_Method_Array;

public class C01 {
    public static void main(String[] args) {
        /*
        Write a return method to reverse number.
        sayıyı tersine çevirmek için bir dönüş yöntemi atayın.
        Input : 12345
        Output : 54321

         */

        int sayi =12345;
        int ters =0;
        int basamak =0;
        while(sayi>0){
            basamak=sayi%10;
            ters=ters*10+basamak;
            sayi/=10;
        }
        System.out.println("Output : "+ters);


    }
}
