class Solution {
    public int maxOperations(int[] nums, int k) {
        int cnt=0; // 리턴값
        int lt=0; // 포인터1 : 인덱스 0
        int rt=nums.length-1; // 포인터2 : 인덱스 마지막

        Arrays.sort(nums); // 배열 정렬 

        while(lt<rt){
            
            if(nums[lt]+nums[rt]>k){
                rt--;
            }else if(nums[lt]+nums[rt]<k){
                lt++;
            }else{
                cnt++;
                rt--;
                lt++;
            }

        }
        return cnt;
    }
}