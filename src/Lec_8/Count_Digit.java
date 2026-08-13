package Lec_8;

public class Count_Digit {
    public static int digit(int n) {

        int count = 0;

        //Conveting Negative to Positive
        n=Math.abs(n);
        if (n == 0) {
            return 1;
        } else {
            while (n > 0) {
                n = n / 10;
                count++;
            }
            return count;
        }
    }
    public static void main(String[] args){
        System.out.println(digit(-1234));
 //       0 before an integer literal -> octal
        //  Octal number 012345 -> decimal value 5349

    }
}
