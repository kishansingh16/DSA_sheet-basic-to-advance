package Lec_17;

//Given a binary array nums, return the maximum number of consecutive 1's in the array.
//Input: nums = [1,1,0,1,1,1]
//Output: 3

public class Max_Consecutive_Ones {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int currCount=0;
        int maxCount=0;
        int n=nums.length;

        for(int i=0;i<n;i++){
            if(nums[i]==1){
                currCount++;
            }else{
                if(currCount>maxCount){
                    maxCount=currCount;
                }
                currCount=0;
            }

            if (currCount>maxCount){
                maxCount=currCount;
            }
        }
        return maxCount;

    }
    public static void main(String[] args){
        int []nums={1,1,0,1,1,1};
        int []nums2={1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(nums));
        System.out.println(findMaxConsecutiveOnes(nums2));
    }
}
