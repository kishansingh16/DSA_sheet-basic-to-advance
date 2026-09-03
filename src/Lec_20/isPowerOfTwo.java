package Lec_20;

public class isPowerOfTwo {
    public static boolean isPowerOfTwo(int n){

        if(n==1){
            return true;
        } else if ((n%2!=0)||n<1) {
            return false;
        }

        return isPowerOfTwo(n/2);
    }
    public static void main(String[] args){
        int n=8;
        int n1=3;
        int n2=1;
        System.out.println(isPowerOfTwo(n));
        System.out.println(isPowerOfTwo(n1));
        System.out.println(isPowerOfTwo(n2));
    }
}
