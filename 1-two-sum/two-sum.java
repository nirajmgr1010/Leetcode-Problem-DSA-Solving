class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] arr = nums;
        int target1 = target;
     //submitting
        int i =0;
        while(i<arr.length-1){
            for(int j=i+1; j<=arr.length-1; j++){
                if(arr[i] + arr[j] == target1){
                    return new int[]{i,j};
                }
            }
            i++;
        }

        return new int[]{-1,-1};
    }
}