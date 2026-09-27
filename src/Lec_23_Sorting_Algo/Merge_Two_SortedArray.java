package Lec_23_Sorting_Algo;

public class Merge_Two_SortedArray {
    public static int[] Merge(int left[],int right[]){
        int n=left.length;
        int m=right.length;
        int a[]=new int[m+n];
        int i=0;
        int j=0;
        int k=0;

        while(i<n && j<m){
            if(left[i]<right[j]){
                a[k]=left[i];
                i++;
            }else{
                a[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<n){
            a[k]=left[i];
            i++;
            k++;
        }
        while(j<m){
            a[k]=right[j];
            j++;
            k++;
        }

        return a;
    }

    public static void main(String[] args){
        int a[]={1,3,4,7};
        int a1[]={2,5,9,10,12};
        int arr[]= Merge(a,a1);
        int n = arr.length;

        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
