package Lec_5;
//write a program to find second largest number


public class Second_Largest_Number {
    public static int secondLargest(int a[]){

        int first_largest=Integer.MIN_VALUE;
        int second_largest=Integer.MIN_VALUE;
        int n=a.length;
        if (n<2){
            return -1;
        }
        for (int i=0;i<n;i++) {
            if (a[i] > first_largest) {
                second_largest = first_largest;
                first_largest = a[i];

            } else if (second_largest<a[i]) {
                second_largest=a[i];
            }
        }
        return second_largest;
    }
    public static void main (String[] args){
        int arr[] = {76, 76, 13, 23, 45, 43};
        int arr1[]={-90,-80,-70,-60};
        System.out.println(secondLargest(arr));
        System.out.println(secondLargest(arr1));
    }
}
