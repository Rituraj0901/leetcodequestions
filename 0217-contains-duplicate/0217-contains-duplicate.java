class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> mpp = new HashMap<>();

        int n = nums.length;

        for(int i=0; i<n; i++){
            if(mpp.containsKey(nums[i]))
            return true;
            mpp.put(nums[i], i);
        }
        return false;
    }
}