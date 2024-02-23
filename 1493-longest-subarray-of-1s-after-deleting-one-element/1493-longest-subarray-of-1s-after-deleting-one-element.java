class Solution {
    public int longestSubarray(int[] nums) {
        int lt=0, rt=0, max=0, zero=0;

        while(rt<nums.length){
            if(nums[rt]==0) zero++;

            while(zero>1){
                if(nums[lt]==0) zero--;
                lt++;
            }

            max=Math.max(max,rt-lt+1);
            rt++;
        }
        return max-1;
    }
}