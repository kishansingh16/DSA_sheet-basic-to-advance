package Lec_2;

public class Func_greet_value {
    public static String greet(String name){
        return name;//return the value to caller
    }
    public static int  greet_value(int value ){
        return value;
    }
    public static  void main(String[] args){
        System.out.println("Hi "+ greet("kishan ") +"No. "+greet_value(1));
    }
}
