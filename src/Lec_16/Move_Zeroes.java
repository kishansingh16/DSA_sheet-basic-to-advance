package Lec_16;

//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//Note that you must do this in-place without making a copy of the array.

public class Move_Zeroes {
    public static void moveZeroes(int[] nums) {
        int x=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if (nums[i]!=0){
                nums[x]=nums[i];
                x++;
            }
        }
        for(int i=x;i<n;i++){
            nums[i]=0;
        }

    }
    public static void main(String[] args){
        int []nums={0,1,0,3,12};
        int []nums2={0};

        moveZeroes(nums);
        moveZeroes(nums2);

        for (int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
        }
        System.out.println();

        for (int i=0;i<nums2.length;i++){
            System.out.print(nums2[i]);
        }
    }
}
