class Solution {
    public String decodeString(String s) {
        StringBuilder sb = new StringBuilder(s);
        Stack<Character> stack=new Stack<>();
        
        while(sb.indexOf("[") != -1){
            // s의 뒤에서 부터 [ 인덱스 찾기, [ 인덱스 찾기 
            int frontIdx = sb.lastIndexOf("[");
            int backIdx = sb.indexOf("]", frontIdx);
            //System.out.println(frontIdx + " : " + backIdx);

            // [] 앞 숫자 찾기 -> 일의 자리가 아닐수 있음
            // char -> int : Character.getNumericValue(c)
            // char, int ? : Character.isDigit(c)
            //int digit = Character.isDigit(sb.charAt(frontIdx-1)) ? Character.getNumericValue(sb.charAt(frontIdx-1)) : 1;
            StringBuilder sbDigit = new StringBuilder("");
            for(int i=frontIdx-1; i>=0; i--){
                if(Character.isDigit(sb.charAt(i))){
                    sbDigit.append(sb.charAt(i));
                }else{
                    break;
                }
            }
            int digit = Integer.parseInt(sbDigit.reverse().toString());
            int digitCnt = String.valueOf(digit).length();
            //System.out.println(digit + " : " + digit);
            //System.out.println("숫자 자리수 : " + String.valueOf(digit).length());

            // 문자열로 풀기
            String word = sb.substring(frontIdx+1, backIdx).repeat(digit);
            System.out.println("word : " + word);

            // 기존문자 찾기 
            //String preWord = sb.substring(frontIdx-1, backIdx+1);
            //System.out.println(preWord);

            // 문자열 치환 : sb.replace(int index1, int index2, String str);
            // 숫자 자리수 : String.valueOf(digit).length();

            sb = sb.replace(frontIdx-digitCnt, backIdx+1, word);
            //System.out.println("sb : " + sb); // 3[a]bcbc

            if(sb.indexOf("[") == -1) break;
        }

        return sb.toString();
    }
}