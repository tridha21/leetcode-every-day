class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        
        List<Integer> in = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                in.add(i);
            }
        }
        return in;
    }
}