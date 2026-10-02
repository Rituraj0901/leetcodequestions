class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        int count = 0;
        int maxi = 0;

        while(j < n){
            if(nums[j] == 0) count ++;
            
            while(count > k){
                if(nums[i] == 0) count--;
                i++;
            }
            if(count <= k){
                 maxi = Math.max(maxi,j-i+1);
            }
            j++;
        }
        //maxi = Math.max(maxi,j-i);
        return maxi;
    }
}