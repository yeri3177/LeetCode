class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        // 리턴값 넣을 객체
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        // 매개변수 nums1, nums2를 int[] -> List<Integer>
        List<Integer> l1 = IntStream.of(nums1).boxed().collect(Collectors.toList());
        List<Integer> l2 = IntStream.of(nums2).boxed().collect(Collectors.toList());
        
        // list1 구하기
        for(int i=0; i<l1.size(); i++){
            if(!l2.contains(l1.get(i)) && !list1.contains(l1.get(i))){
                list1.add(l1.get(i));
            }
        }

        // list2 구하기
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
}