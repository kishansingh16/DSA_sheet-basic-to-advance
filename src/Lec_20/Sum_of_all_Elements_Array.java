package Lec_20;

public  class Sum_of_all_Elements_Array {
    public static int sumofallElementsinArray(int arr[], int n){


        if(n==0){
            return arr[0];
        }

        return arr[n]+sumofallElementsinArray(arr,n-1);
    }
    public static void main(String[] args){
        int arr[]={5,3,2,0,1};
        int x=arr.length;
        System.out.println(sumofallElementsinArray(arr,x-1));
    }
}
