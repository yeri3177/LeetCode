class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max = 0;
        double sum = 0;

        // 최초합 세팅
        for(int i=0; i<k; i++){
            sum += nums[i];
            max = sum;
        }
        
        // 한칸씩 이동
        for(int i=0; i<nums.length-k; i++){
            sum -= nums[i];
            sum += nums[i+k];

            System.out.println(sum);

            // max, sum 비교
            max = Math.max(max, sum);
        }

        return max/k;
    }
}