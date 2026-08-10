package Lec_2;

public class Func_DivBy2and3 {
    public static void Divisible_By2(int num) {
        if (num == 0) {
            System.out.println("invalid input");
        } else if (num % 2 == 0) {
            System.out.println("divisible by 2");
        } else {
            System.out.println("not divisible by 2");
        }
    }
    public static String Divisible_By3(int num) {
        if (num == 0) {
            return "invalid input";
        } else if (num % 3 == 0) {
            return "divisible by 3";
        } else {
            return "not divisible by 3";
        }
    }
    public static void main(String[] args){
        Divisible_By2(4);
        Divisible_By2(3);
        Divisible_By2(0);
        System.out.println(Divisible_By3(0));
        System.out.println(Divisible_By3(3));
        System.out.println(Divisible_By3(5));

    }
}
