package Lec_7;

// Print Repeated Number Triangle Pattern
//1
//2 2
//3 3 3
//4 4 4 4

public class StarPattern_4 {
    public static void main (String[]args){
        int n=5;
        for(int i=0;i<n;i++){
            String rows=" ";
            for (int j=0;j<=i;j++){
                rows=rows+" "+(i+1);
            }
            System.out.println(rows);
        }
    }
}
