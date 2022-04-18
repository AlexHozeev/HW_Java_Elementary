package alex.homework6;

class Solution {
    public int[] decompressRLElist(int[] nums) {

        int freq = 0;
        for (int i = 0; i < nums.length; i += 2) {
            freq += nums[i];
        }
        int output[] = new int[freq];
        int currentIndex = 0;
        for (int i = 1; i < nums.length; i += 2) {
            for (int j = 0; j < nums[i - 1]; j++) {
                output[currentIndex] = nums[i];
                currentIndex++;
            }
        }
        return output;
    }
}