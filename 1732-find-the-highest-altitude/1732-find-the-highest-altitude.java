class Solution {
    /*
    // [1]
    public int largestAltitude(int[] gain) {
        int[] altitudes = new int[gain.length+1]; // 고도 배열 
        altitudes[0]=0;
        int max=0;
        
        for(int i=0; i<gain.length; i++){
            altitudes[i+1]=altitudes[i]+gain[i];
            max=Math.max(max, altitudes[i+1]);
        }
        
        //System.out.println(Arrays.toString(altitudes));
        return max;
    }
    */
    // [2]
    public int largestAltitude(int[] gain) {
        int max=0;
        int temp=0;
        
        for(int i=0; i<gain.length; i++){
            temp+=gain[i];
            max=Math.max(max, temp);
        }
        
        //System.out.println(Arrays.toString(altitudes));
        return max;
    }
}