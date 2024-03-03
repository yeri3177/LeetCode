class Solution {
    public int removeDuplicates(int[] nums) { 
        int i=0;
        for(int j=1; j<nums.length; j++){
            if(nums[i]!=nums[j]){ 
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
    /*
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int idx = 0;
        int cnt = 0;

        Arrays.sort(nums);

        for(int i=0; i<len; i++){
            if(nums[i] != nums[idx]){
                idx = i;
            }else{
                nums[i] = 101;
                cnt++;
            }
        }

        Arrays.sort(nums);

        return len-cnt;
    }
    */
}