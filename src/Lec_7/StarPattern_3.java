package Lec_7;

//Print a Right-Angled Number Pattern.
//1
//1 2
//1 2 3
//1 2 3 4

public class StarPattern_3 {
    public static void main(String[] args){
        int n=5;
        for(int i=0;i<n;i++){
            String rows=" ";
            for(int j=0;j<=i;j++){
                rows=rows+" "+(j+1);
            }
            System.out.println(rows);
        }
    }
}
