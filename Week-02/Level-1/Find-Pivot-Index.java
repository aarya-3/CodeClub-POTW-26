class Solution {
    public int pivotIndex(int[] nums) {
        int[] prefixSum = new int[nums.length];
        int sum = 0;

        for(int i=0; i<nums.length; i++){
            if(i == 0) prefixSum[0] = nums[i];
            else prefixSum[i] = prefixSum[i - 1] + nums[i];
            sum += nums[i];
        }

        for(int i=0; i<nums.length; i++){
            if(prefixSum[i] - nums[i] == sum - prefixSum[i]) return i;
        }

        return -1;
    }
}
