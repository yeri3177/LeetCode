class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        // arr -> HashMap
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x : arr){
			map.put(x, map.getOrDefault(x, 0)+1); 
		}

        // Map -> Set        
        Set<Integer> set = new HashSet<>(map.values());

        // Map과 Set 사이즈 비교 
        if(map.size() == set.size()) return true;

        return false;
    }
}