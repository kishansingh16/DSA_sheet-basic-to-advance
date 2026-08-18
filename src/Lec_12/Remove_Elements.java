package Lec_12;

//Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
//The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.


public class Remove_Elements {
    public static  int removeElement(int []a, int val){

        int x=0;
        int n=a.length;
        for(int i=0;i<n;i++){
            if(a[i]!=val){
                a[i]=a[x];
                x=x+1;
            }
        }
        return x;
    }
    public static void main(String []args){
        int arr[]={0,1,2,4,4,5,6,7,8,8,9};
        int arr1[]={3,2,2,3};
        System.out.println(removeElement(arr,4));
        System.out.println(removeElement(arr1,3));
    }
}
