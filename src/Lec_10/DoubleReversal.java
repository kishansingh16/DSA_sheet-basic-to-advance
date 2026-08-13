package Lec_10;

//Given an integer num, reverse num to get reversed1, then reverse reversed1 to get reversed2.
//Return true if reversed2 equals num. Otherwise return false.

public class DoubleReversal {

    public static boolean isSameAfterReversals(int num){

        int original=num;
        num=Math.abs(num);
        int reversed1=0;
        while(num>0){
            int rem1=num%10;
            reversed1=(10*reversed1)+rem1;
            num=num/10;
        }

        int reversed2=0;

        while(reversed1>0){
            int rem2=reversed1%10;
            reversed2=(10*reversed2)+rem2;
            reversed1=reversed1/10;
        }
        if (original==reversed2) {
            return true;
        }else {
            return false;
        }

    }

    public static void main(String[]args){
        System.out.println(isSameAfterReversals(200));
        System.out.println(isSameAfterReversals(526));
    }
}
