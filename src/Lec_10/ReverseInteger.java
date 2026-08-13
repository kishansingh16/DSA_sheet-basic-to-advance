package Lec_10;

// Given a signed 32-bit integer x, return x with its digits reversed.
// If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.


public class ReverseInteger {
    public static int reverse_Integer(int num){
        if (num==0){
            return 0;
        }


        int original=num;
        num = Math.abs(num);

        long reverse=0;

        while (num>0){
          long rem=num%10;
          reverse=(10*reverse)+rem;
          num=num/10;
        }
        long limit=(long)Math.pow(2,31);
        if(reverse< -limit || reverse > limit-1){
            return 0;
        }

        if (reverse<0){
            reverse=-reverse;
        }
        return (int )reverse;

    }
    public static void main (String[] args){
        System.out.println(reverse_Integer(123));
        System.out.println(reverse_Integer(-123));
        System.out.println(reverse_Integer(1563847412));
        System.out.println(reverse_Integer(120));

    }
}
