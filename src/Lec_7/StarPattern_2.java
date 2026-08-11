package Lec_7;

//Print a right-angled triangle star pattern of n rows.
//*
//* *
//* * *
//* * * *
//Outer loop (i)  = How many ROWS!
//Inner loop (j)  = How many COLUMNS!
public class StarPattern_2 {
    public static void main(String []args){
        for(int i=0;i<4;i++){
            String rows="";
            for(int j=0;j<=i;j++){
                rows=rows+" *";
            }
            System.out.println(rows);
        }
    }
}
