class Solution {
    public int equalPairs(int[][] grid) {
        int ans = 0;
        int n = grid[0].length;

        for(int i=0; i<n; i++){
            int[] arr = new int[n]; // 열 배열
            for(int j=0; j<n; j++){
                arr[j] = grid[j][i];
            }

            for(int k=0; k<n; k++){ // 열 고정, 행 배열 하나씩 맞는지 확인 
                // grid[k] : 행 <-> arr : 열 
                if(Arrays.equals(grid[k], arr)) ans++;
            }
        }
        
        return ans;
    }
}