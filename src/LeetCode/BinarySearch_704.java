package LeetCode;

public class BinarySearch_704 {
	public int binarySearch(int[] nums, int target){
		
		//Check condition if array is empty or null
		if(nums.length == 0 || nums == null){
			return -1;
		}
		
		//Declare left, right
		int left = 0; int right = nums.length -1;
		
		//Condition holds true when it's sorted i.e. left < right
		while(left <= right){
			
			//Prevent (left + right) overflow
			// equation to calculate mid faster than (left + right)/2
			int mid = left + (right - left)/2;
			
			if(target == nums[mid]){
				return mid;
			}
			else if( target < nums[mid]){
				mid = right - 1;
			}
			else {
				mid = left + 1;
			}
		}
		return -1;
	}
}
