class Solution {
    public boolean checkDivisibility(int n) {
        int i,s=0,p=1,d,x;
        x=n;
        while(x!=0){
            d=x%10;
            s+=d;
            p*=d;
            x/=10;
        }

        if(n%(s+p)==0) return true;

        return false;
    }
}