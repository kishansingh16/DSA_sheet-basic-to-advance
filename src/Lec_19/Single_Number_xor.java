package Lec_19;

public class Single_Number_xor {
    public static int singleNumber(int[] nums) {

        int xor=0;
        int n=nums.length;

        for(int i=0;i<n;i++){
            xor=xor^nums[i];
        }
        return xor;
    }
    public static void  main(String[] args){
        int nums[]={4,1,2,1,2};
        int nums2[]={2,2,1};
        System.out.println(singleNumber(nums));
        System.out.println(singleNumber(nums2));
    }
}
