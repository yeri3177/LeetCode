class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> rad = new LinkedList<>();
        Queue<Integer> dir = new LinkedList<>();
        int length = senate.length();

        // 문자열 senate을 각각의 큐에 담기 
        for(int i=0; i<length; i++){
            if(senate.charAt(i) == 'R'){
                rad.offer(i);
            }else{
                dir.offer(i);
            }
        }

        while (!rad.isEmpty() && !dir.isEmpty()) {
            // 큐 맨앞에 있는 인덱스값 비교
            int r_idx = rad.poll();
            int d_idx = dir.poll();

            // 인덱스값이 더 작으면 큐 끝에 추가 
            if (r_idx < d_idx) {
                rad.offer(r_idx + length);
            } else {
                dir.offer(d_idx + length);
            }
        }

        // 큐에 남아있는 쪽이 승리 
        return rad.isEmpty()? "Dire" : "Radiant";
    }
}