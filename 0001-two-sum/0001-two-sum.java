class Solution {
    public int[] twoSum(int[] nums, int target) {

        for(int i=0; i<nums.length-1; i++){ // 0부터 nums길이-1까지 반복
            for(int j=i+1; j<nums.length; j++){ // 1부터 num길이까지 반복
                if(nums[i]+nums[j]==target){ // target 값이 맞으면 
                    return new int[]{i,j}; // 인덱스 번호 리턴 
                }
            }
        }

        return new int[]{0, 0}; // target 못찾을시
    }
}