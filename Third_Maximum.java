class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int count=1;
        int pre=nums[nums.length-1];
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]!=pre){
                count++;
                pre=nums[i];
            }
            if(count==3){
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
}
