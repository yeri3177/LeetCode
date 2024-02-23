class Solution {
    public int maxVowels(String s, int k) {
        int max=0; // 최대 모음 개수 
        int cnt=0; // k길이만큼의 모음 개수 
        char[] ch = s.toCharArray(); // string -> char[]
        String vowels = "aeiou"; // 영어 모음 

        // 최초 cnt 개수 
        for(int i=0; i<k; i++){
            if(vowels.indexOf(ch[i]) != -1){
                cnt++;
            }
        }

        max = cnt; // max에 최초 cnt 넣기 

        for(int i=0; i<ch.length-k; i++){
            // 앞에꺼 모음이면 cnt-1
            if(vowels.indexOf(ch[i]) != -1){
                //System.out.println("ch[i] : "+i);
                cnt--;
            }

            // 뒤에꺼 모음이면 cnt+1
            if(vowels.indexOf(ch[i+k]) != -1){
                //System.out.println("ch[i+k] : "+(i+k));
                cnt++;
            }

            max = Math.max(max, cnt); // 최대값인지 비교
        }
        
        return max;
    }
}