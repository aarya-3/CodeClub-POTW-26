class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];
        int max = 0;
        int count = 0;

        for (int num : nums) {
            freq[num]++;
            int currentFreq = freq[num];

            if (currentFreq > max) {
                max = currentFreq;
                count = currentFreq;
            } 
            
            else if (currentFreq == max) {
                count += currentFreq;
            }
        }

        return count;
    }
}
