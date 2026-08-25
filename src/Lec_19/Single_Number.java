package Lec_19;

import java.util.HashMap;

public class Single_Number {
    public static int singleNumber(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> hash=new HashMap<>();

        for(int i=0;i<n;i++){
            if(!hash.containsKey(nums[i])){
                hash.put(nums[i],1);
            }else{
                hash.put(nums[i],hash.get(nums[i])+1);
            }
        }

        for(int i=0;i<n;i++){
            if(hash.get(nums[i])==1){
                return nums[i];
            }
        }
        return -1;
    }
    public static void  main(String[] args){
        int nums[]={4,1,2,1,2};
        int nums2[]={2,2,1};
        System.out.println(singleNumber(nums));
    }
}
