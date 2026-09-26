package Lec_23_Sorting_Algo;

public class Insertion_Sort {
    public static void  InsertionSort(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
           int current=arr[i];
           int previous=i-1;
           while(previous>=0 && arr[previous]>current ){
               arr[previous+1]=arr[previous];
               previous=previous-1;
           }
           arr[previous+1]=current;
        }
    }

    public static void main(String[] args) {
        int arr[] = {9, 2, 3, 1, 5, 8};
        InsertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
