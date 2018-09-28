package LeetCode;

public class MaximumSubarray_53 {

	public int maxSubArray(int[] nums) {
        int currentMax;
        int totalMax;
        
        currentMax = totalMax = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            totalMax = Math.max(totalMax, currentMax);
        }
        return totalMax;
    }
}
