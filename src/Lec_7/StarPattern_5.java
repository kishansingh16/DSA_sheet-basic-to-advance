package Lec_7;

//Print Decreasing Number Triangle Pattern
//1 2 3 4 5
//1 2 3 4
//1 2 3
//1 2
//1

public class StarPattern_5 {
    public static  void main(String [] args){
        int n=4;
        for (int i=n;i>0;i--){
            String rows="";
            for(int j=0;j<i;j++){
                rows=rows+(j+1)+" ";
            }
            System.out.println(rows);
        }

// alternative way to solve
        for(int i=0;i<n;i++){
            String rows="";
            for(int j=0;j<(n-i);j++){
                rows=rows+(j+1)+" ";
            }
            System.out.println(rows);
        }
    }
}
