package Lec_7;

//print outline of square
//* * * *
//*     *
//*     *
//* * * *

public class StarPattern_8 {
    public static void main(String[] args){
        int n=5;
        for (int i=0;i<n;i++){
            String rows="";
            for (int j=0;j<n;j++){
                if (i==0||j==0||n-i==1||n-j==1){
                    rows=rows+"* ";
                }else {
                   rows=rows+"  ";
                }
            }
            System.out.println(rows);
        }

    }
}
