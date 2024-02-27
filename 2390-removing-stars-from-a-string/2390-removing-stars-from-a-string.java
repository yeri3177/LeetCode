class Solution {
    public String removeStars(String s) {
        // 스택을 사용하여 * 제거 
        Stack<Character> stk = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch != '*'){
                stk.push(ch);
            }else{
                if(stk.isEmpty()) return "";
                stk.pop();
            }
        }

        // Stack -> StringBuilder
        StringBuilder sb = new StringBuilder();
        for(char ch : stk){
            sb.append(ch);
        }

        // StringBuilder -> String
        return sb.toString();
    }
}