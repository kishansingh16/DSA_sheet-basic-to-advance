package Lec_7;

//1
//1 0
//1 0 1
//1 0 1 0

public class StarPattern_7 {
    public static void main (String []args){
        int n=5;
        for(int i=0;i<n;i++){

            String row=" ";
            int switchs=1;

            for (int j=0;j<=i;j++){
                row=row+switchs+" ";
                if(switchs==1){
                    switchs=0;
                }
                else {
                    switchs=1;
                }
            }
            System.out.println(row);
        }
    }
}
