class Solution {
    public int longestOnes(int[] nums, int k) {
        int start=0; // 시작 포인터
        int end=0; // 끝 포인터
        int zeros=0; // 0 개수 누적

        while(end<nums.length){
            if(nums[end] == 0){
                zeros++;
            }
            end++; // 끝 포인터 이동 

            if(zeros>k){
                if(nums[start] == 0){
                    zeros--;
                }
                start++; // 시작 포인터 이동 
            }
        }
        return end-start; // 인덱스번호 빼기로 개수 세기 
    }
}