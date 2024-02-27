class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

       for (int newbie : asteroids) {
            // 직전 소행성이 우측전진, 새로 들어올 소행성이 좌측전진할 때만 충돌
            while (!stack.isEmpty() && newbie < 0 && stack.peek() > 0) {
                if (-newbie > stack.peek()) {
                    stack.pop();
                } else if (-newbie == stack.peek()) { 
                    stack.pop();
                    newbie = 0;
                } else{
                    newbie = 0;
                }
            }
            if (newbie != 0) stack.push(newbie); 
        }

        //stack -> int[]
        int[] arr = new int[stack.size()];
        for(int i=arr.length-1; i>=0; i--){
            arr[i] = stack.pop();
        }
        
        return arr;
    }
}