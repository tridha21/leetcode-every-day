class Solution {
    public int sumOfSquares(int[] nums) {
        int i,n,s=0;
        n=nums.length;

        for(i=1;i<=n;i++){
            if(n%i==0){
                s+=nums[i-1]*nums[i-1];
            }
        }
        return s;
    }
}