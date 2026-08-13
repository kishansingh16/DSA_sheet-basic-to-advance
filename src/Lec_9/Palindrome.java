package Lec_9;

//Given an integer num, return true if num is a palindrome and false otherwise.


public class Palindrome {
    public static boolean isPalindrome(int num){
        if(num<0){ //negative number is not considered as Palindrome
            return false;
        }

        int original=num;
        int reverse=0;

        while(num>0) {
            //to find last digit
            int reminder = num % 10;

            //to get reverse
            reverse = (10 * reverse) + reminder;

            //remove last digit
            num = num / 10;
        }
            if(original == reverse) {
                return true;
            } else {
                return false;
            }
    }
    public static void main(String[] args){
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
    }
}
