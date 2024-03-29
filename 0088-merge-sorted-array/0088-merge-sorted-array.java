class Solution {
    /*
    // 내가 한 방법 
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        // nums1의 0 요소 자리에 nums2의 요소 넣기 
        for(int i=0, j=0; i<nums1.length; i++){
            if(nums1[i] == 0){
                nums1[i] = nums2[j++];
            }

            if(j==n) break;
        }

        // 배열 정렬
        Arrays.sort(nums1);
    }
    */

    // upvote most
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int j = 0, i = m; j < n; j++) {   // i = m !!! 
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
    }
}