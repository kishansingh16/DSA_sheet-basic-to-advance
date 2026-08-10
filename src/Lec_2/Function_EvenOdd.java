package Lec_2;

public class Function_EvenOdd {
    public static void isEvenOdd(int num){
        int rem=num%2;
        if(rem==0){
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }
    }
    public static void main(String [] args){
        isEvenOdd(8);
    }
}
