package Lec_11;

// Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
// The relative order of the elements should be kept the same.

public class Remove_Duplicates_from_Sorted_Array {
    public static int  remove_Duplicate(int a[]){
        int x=0;
        int n=a.length;
        for(int i=0;i<n;i++){
            if(a[i]>a[x]){
                x=x+1;
                a[x]=a[i];
            }
        }
        return x+1;
    }
    public static void main(String[] args){
        int arr[]={0,0,1,1,1,2,2,3,3,4};
        int arr2[]={1,1,2};
        System.out.println(remove_Duplicate(arr));
        System.out.println(remove_Duplicate(arr2));
    }
}
