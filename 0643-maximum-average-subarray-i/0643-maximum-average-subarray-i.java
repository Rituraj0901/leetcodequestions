class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        double sum = 0;
        double maxi = Integer.MIN_VALUE;
        while(j<n){
            sum += nums[j];

            if(j-i+1 < k) j++;

            else{
                maxi = Math.max(maxi, sum/k);
                sum -= nums[i];
                i++;
                j++;

            }
        }
        return maxi;
    }
}