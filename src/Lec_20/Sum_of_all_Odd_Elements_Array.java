package Lec_20;

public class Sum_of_all_Odd_Elements_Array {
    public static int sumofallOddElementsinArray(int arr[], int n){
        boolean isOdd=arr[n]%2!=0;


        if(n==0) {
            if (isOdd) {
                return arr[n];
            } else {
                return 0;
            }
        }

        if(isOdd){
            return arr[n]+sumofallOddElementsinArray(arr,n-1);
        }else{
            return 0+sumofallOddElementsinArray(arr,n-1);
        }

    }

        public static void main(String[] args){
        int arr[]={5,3,2,0,1};
        int x=arr.length;
        System.out.println(sumofallOddElementsinArray(arr,x-1));
    }
}
