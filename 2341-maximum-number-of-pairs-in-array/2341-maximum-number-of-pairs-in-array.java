class Solution {
    public int[] numberOfPairs(int[] nums) {
        HashMap<Integer,Integer> mpp = new HashMap<>();
        int n = nums.length;
        int[] ans = new int[2];

        for(int i=0; i<n; i++){
            mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);
        }
        int pair = 0;
        int left = 0;
        for(int it: mpp.values()){
            pair += it/2;
            left += it%2;
        }
        ans[0] = pair;
        ans[1] = left;

        return ans;
    }
}