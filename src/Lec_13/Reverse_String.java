package Lec_13;

//Write a function that reverses a string. The input string is given as an array of characters s.

public class Reverse_String {
    public static String reverseString(char[] s){
        int len=s.length;
        int halflen=len/2;
        for(int i=0;i<halflen;i++){
            //swap(i,len-1-i);
            char temp=s[i];
            s[i]=s[len-(1+i)];
            s[len-(1+i)]= temp;
        }
        return  new String(s);
    }
    public static  void main(String []args){
        String str = "hello";
        char[] s1 = {'H', 'a', 'n', 'n', 'a', 'h'};
        char[] s = str.toCharArray();
        System.out.println(reverseString(s));
        System.out.println(reverseString(s1));
    }
}
