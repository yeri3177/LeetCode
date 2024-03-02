class Solution {
    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        int cnt = 0;

        for(int i=0; i<length; i++){
            if(nums[i] == val) {
                nums[i] = 101;
                cnt++;
            }
        }

        Arrays.sort(nums);

        return length-cnt;
    }
}