package alex.homework5;

class Solution {
    public int[] runningSum(int[] nums) {
        int[] changedArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int value = 0;
            for (int v = 0; v <= i; v++) {
                value += nums[v];
                changedArr[i] = value;
            }
        }
        return changedArr;
    }
}