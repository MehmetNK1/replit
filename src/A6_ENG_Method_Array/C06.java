package A6_ENG_Method_Array;

import java.util.Arrays;

public class C06 {
    /*
    Write a method that accepts an integer array as input and prints
    the minimum and the maximum numbers from given array
    Input : {3,2,5,4,1,6}
    Output : min: 1 max: 6
    ++
    Girdi olarak bir tamsayı dizisini kabul eden ve verilen diziden
     minimum ve maksimum sayıları yazdıran bir yöntem yazın
    Giriş : {3,2,5,4,1,6}
    Çıktı : min: 1 maksimum: 6
     */
    public static void main(String[] args) {


       int []arr = {3,2,5,4,1,6};
        Arrays.sort(arr);

       int min =arr[0];
       int max =arr[arr.length - 1];
       System.out.println("min: "+min+" max:"+max);

        System.out.println("2. yol");
       //int minn=arr[0];
       //int mak=arr[0];
       //for(int i=0;i<arr.length;i++){
       //    if (arr[i]>mak) {
       //        mak = arr[i];
       //    }else if(arr[i]<minn){
       //        minn=arr[i];
       //    }
       //}
       //System.out.println(mak+" "+minn);
    }
}
