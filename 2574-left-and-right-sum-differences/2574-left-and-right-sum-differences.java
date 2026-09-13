 class Solution {
    public int[] leftRightDifference(int[] nums) {

        int n = nums.length;
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {

            int leftSum = 0;
            int rightSum = 0;

            // Calculate left sum
            for (int j = 0; j < i; j++) {
                leftSum += nums[j];
            }

            // Calculate right sum
            for (int j = i + 1; j < n; j++) {
                rightSum += nums[j];
            }

            // Absolute difference
            answer[i] = Math.abs(leftSum - rightSum);
        }

        return answer;
    }
}
