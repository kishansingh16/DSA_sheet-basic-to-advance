package Lec_7;
//Print a Square Star Pattern (n × n)
//* * * *
//* * * *
//* * * *
//* * * *
//Outer loop (i)  = How many ROWS!
//Inner loop (j)  = How many COLUMNS!
public class StarPattern_1 {
    public static void main(String [] args){

        int n=6;

        for (int i=0;i<n;i++){
            String rows=" ";
            for(int j=0;j<n;j++){
                rows= rows+"*";
            }
            System.out.println(rows);
        }
    }
}
