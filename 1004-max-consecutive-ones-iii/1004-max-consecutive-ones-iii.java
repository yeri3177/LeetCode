class Solution {
    public int longestOnes(int[] nums, int k) {
        int lt=0, rt=0, max=0, zeroCnt=0;

        while(rt<nums.length){
            if(nums[rt]==0){
                zeroCnt++;
            }

            while(zeroCnt>k){
                if(nums[lt]==0){
                    zeroCnt--;
                }
                lt++;
            }

            max=Math.max(max,rt-lt+1);
            rt++;
        }

        return max;
    }
}