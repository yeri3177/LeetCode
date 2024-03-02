class Solution {
    // upvote most : Map 사용
    public int romanToInt(String s) {
        Map<Character, Integer> m = new HashMap<>();
        
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);
        
        int ans = 0;
        
        for (int i = 0; i < s.length(); i++) {
            // 해당 요소가 마지막 요소가 아니고, 뒤의 요소보다 작으면 
            if (i < s.length() - 1 && m.get(s.charAt(i)) < m.get(s.charAt(i + 1))) {
                ans -= m.get(s.charAt(i)); // CM이면 -100 + 1000 = 900
            } else {
                ans += m.get(s.charAt(i));
            }
        }
        
        return ans;
    }

    /*
    // my solution
    public int romanToInt(String s) {
        int ans = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'I'){ // 1
                if(i != s.length()-1 && s.charAt(i+1) == 'V'){
                    ans += 4;
                    i++;
                }
                else if(i != s.length()-1 && s.charAt(i+1) == 'X'){
                    ans += 9;
                    i++;
                }
                else {
                    ans += 1;
                }
            }
            else if(s.charAt(i) == 'V'){ // 5
                ans += 5;
            }
            else if(s.charAt(i) == 'X'){ // 10
                if(i != s.length()-1 && s.charAt(i+1) == 'L'){
                    ans += 40;
                    i++;
                }
                else if(i != s.length()-1 && s.charAt(i+1) == 'C'){
                    ans += 90;
                    i++;
                }
                else {
                    ans += 10;
                }
            }
            else if(s.charAt(i) == 'L'){ // 50
                ans += 50;
            }
            else if(s.charAt(i) == 'C'){ // 100
                if(i != s.length()-1 && s.charAt(i+1) == 'D'){
                    ans += 400;
                    i++;
                }
                else if(i != s.length()-1 && s.charAt(i+1) == 'M'){
                    ans += 900;
                    i++;
                }
                else {
                    ans += 100;
                }
            }
            else if(s.charAt(i) == 'D'){ // 500
                ans += 500;
            }
            else if(s.charAt(i) == 'M'){ // 1000
                ans += 1000;
            }
        }

        return ans;
    }
    */
}