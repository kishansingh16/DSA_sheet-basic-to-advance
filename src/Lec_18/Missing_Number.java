package Lec_18;

//Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

public class Missing_Number {
    public static int missingNumber(int[] nums) {

        int n=nums.length;
        int totalSum=n *(n+1)/2;
        int sumOfgivenArray=0;

        for(int i=0;i<n;i++){
            sumOfgivenArray=sumOfgivenArray+nums[i];
        }

        int missingValue=totalSum-sumOfgivenArray;

        return missingValue;
    }
    public static  void main (String[] args){
        int nums[]={3,0,1};
        int nums2[]={9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));
        System.out.println(missingNumber(nums2));
    }
}
