package com.wenbo.leetCode;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 1;i<nums.length;i++){
            for(int j = 0;j < i; j++ ){
                if(nums[i] + nums[j] == target){
                    int[] arr = {j,i};
                    return arr;
                }
            }
        }
        return null;
    }
}
