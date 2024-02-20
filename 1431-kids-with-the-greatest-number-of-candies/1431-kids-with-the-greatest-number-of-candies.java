class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> answer = new ArrayList<Boolean>();
        int max = 0;

        //최대 캔디수 찾기
        for(int candy : candies){
            max = Math.max(max, candy);
        }
        
        // 캔디배열에 엑스트라캔디 추가
        for(int i=0; i<candies.length; i++){
            answer.add(((candies[i]+extraCandies)>=max)?true:false);
        }

        return answer;
    }
}