class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        int i,d1,d2,n;

        n=arr.length;

        Arrays.sort(arr);
        d1=arr[1]-arr[0];

        for(i=2;i<n;i++){
            d2=arr[i]-arr[i-1];
            if(d2!=d1){
                return false;
            }
        }
        return true;
    }
}