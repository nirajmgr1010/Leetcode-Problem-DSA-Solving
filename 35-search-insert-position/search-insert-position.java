class Solution {
    public int searchInsert(int[] nums, int target) {
          int low = 0;
        int high = nums.length-1; //3
        while(low <= high){  // 0 <= 4 
            int mid = (low + high) / 2; //1 

            if(nums[mid] == target){ // nums[1] 1 == 6 no
                return mid;
            }
            else if(nums[mid] < target){ // 1 < 6
                low = mid+1;
            }
            else{
                high = mid-1;
            }

 
        }
        return low;
    }
}