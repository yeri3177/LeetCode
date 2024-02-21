class Solution {
    public String reverseVowels(String s) {
        // 포인터 
        int p1 = 0; // 인덱스 0부터 시작하는 포인터
        int p2 = s.length()-1; // 마지막 인덱스 포인터 
        char[] ch = s.toCharArray(); // 주어진 s를 문자 배열로 바꾸기 
        String vowels = "aeiouAEIOU"; // 모음의 대소문자 

        while(p1 < p2){
            while(p1 < p2 && vowels.indexOf(ch[p1]) == -1){ 
                p1++; // p1 포인터 이동
            }
            while(p1 < p2 && vowels.indexOf(ch[p2]) == -1){
                p2--;
            }
            
            // 글자 서로 바꾸기 
            char temp = ch[p1];
            ch[p1] = ch[p2];
            ch[p2] = temp;

            p1++;
            p2--;

        }

        return new String(ch);
    }
}