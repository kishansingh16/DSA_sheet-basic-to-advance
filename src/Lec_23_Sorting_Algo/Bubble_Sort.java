package Lec_23_Sorting_Algo;

public class Bubble_Sort {
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swapped = true;
                }

            }
            if (swapped == false) {
                break;
            }
        }
    }
    public static void main(String[] args){
      int arr[]={9,5,3,12,89,0};
      int arr1[]={1,2,3,4,9};
      bubbleSort(arr);

      int n=arr.length;

      for(int i=0;i<n;i++) {
          System.out.print(arr[i] + " ");
      }
        System.out.println();
        bubbleSort(arr1);
        int n1=arr1.length;
        for(int i=0;i<n1;i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
