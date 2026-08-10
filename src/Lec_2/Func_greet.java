package Lec_2;

public class Func_greet {
    public static void greet(String name) {
        System.out.println("Hi"+" "+name+"!");
    }
    public static void greet_MathValue(int value){
        System.out.println("Hi"+" "+value+"!");
    }
    public static void main (String[] args){
        greet("Kishan No");
        greet_MathValue(1);
    }
}
