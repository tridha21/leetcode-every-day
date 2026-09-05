class Solution {
    public int search(int[] nums, int target) {
        int high, low, mid, n;
        n = nums.length;

        low = 0;
        high = n - 1;

        while (low <= high) {
            mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            } 
            else if (nums[mid] > target) {
                high = mid - 1;
            } 
            else {
                low = mid + 1;
            }
        }
        return -1;
    }
}