package Lec_22_Searching_Algo;

public class Binary_Search {
    public static int BinarySearch(int[] nums, int target){
        int left=0;
        int right=nums.length-1;

        while(right>=left){
            int mid=(left+right)/2;

            if(target==nums[mid]){
                return mid;
            } else if (target<nums[mid]) {
                right=mid-1;
            }else{
                left=mid+1;
            }
        }

        return -1;
    }
    public static void main(String []args){
        int arr[]={1,3,4,6,8,12};
        int arr1[]={-1,0,3,5,9,12};
        int target=3;
        int target1=9;
        System.out.println(BinarySearch(arr,target));
        System.out.println(BinarySearch(arr1,target1));
    }
}
