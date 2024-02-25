class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        Arrays.fill(ans, 1); // ans 배열의 원소값 전부 1로 초기화

        // nums 앞에서부터 곱해주기
        int cur = 1;
        for(int i=0; i<n; i++){
            ans[i] *= cur;
            cur *= nums[i];
        }

        // nums 뒤에서부터 곱해주기
        cur = 1;
        for(int i=n-1; i>=0; i--){
            ans[i] *= cur;
            cur *= nums[i];
        }

        return ans;
    }
}