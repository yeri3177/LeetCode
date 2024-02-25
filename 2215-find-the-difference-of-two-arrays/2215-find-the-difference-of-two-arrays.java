class Solution {
    /*
    // 361ms(Beats 5.01%) / 45.43MB(Beats 43.25%)
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        // 리턴값 넣을 객체
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        // 매개변수 nums1, nums2를 int[] -> List<Integer>
        List<Integer> l1 = IntStream.of(nums1).boxed().collect(Collectors.toList());
        List<Integer> l2 = IntStream.of(nums2).boxed().collect(Collectors.toList());
        
        // 리턴값 list1 구하기
        for(int i=0; i<l1.size(); i++){
            if(!l2.contains(l1.get(i)) && !list1.contains(l1.get(i))){
                list1.add(l1.get(i));
            }
        }

        // 리턴값 list2 구하기
        for(int i=0; i<l2.size(); i++){
            if(!l1.contains(l2.get(i)) && !list2.contains(l2.get(i))){
                list2.add(l2.get(i));
            }
        }
        
        // answer에 list1, list2 넣기 
        answer.add(list1);
        answer.add(list2);

        return answer;
    }
    */

    // 16ms(Beats 33.24%) / 45.36MB(Beats 61.31%)
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        // 매개변수를 Set에 넣어 중복 제거 
        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());

        Set<Integer> dupSets = new HashSet<>(); // 중복된 값 찾기 
        for(int num : set1) {
            if(set2.contains(num)) {
                dupSets.add(num);
            }
        }
        // 중복 제외하여 유일한 값만 남기기
        set1.removeAll(dupSets); 
        set2.removeAll(dupSets);

        return Arrays.asList(new ArrayList<>(set1), new ArrayList<>(set2));
    }
}