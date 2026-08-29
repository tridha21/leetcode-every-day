class Solution {
    public int minSubArrayLen(int target, int[] nums) {
    int high, low,res,s,n,len;
    low=high=s=0;
    res=Integer.MAX_VALUE;
    n=nums.length;

    while(high<n){
        s+=nums[high];
        while(s>=target){
            len=high-low+1;
            res=Math.min(res,len);
            s-=nums[low++];
        }
        high++;
    }
    return res == Integer.MAX_VALUE ? 0 : res;
    }
}