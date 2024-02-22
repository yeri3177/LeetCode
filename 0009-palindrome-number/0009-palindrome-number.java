class Solution {
    // 내가 한 풀이 방법 : 6ms / 44.22MB
    /*
    public boolean isPalindrome(int x) {
        if(x<0) return false; // x가 음수면 항상 거짓
        if(x==0 || x<10) return true; // x가 0~9면 항상 참 
        
        // 조건 : x는 자리수 2개이상 양수
        
        
        String str = x+""; //int -> string
        char[] arr = str.toCharArray(); //string -> char[]

        int p1=0;
        int p2=arr.length-1;

        while(p1<p2){
            if(arr[p1]==arr[p2]){ // 양끝의 값이 값으면
                // 포인터 이동 
                p1++;
                p2--;
            }else{
                return false;
            }
            
        }

        return true; // 다 통과시 true
    }
    */

    // 참고 내용 : 4ms / 43.72MB
    public boolean isPalindrome(int x) {
        if (x < 0) { // x가 음수면 항상 거짓 
            return false;
        }

        int reversed = 0; // x 거꾸로 뒤집기
        int temp = x; // reversed를 만들기 위한 x의 값 

        while (temp != 0) {
            int digit = (int) (temp % 10); // 일의 자리 구하기 
            reversed = reversed * 10 + digit; // reversed에 기존값 한자리수씩 올리고 일의자리에 digit 추가 
            temp /= 10; // temp를 일의자리 버리기 위해 10 나누기 
        }
        // while 반복문 다 통과하고 나면 reversed 완성됨 
        return (reversed == x); // x와 reversed의 값이 같은지 여부를 return
    }
}