package Lec_1;

import java.util.Arrays;

public class Prog_Arr {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        String[] arr2;
        arr2 = new String[]{"kishan","singh","kumar","5", String.valueOf(true)};
        int [][] arr3={{1},{10,20}};
        int sum=0;
        sum=arr[0]+arr[1];
        System.out.println(arr[4]);
        System.out.println(arr2[4]);
        System.out.println(Arrays.toString(arr3[0]));
        System.out.println(arr3[1][1]);
    }
}
