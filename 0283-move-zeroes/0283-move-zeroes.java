class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length == 1) return;

        int p1 = 0;
        int p2 = nums.length-1; 

        while(p1 <= p2){
            if(nums[p1] == 0){
                for(int i=p1; i<p2; i++){
                    nums[i] = nums[i+1]; 
                }
                nums[p2--] = 0;
                continue;
            }

            p1++;
        }
    }
}