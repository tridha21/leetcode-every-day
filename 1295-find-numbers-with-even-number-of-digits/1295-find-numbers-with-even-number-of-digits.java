class Solution {
    public int findNumbers(int[] nums) {
        int i,d,c,n,x,dc;
        dc=c=0;

        for(i=0;i<nums.length;i++){
            n=nums[i];
            dc=0;
            while(n>0){
                d=n%10;
                dc++;
                n/=10;
            }
            if(dc%2==0){
                c++;
            }
        }
        return c;
    }
}