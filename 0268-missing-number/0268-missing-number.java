class Solution {
    public int missingNumber(int[] nums) {
        int n, i, xor;
        n = nums.length;
        xor = n;

        for (i = 0; i < n; i++) {
            xor ^= i ^ nums[i];
        }

        return xor;
    }
}