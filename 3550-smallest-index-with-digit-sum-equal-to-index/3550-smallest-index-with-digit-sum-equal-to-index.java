class Solution {
    public int smallestIndex(int[] nums) {
        int i,n;

        n=nums.length;

        for(i=0;i<n;i++){
            if(digitSum(nums[i])==i){
                return i;
            }
        }
        return -1;
    }

    public static int digitSum(int n){
        int s=0,d;

        while(n>0){
            d=n%10;
            s+=d;
            n/=10;
        }

        return s;
    }
}