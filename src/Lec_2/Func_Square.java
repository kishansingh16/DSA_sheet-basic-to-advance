package Lec_2;

public class Func_Square {
    public static int square(int x){
          int result=x*x;
          return result;
//        return x*x;
    }
    public static void main(String[] args){
        int value=square(2);
        System.out.println(value);


        System.out.println(square(4));
    }
}
