class Solution {
    public int pivotIndex(int[] nums) {
        // 1.배열 요소의 총합 구하기 
        int sum=0;
        for(int i=0;i<nums.length; i++){
            sum+=nums[i];
        }
        // 2.index포인터를 +1씩 옮기면서 왼쪽합(0)+, 오른쪽합(sum)-
        int leftSum=0, rightSum=sum;
        for(int i=0; i<nums.length; i++){    
            if(i==0) {
                rightSum-=nums[i];
                if(rightSum==leftSum) return i;
                continue;
            }

            rightSum -= nums[i];
            leftSum += nums[i-1];

            if(rightSum==leftSum) return i;
        }

        return -1;
    }
}