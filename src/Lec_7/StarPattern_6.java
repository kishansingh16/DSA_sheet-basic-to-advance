package Lec_7;

//             *
//           * *
//         * * *
//       * * * *
public class StarPattern_6 {
    public static void main(String[] args){
        int n=4;
       for(int i=0;i<n;i++){

           String rows="";
           //adding empty spaces
           for(int j=0;j<n-(i+1);j++){
             rows=rows+"  ";
           }
           //adding stars
           for (int k=0;k< i+1 ;k++){
               rows= rows+"* ";
           }
           System.out.println(rows);
       }
    }
}
