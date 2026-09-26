package Lec_23_Sorting_Algo;

public class Selection_Sort {
    public static void swap(int arr[],int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void SelectionSort(int arr[]){
        int n=arr.length;

        for(int i=0;i<n-1;i++){
            int minimum_index=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minimum_index]){
                    minimum_index=j;
                }
            }
            if(minimum_index!=i){
                swap(arr,i,minimum_index);
            }
        }
    }
    public static void main(String[] args){
        int arr[]={9,2,3,1,5,8};
        SelectionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
