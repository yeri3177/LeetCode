class Solution {
    public boolean closeStrings(String word1, String word2) {
        // 매개변수 word1, word2를 알파벳 순서대로 개수를 배열에 넣기 
        int arr1[] = new int[26];
        int arr2[] = new int[26];

        for(char c : word1.toCharArray()) {
            arr1[c-'a']++;
        }

        for(char c : word2.toCharArray()) {
            arr2[c-'a']++;
        }

        // 작업1 : 한쪽만 0이면 거짓 
        for(int i = 0; i < 26; i++) {
            if((arr1[i]==0 && arr2[i]!=0) || (arr1[i]!=0 && arr2[i]==0)) {
                return false;
            }
        }

        // 작업2 : 두 배열을 개수로 정렬을 해서 값이 맞지않으면 거짓
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i = 0; i < 26; i++) {
            if(arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }
}