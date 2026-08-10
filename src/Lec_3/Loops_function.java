package Lec_3;

public class Loops_function {
    public static void greet(String name){
        System.out.println(name);
    }
    public static void main(String[] args){
        for ( int i=0;i<10;i++){
            greet("kishan "+i);
        }

    }
}
