class Solution {
    public boolean isPalindrome(int x) {
        int n,d,rev=0;
        n=x;

        while(n>0){
            d=n%10;
            rev=rev*10+d;
            n/=10;
        }
        if(x==rev) return true;
        return false;
    }
}