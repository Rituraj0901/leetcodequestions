class Solution {
    public int minimumDifference(int[] nums, int k) {
        int mini = Integer.MAX_VALUE;
        int n = nums.length;
        Arrays.sort(nums);
        int i = 0;
        int j = 0;

        while(j<n){
            if(j-i+1<k) j++;
            else if(j-i+1 == k){
                mini = Math.min(mini, nums[j] - nums[i]);
                i++;
                j++;
            }
        }
        return mini;
    }
}