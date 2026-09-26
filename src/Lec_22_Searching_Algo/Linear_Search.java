package Lec_22_Searching_Algo;

public class Linear_Search {
    public static  int LinearSearch(int arr[],int target){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String []args ){
        int arr[]={0,3,4,78,9};
        int target =10;
        int target1 =9;
        System.out.println(LinearSearch(arr,target));
        System.out.println(LinearSearch(arr,target1));
    }
}
