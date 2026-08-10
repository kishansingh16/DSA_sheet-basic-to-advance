package Lec_4;

//Write a program to find largest element in an array

public class Arrays_LargestNumber {
    public static int findLargest(int a[]){
        int largest=a[0];
        int n=a.length;

        for(int i=0;i<n;i++){
            if(a[i]>largest){
                largest=a[i];
            }
        }
        return largest;
    }
    public static void main(String[]args){
        int arr[]={1,2,3,4,5,-6,7,8,9,12,16,-7};
        int arr1[]={-90,-80,-70,-60};
        System.out.println(findLargest(arr));
        System.out.println(findLargest(arr1));
    }
}
