package Lec_4;
//write a function that returns the number of negative numbers in an array
public class Arrays_CountNegative {
    public static int CountNegative(int arr[]){
        int count=0;
        int n=arr.length;

            for(int i=0;i<n;i++){
               if(arr[i]<0){
                count++;
               }
           }
               return count;
    }
    public static void main(String [] args){
        int arr[]={20,30,-1,-2,-3,-4,-5,-6,-7,-1};
        System.out.println(CountNegative(arr));
    }
}
