class Solution {
    public int minimumAverageDifference(int[] nums) {
        int n = nums.length;
        long prefix = 0;
        long total =0;
        long min = Long.MAX_VALUE;
        int minIdx = -1;

        for (int i=0; i<n; i++){
            total += nums[i];
        }

        for(int i=0; i<n; i++){
            prefix += nums[i];
            long left = prefix/(i+1);
            long right = 0;
            if (i != n-1){
                right = (total - prefix)/(n - (i + 1));
            }
            long diff = Math.abs(left-right);
            if(diff < min){
                min = diff;
                minIdx = i;
            }
        }
        return minIdx;
    }
}