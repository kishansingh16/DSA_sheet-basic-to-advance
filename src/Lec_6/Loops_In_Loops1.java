package Lec_6;

public class Loops_In_Loops1 {
    public static void main(String[] args){
        for(int i=0;i<=3;i++){
            for(int j=0;j<=i;j++){
                System.out.println("Value of i: "+i+" ,"+" Value of j: "+j);
            }
        }
    }
}
