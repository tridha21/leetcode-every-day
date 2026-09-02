class Solution {
    public boolean uniformArray(int[] nums1) {
        return true;
    //    There are only two cases:

    //    All numbers have the same parity → just keep every number as it is.
    //         [2, 4, 6] → all even ✅
    //         [1, 3, 5] → all odd ✅
    //         There are both odd and even numbers → subtract a number of the opposite parity.
    //         Even − Odd = Odd
    //         Odd − Even = Odd
    //         So we can make every element odd. ✅
    //         Therefore, for every valid input, the answer is always true

    }
}