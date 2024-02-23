class Solution {
    public String reverseWords(String s) {
        String answer = "";
        String[] arr = s.trim().split("\\s+"); // 공백제거, 띄어쓰기를 구분자로 배열로 담기

        for (int i = arr.length-1; i>0; i--) {
            answer += arr[i] + " ";
        }

        return answer+arr[0];
    }
}