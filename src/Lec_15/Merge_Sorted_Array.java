package Lec_15;

//You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
// representing the number of elements in nums1 and nums2 respectively.
//
//Merge nums1 and nums2 into a single array sorted in non-decreasing order.
//
//The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
// To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged,
// and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

import java.util.Arrays;

public class Merge_Sorted_Array {
    //alternative Method
    public static void merge_alternative_method(int[] nums1, int m, int[] nums2, int n) {


        int p1=m-1;
        int p2=n-1;
        for(int i=m+n-1; i>=0; i--){
            if(p2<0 ||(p1>=0 && nums1[p1]>nums2[p2])){
                nums1[i]=nums1[p1];
                p1--;
            }else{
                nums1[i]=nums2[p2];
                p2--;
            }
        }

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] nums1copy = Arrays.copyOf(nums1, nums1.length);
        int p1=0;
        int p2=0;
        for(int i=0; i<m+n; i++){
            if(p2>=n||(p1<m && nums1copy[p1]<nums2[p2])){
                nums1[i]=nums1copy[p1];
                p1++;
            }else{
                nums1[i]=nums2[p2];
                p2++;
            }
        }

    }
    public static  void main(String[] args){
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int []nums3 = {1};
        int m = 3;
        int m1=1;

        int[] nums2 = {2, 5, 6};
        int []nums4={};
        int n = 3;
        int n1=0;
        merge_alternative_method(nums3, m1, nums4, n1);
        merge(nums1, m, nums2, n);

        System.out.print("Time complexity O(M+N)  Space : O(m+n)");
        for (int i = 0; i < nums3.length; i++) {
            System.out.println(nums3[i] + " ");
        }

        System.out.print("Time complexity O(M+N) Space : O(1):: ");
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }
    }
}
