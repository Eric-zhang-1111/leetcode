class Solution {
    public int[] twoSum(int[] nums, int target) {
        int firstIndex;
        int secondIndex;
        for(firstIndex = 0;firstIndex<nums.length;firstIndex++){
            for(secondIndex = firstIndex+1;secondIndex<nums.length;secondIndex++){
                if(nums[secondIndex]+nums[firstIndex]==target){
                    return new int[] {firstIndex,secondIndex};
                }
            }
        }
        return new int[] {-1,-1};
    }
}