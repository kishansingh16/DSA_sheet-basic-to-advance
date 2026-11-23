package Lec_23_Sorting_Algo;

public class Merge_Sort {
    public static int[] mergeSort(int nums[]){

        if(nums.length<=1){
            return nums;
        }
        return nums;

    }

    public static int[] merge(int left[],int right[]){
        int n=left.length;
        int m=right.length;
        int arr[]=new int[n+m];
        int i=0;
        int j=0;
        int k=0;

        return arr;
    }


    public static void main(String[] args){
        int a[]={14,4,6,1,22,2};
        mergeSort(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] +" ");
        }
    }
}
