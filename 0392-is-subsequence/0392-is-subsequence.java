class Solution {
    public boolean isSubsequence(String s, String t) {
       boolean answer = false;
       int p1 = 0,p2 = 0;
       int n = s.length(), m = t.length();

        if(n == 0) return true;
        while(p1<n && p2<m){
            if(s.charAt(p1) == t.charAt(p2)){
                p1++;
            }
            p2++;

            if(p1 == n) answer = true;
        }

        return answer;
    }
}